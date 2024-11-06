/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import java.util.*;
import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.Persona.Transcript;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    public static String getGrade(float grade){
        if(grade<=4.0 && grade>3.7)
        {
            return "A";
        }
        if(grade<=3.7 && grade>3.3)
        {
            return "A-";
        }
        if(grade<=3.3 && grade>3.0)
        {
            return "B+";
        }
        if(grade<=3.0 && grade>2.7)
        {
            return "B";
        }
        if(grade<=2.7 && grade>2.3)
        {
            return "B-";
        }
        if(grade<=2.3 && grade>2.0)
        {
            return "C+";
        }
        if(grade<=2.0 && grade>1.7)
        {
            return "C";
        }
        if(grade<=1.7 && grade>1.3)
        {
            return "C-";
        }
        if(grade<=1.3 && grade>1.0)
        {
            return "D+";
        }
        if(grade<=1.0 && grade>0.7)
        {
            return "D";
        }
        if(grade<=0.7 && grade>0.0)
        {
            return "D-";
        }
        return "F";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();

        Department department = new Department("Information Systems");
        CourseCatalog coursecatalog = department.getCourseCatalog();        
        CourseSchedule courseschedule = department.newCourseSchedule("Spring 2025");

        PersonDirectory pd = department.getPersonDirectory();
        StudentDirectory sd = department.getStudentDirectory();
        FacultyDirectory facultydirectory = department.getFacultyDirectory();
        
        
        Course[] coursesList = {
            new Course("AED", "Info 5100", 4),
            new Course("DMDD", "DMDD 6200", 4),
            new Course("Program Structire and Algorithm", "6205", 4),
            new Course("Web Design", "1234", 4),
            new Course("Web Tools and Methods", "5678", 4),
            new Course("Objet-oriented Programming", "9000", 4),
            new Course("ENCP", "6000", 1),
            new Course("Web Design", "5678", 4),
            new Course("Big Data", "5555", 4),
            new Course("Cloud Computing", "8888", 4)
        };
        
        //Create 10 teachers
        for (int i = 1; i <= 10; i++) {
            int baseNumber = 0111111;
            int idNumber = 0111111 + i + 100;
            Person faculty = new Person(String.format("%07d", idNumber));
            FacultyProfile teacher = facultydirectory.newFacultyProfile(faculty);
        }

        ArrayList<FacultyProfile> teacherList =  facultydirectory.getTeacherList();
        for(int j = 0; j <coursesList.length; j++){
            Course course = coursecatalog.newCourse(coursesList[j].getCourseName(), coursesList[j].getCOurseNumber(), coursesList[j].getCredits());
            String no = coursesList[j].getCOurseNumber();
            CourseOffer courseoffer = courseschedule.newCourseOffer(coursesList[j].getCOurseNumber());
            if (courseoffer==null)return;
            courseoffer.generatSeats(20);
            FacultyProfile assignedTeacher = teacherList.get(j % teacherList.size()); 
            courseoffer.AssignAsTeacher(assignedTeacher);
        }

          List<String> grades = new ArrayList<>();
        grades.add("3.0");
        grades.add("4.0");
        grades.add("2.0");

         // Create 10 students
        for (int i = 1; i <= 10; i++) {
            int baseNumber = 112300;
            int idNumber = baseNumber + i + 100;
            Person studentPerson = new Person(String.format("%07d", idNumber));
            StudentProfile studentProfile = sd.newStudentProfile(studentPerson);

            CourseLoad courseload = studentProfile.newCourseLoad("Spring 2025");
            //Enroll students in random courses
            for (int j = 0; j < 3; j++) { // Enroll students in 5 random elective courses
                int randomCourseIndex = random.nextInt(coursesList.length);
                Course electiveCourse = coursesList[randomCourseIndex];
                CourseOffer courseOffer = courseschedule.getCourseOfferByNumber(electiveCourse.getCOurseNumber());
                if (courseOffer != null) {
                    SeatAssignment seatAssignment = courseload.registerStudentInClass(courseOffer);
                    String selectedGrade = grades.get(random.nextInt(grades.size()));
                    seatAssignment.setGrade(Float.parseFloat(selectedGrade));
                }
            }
        }

          for(StudentProfile sp: sd.getStudentList()){
            double totalCredits = 0.0;
            double totalGradePoints = 0.0;
            double sum = 0.0;
            Transcript transcript = sp.getTranscript();
            System.out.println("StudentID:" + sp.getStudentID());
            ArrayList<SeatAssignment> courseList = sp.getCourseList();
        
            for(SeatAssignment c: courseList){
                Course course = c.getAssociatedCourse();
                String courseName = course.getCourseName();
                String facultyID = c.getCourseOffer().getFacultyProfile().getFacultyID();
                float grade = c.getGrade();
                int creditHours = c.getCreditHours();
                int price = c.getAssociatedCourse().getCoursePrice();
                System.out.println("Course Name:" + courseName + " | " 
                + "Professor: " + facultyID + " | " 
                + "Grade" + grade + " | "
                + "Credit Hours" + creditHours + " | "
                + "price " + price + " | "
            );
                totalCredits += c.getCreditHours();
                totalGradePoints += c.getGrade();
                sum += price;
            }
            double finalGradePoint =  totalGradePoints * 4;
            double gpa = finalGradePoint / totalCredits;
            System.out.println("Student AVG GPA : " + String.format("%.2f", gpa));
            System.out.println("Total tution : " + String.format("%.2f", sum));
            System.out.println("...................................................................");
        }
       
        int total = department.calculateRevenuesBySemester("Spring 2025");
        System.out.println("Total: " + total );
    }

}

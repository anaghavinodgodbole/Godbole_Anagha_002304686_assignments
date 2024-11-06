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
       
        int total = department.calculateRevenuesBySemester("Spring 2025");
        System.out.println("Total: " + total );
    }

}

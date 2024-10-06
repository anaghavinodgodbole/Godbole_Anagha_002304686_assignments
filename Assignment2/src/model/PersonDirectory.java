/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class PersonDirectory {
     private ArrayList<Person> personList;
    
    public PersonDirectory(){
        this.personList = new ArrayList<Person>();
    }
    
    public ArrayList<Person> getPersonList(){
        return personList;
    }
    
    public void setPersonList(ArrayList<Person> people){
        this.personList = people; 
    }
    
    public Person addPerson(){
        Person p = new Person();
        personList.add(p);
        return p;
    }
    
    public void deletePerson(Person person){
        personList.remove(person);
    }
    
    public Person searchPerson(String searchText){
        System.out.println("text is" +  searchText);
        for(Person a : personList){
          System.out.println("a is" + a);
          Address a1 = a.getHomeAddress();
          Address a2 = a.getWorkAddress();
          System.out.println(a1.getStreetAddress());
          System.out.println(a2.getStreetAddress());
          
       }
        for(Person p: personList){
            System.out.println("p is" + p);
            Address homeAddr = p.getHomeAddress();
            Address workAddr = p.getWorkAddress();
            System.out.println(p.getFirstName());
            System.out.println(p.getFirstName().toLowerCase().contains(searchText.toLowerCase()));
            System.out.println(p.getLastName().contains(searchText));
            
            searchText = searchText.toLowerCase();
            if(p.getFirstName().toLowerCase().contains(searchText) || p.getLastName().toLowerCase().contains(searchText) 
                    || homeAddr.getStreetAddress().toLowerCase().contains(searchText) || workAddr.getStreetAddress().toLowerCase().contains(searchText)){
                System.out.println("p is" + p);
                return p; 
            }
        }
        return null;
    }
}

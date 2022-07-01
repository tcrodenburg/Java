/*
Tanner Rodenburg
Assignment 6.1
Create a class named Student that includes String data fields titled firstName and lastName,
and an integer field titled studentID. Create a constructor that requires two String parameters
and one integer parameter to populate the firstName, lastName, and studentID fields. Create a LinkedList
of 20 Student objects each having different first names, last names, and student IDs. Print your LinkedList, first
in the order your items were placed onto the LinkedList and then in reverse order. Save your files as Student.java and ClassRoster.java.
Bellevue University
2/14/2021
 */

import java.util.Collections;
import java.util.LinkedList;

public class ClassRoster {
    public static void main(String[] args) {

        //add 20 new student instances
        Student s1 = new Student("Ken", "Shamrock", 1111);
        Student s2 = new Student("Steve", "Austin", 1112);
        Student s3 = new Student("Dude", "Love", 1345);
        Student s4 = new Student("Cactus", "Jack", 1567);
        Student s5 = new Student("Paul", "Bearer", 1897);
        Student s6 = new Student("Shawn", "Michaels", 9906);
        Student s7 = new Student("Hunter", "Helmsley", 1001);
        Student s8 = new Student("Dusty", "Rhodes", 1003);
        Student s9 = new Student("Hulk", "Hogan", 4509);
        Student s10 = new Student("Doink", "Daclown", 4325);
        Student s11 = new Student("Randy", "Orton", 7897);
        Student s12 = new Student("John", "Cena", 6566);
        Student s13 = new Student("Razor", "Ramon", 9807);
        Student s14 = new Student("Kevin", "Nash", 3214);
        Student s15 = new Student("Jerry", "Lawler", 2222);
        Student s16 = new Student("Jim", "Ross", 3213);
        Student s17 = new Student("Dewayne", "Johnson", 6000);
        Student s18 = new Student("Brock", "Lesnar", 2356);
        Student s19 = new Student("Bret", "Hart", 1299);
        Student s20 = new Student("Owen", "Hart", 5555);

        //create a new Linked list
        LinkedList<Student> list = new LinkedList<Student>();

        //add each student object to the list
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);
        list.add(s9);
        list.add(s10);
        list.add(s11);
        list.add(s12);
        list.add(s13);
        list.add(s14);
        list.add(s15);
        list.add(s16);
        list.add(s17);
        list.add(s18);
        list.add(s19);
        list.add(s20);


        //print the original list
        System.out.println("Original Student List:");
        for (Student s : list) {
            System.out.println("First Name: " + s.getFirstName() + " | Last Name: " + s.getLastName() + " | Student Id: " + s.getStudentID());
        }

        //reverse list using the Collections library
        Collections.reverse(list);

        //print the list in reversed order
        System.out.println("\n\n\nReversed Student List:");
        for (Student s : list) {
            System.out.println("First Name: " + s.getFirstName() + " | Last Name: " + s.getLastName() + " | Student Id: " + s.getStudentID());
        }

    } // main
} // class


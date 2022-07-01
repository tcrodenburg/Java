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


public class Student {

    //problem variables
    private String firstName;
    private String lastName;
    private int studentID;

    //create a constructor
    public Student(String firstName, String lastName, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }

    //set method for first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //set method for last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //set method for student ID
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    //return method for first name
    public String getFirstName() {
        return firstName;
    }

    //return method for last name
    public String getLastName() {
        return lastName;
    }

    //return method for student ID
    public int getStudentID() {
        return studentID;
    }

} // class

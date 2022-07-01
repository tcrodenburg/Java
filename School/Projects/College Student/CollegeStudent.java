/*
Tanner Rodenburg
Assignment 2.2
Create a CollegeStudent class.  This class will contain data fields that hold a student's first name, last name, enrollment date, and projected graduation date,
using the Local Date class for each date.  Provide get() and set() methods for each field.  Also provide a constructor that requires first and last names
and enrollment date, and sets the project graduation date to exactly four years after enrolment.  Save the class as CollegeStudent.java.
Bellevue University
1/17/2021
 */

import java.time.LocalDate;

public class CollegeStudent {

    //variables assigned in problem
    private String firstName;
    private String lastName;
    private LocalDate enrollmentDate;
    private int graduationDate = 4;

    //constructor class
    CollegeStudent(String firstName, String lastName, LocalDate enrollmentDate) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEnrollmentDate(enrollmentDate);
    }

    //start of getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public int getGraduationDate() {
        return graduationDate;
    }
    //end of getters

    //start of setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }
    //end of getters
}




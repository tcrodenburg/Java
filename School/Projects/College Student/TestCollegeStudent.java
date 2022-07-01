/*
Tanner Rodenburg
Assignment 2.2
Create an interactive application that prompts the user for data for two CollegeStudent objects.
Prompt the user for first name, last name, enrollment month, enrollment day, and enrollment year for each CollegeStudent, and then instantiate the objects.
Display all the values, including the projected graduation dates.  Save the application as TestCollegeStudent.java
Bellevue University
1/17/2021
 */

import java.time.LocalDate;
import java.util.Scanner;


public class TestCollegeStudent {
    public static void main(String[] args) {

        //variables for user input
        String firstName;
        String lastName;
        int enrollmentMonth;
        int enrollmentDay;
        int enrollmentYear;
        LocalDate enrollmentDate;

        //new scanner
        Scanner scanner = new Scanner(System.in);

        //student one input
        System.out.println("Student one");
        System.out.println("Please enter in the student's first name: ");
        firstName = scanner.next();

        System.out.println("Please enter in the student's last name: ");
        lastName = scanner.next();

        System.out.println("Please enter in the student's month of enrollment: ");
        enrollmentMonth = scanner.nextInt();

        System.out.println("Please enter in the student's day of enrollment: ");
        enrollmentDay = scanner.nextInt();

        System.out.println("Please enter in the student's year of enrollment: ");
        enrollmentYear = scanner.nextInt();

        //transform into date
        enrollmentDate = LocalDate.of(enrollmentYear, enrollmentMonth, enrollmentDay);

        //sets first student to constructor
        CollegeStudent collegeStudent1 = new CollegeStudent(firstName, lastName, enrollmentDate);

        //student two input
        System.out.println("\nStudent two");
        System.out.println("Please enter in the student's first name: ");
        firstName = scanner.next();

        System.out.println("Please enter in the student's last name: ");
        lastName = scanner.next();

        System.out.println("Please enter in the student's month of enrollment: ");
        enrollmentMonth = scanner.nextInt();

        System.out.println("Please enter in the student's day of enrollment: ");
        enrollmentDay = scanner.nextInt();

        System.out.println("Please enter in the student's year of enrollment: ");
        enrollmentYear = scanner.nextInt();

        //transform into date
        enrollmentDate = LocalDate.of(enrollmentYear, enrollmentMonth, enrollmentDay);

        //sets first student to constructor
        CollegeStudent collegeStudent2 = new CollegeStudent(firstName, lastName, enrollmentDate);

        //outputs each student for test mode
        System.out.println("\nStudent test one is: \n" + collegeStudent1.getFirstName() + " " + collegeStudent1.getLastName() +
                "\nEnrollment date: " + collegeStudent1.getEnrollmentDate() + "\nGraduation date: " +
                collegeStudent1.getEnrollmentDate().plusYears(collegeStudent1.getGraduationDate()));

        System.out.println("\nStudent test two is: \n" + collegeStudent2.getFirstName() + " " + collegeStudent2.getLastName() +
                "\nEnrollment date: " + collegeStudent2.getEnrollmentDate() + "\nGraduation date: " +
                collegeStudent2.getEnrollmentDate().plusYears(collegeStudent2.getGraduationDate()));

    }

}

/*
Tanner Rodenburg
Assignment 2.1
Create a public class named Exponent.  Inside the main method of this class, obtain a double input using a dialog box.
Pass the input value to a non-static method that returns the square value of the parameter.
Display the return value of the method using an output dialog.
Next pass the input value to a non-static method that returns the cube of the parameter.
Display the return value of the method using an output dialog.  Save the class as Exponent.java.
Bellevue University
1/16/2021
 */

import javax.swing.*;
import java.lang.Math;

public class Exponent {
    public static void main(String[] args) {

        //defined variables
        String stringInput;
        double parsedInput;
        double squared;
        double cubed;

        //number input dialog
        stringInput = JOptionPane.showInputDialog(
                null,
                "Please enter in your number: ",
                "Enter Input",
                JOptionPane.PLAIN_MESSAGE
        );

        //convert string dialog to double for calculations
        parsedInput = Double.parseDouble(stringInput);

        //new instance of calculate class
        Calculate calculate = new Calculate();
        squared = calculate.squared(parsedInput);
        cubed = calculate.cubed(parsedInput);

        //output dialog
        calculate.dialogSquared(squared);
        calculate.dialogCubed(cubed);
    } //Main
}//end Exponent

class Calculate {
    //return squared
    void dialogSquared(double squared) {
        JOptionPane.showMessageDialog(
                null,
                "Your number squared is: " + squared,
                "Square Output",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    //returned cubed
    void dialogCubed(double cubed) {
        JOptionPane.showMessageDialog(
                null,
                "Your number cubed is: " + cubed,
                "Square Output",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    double squared(double parsedInput) {
        return Math.pow(parsedInput, 2);
    }

    double cubed(double parsedInput) {
        return Math.pow(parsedInput, 3);
    }
}//end Calculate


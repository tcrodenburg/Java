/*
Tanner Rodenburg
Create a class that calculates and displays the conversion of an entered number of dollars into currency denominations
 - 100s, 50s, 20s, 10s, 5s, and 1s. Obtain all inputs and display all outputs using dialog boxes. 
Save the class as Dollars.Java. 
1/19/2021
Bellevue University
 */


import javax.swing.*;

public class Dollars {
    public static void main(String[] args) {

        String billInputString;
        int billConversion;
        int hundreds, fifties, twenties, tens, fives, ones, remainder;

        billInputString = JOptionPane.showInputDialog(
                null,
                "Please enter in your dollar amount: ");


        billConversion = Integer.parseInt(billInputString);

        remainder = billConversion;

        hundreds = remainder / 100;
        remainder = (remainder % 100);

        fifties = remainder / 50;
        remainder = (remainder % 50);

        twenties = remainder / 20;
        remainder = (remainder % 20);

        tens = remainder / 10;
        remainder = (remainder % 10);

        fives = remainder / 5;
        remainder = (remainder % 5);

        ones = remainder;


        JOptionPane.showMessageDialog(
                null,
                "Your total output is: " +
                        "\nHundreds = " + hundreds +
                        "\nFifties = " + fifties +
                        "\nTwenties = " + twenties +
                        "\nTens = " + tens +
                        "\nFives = " + fives +
                        "\nOnes = " + ones
        );
    }
}

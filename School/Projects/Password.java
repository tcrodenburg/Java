/*
Tanner Rodenburg
Assignment 4.1
Write an application that accepts a user's password from an input dialogs.
When the entered password is less than six characters, more than 10 characters, or does not contain at
least one letter and one digit, prompt the user again.  When the user's entry meets all the password requirements,
 prompt the user to reenter the password, and do not let the user continue until the second password matches the first one.
Bellevue University
1/30/2021
 */

import javax.swing.*;

public class Password {
    public static void main(String[] args) {

        boolean loop = false; //dialog box loop
        boolean passwordMatch; //password condition loop
        String input = "";
        int lessThan = 6;
        int moreThan = 10;

        //prompt the user for password until all password conditions are met
        while (!loop) {
            input = JOptionPane.showInputDialog(
                    null,
                    "Please enter in your password:",
                    "Password",
                    JOptionPane.PLAIN_MESSAGE
            );

            //pass the user input to check if the string matches a digit and a number
            passwordMatch = checkString(input);

            //conditions met for 1 digit, 1 letter, more than 6 chars, less than 11 chars
            if (passwordMatch && input.length() >= lessThan && input.length() <= moreThan && !input.isBlank()) {
                loop = true;
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Your password does not meet the minimum requirements. It needs to contain" +
                                " at least one letter, one number, and be at 6-10 characters long. Please try again",
                        "Incorrect Requirements",
                        JOptionPane.PLAIN_MESSAGE);
            }
        }

        boolean secondMatch = false; //test for re-entering password
        int count = 0; //wrong input counter

        //loop until both passwords match
        while (!secondMatch) {
            String confirm = JOptionPane.showInputDialog(
                    null,
                    "Please re-enter to confirm your password:",
                    "Password Confirm",
                    JOptionPane.PLAIN_MESSAGE
            );

            if (input.equals(confirm)) {
                JOptionPane.showMessageDialog(
                        null,
                        "Password confirmed. Welcome back!",
                        "Welcome",
                        JOptionPane.PLAIN_MESSAGE);
                secondMatch = true;
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Incorrect attempt. Try again:",
                        "Incorrect",
                        JOptionPane.WARNING_MESSAGE);
                count++;
            }

            //if the user has wrongly inputted in password, they have the option to close out of the program
            if (count == 5) {
                int button = JOptionPane.showConfirmDialog(
                        null,
                        "You've incorrectly matched your password. Do you want to exit?",
                        "Continue?",
                        JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (button == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else
                    count = 0;
            }
        }
    } // Main

    //method to test if the user input matches password conditions of 1 string & 1 letter
    private static boolean checkString(String input) {
        char ch;
        boolean digit = false;
        boolean number = false;

        //checks each character for digit & letter
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                digit = true;
            } else if (Character.isLetter(ch)) {
                number = true;
            }
            if (digit && number) {
                return true;
            }
        }
        return false;
    }

} // Class




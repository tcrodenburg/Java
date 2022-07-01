/*
Tanner Rodenburg
Assignment 3.1
Create a lottery game application.  Generate four random numbers, each between 0 and 9 (inclusive).
Allow the user to guess four numbers.
Compare each of the user’s guesses to the four random numbers and display a message that includes the user’s guess,
the randomly determined four-digit number, and the amount of points the user has won as follows:
No matches 	0 points
Any one digit matching 	5 points
Any two digits matching 	100 points
Any three digits matching 	2,000 points
All four digits matching 	1,000,000 points
Bellevue University
1/23/2021
 */

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {

        //user wants to keep playing variable
        String keepPlaying = "y";

        System.out.println("Welcome to the lottery game!");

        //while loop to keep playing the game
        while (keepPlaying.equals("y")) {

            //generated number and user input variables declared
            int random1, random2, random3, random4,
                    user1, user2, user3, user4;

            //initial count and reset count after continued play
            int count = 0;

            //max number for random (0-9)
            final int MAX_NUMBER = 9;

            //boolean for if a user's input is matched
            boolean match1 = false;
            boolean match2 = false;
            boolean match3 = false;
            boolean match4 = false;

            //new random instance
            Random random = new Random();

            //generate random numbers
            random1 = random.nextInt(MAX_NUMBER);
            random2 = random.nextInt(MAX_NUMBER);
            random3 = random.nextInt(MAX_NUMBER);
            random4 = random.nextInt(MAX_NUMBER);

            //user interaction
            Scanner keyboard = new Scanner(System.in);
            System.out.print("\nEnter in your first number: ");
            user1 = keyboard.nextInt();
            System.out.print("Enter in your second number: ");
            user2 = keyboard.nextInt();
            System.out.print("Enter in your third number: ");
            user3 = keyboard.nextInt();
            System.out.print("Enter in your fourth number: ");
            user4 = keyboard.nextInt();

            //match random1
            if (user1 == random1) {
                count++;
                match1 = true;
            } else if (user2 == random1) {
                count++;
                match2 = true;
            } else if (user3 == random1) {
                count++;
                match3 = true;
            } else if (user4 == random1) {
                count++;
                match4 = true;
            }

            //match random2
            if (user1 == random2 && (!match1)) {
                count++;
                match1 = true;
            } else if (user2 == random2 && (!match2)) {
                count++;
                match2 = true;
            } else if (user3 == random2 && (!match3)) {
                count++;
                match3 = true;
            } else if (user4 == random2 && (!match4)) {
                count++;
                match4 = true;
            }

            //match random3
            if (user1 == random3 && (!match1)) {
                count++;
                match1 = true;
            } else if (user2 == random3 && (!match2)) {
                count++;
                match2 = true;
            } else if (user3 == random3 && (!match3)) {
                count++;
                match3 = true;
            } else if (user4 == random3 && (!match4)) {
                count++;
            }

            //match random4
            if (user1 == random4 && (!match1)) {
                count++;
                match1 = true;
            } else if (user2 == random4 && (!match2)) {
                count++;
                match2 = true;
            } else if (user3 == random4 && (!match3)) {
                count++;
                match3 = true;
            } else if (user4 == random4 && (!match4)) {
                count++;
                match4 = true;
            }

            //start of results
            System.out.println("\nYour numbers chosen are: " + user1 + "-" + user2 + "-" + user3 + "-" + user4);
            System.out.println("The random number chosen is: " + random1 + random2 + random3 + random4);
            System.out.print("Your results for this game are: ");

            //switch statement to evaluate correct guesses
            switch (count) {
                case 0 -> System.out.print("No digits matched. 0 points!");
                case 1 -> System.out.print("1 digit matched. 5 points!!");
                case 2 -> System.out.print("2 digits matched. 100 points!!!");
                case 3 -> System.out.print("3 digits matched. 2,000 points!!!!");
                case 4 -> System.out.print("4 digits matched. 1,000,000 points!!!!!");
            }

            //keep playing?
            System.out.print("\n\nWould you like to keep playing? y/n: ");
            keepPlaying = keyboard.next();
            if (!keepPlaying.equals("y"))
                System.out.println("\nThanks for playing. Goodbye!");
        }
    }//end Main
}//end Class

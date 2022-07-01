/*
Tanner Rodenburg
Assignment 3.2
Create a class named Purchase.  Each Purchase contains an invoice number, amount of sale, and amount of sales tax.
Include set methods for the invoice number and sale amount.  Within the set() method for the sale amount,
calculate the sales tax as 7.5% (using a static field in the Purchase class) of the sale amount.
Also include a display method that displays a purchase's details in a well formatted output display.
Bellevue University
1/23/2021
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Purchase {

    //initialize variables
    private int invoiceNumber;
    private double originalAmount;
    private double amountOfSale;
    private double amountOfSalesTax;
    private static final double SALES_TAX_RATE = 0.075; //assigned to static as per stated in the problem

    //set invoice number
    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    //set original amount, tax amount, and sales amount
    public void setSaleAmount(double amountOfSale) {
        this.originalAmount = amountOfSale;   //set original amount equal to the user input
        this.amountOfSalesTax = amountOfSale * SALES_TAX_RATE; //set sales tax amount equal to the amount of sale & sales tax rate
        this.amountOfSale = amountOfSale * (1 + SALES_TAX_RATE); //set sale amount equal to the amount of sale * 1 + sales tax rate
    }

    //display the invoice number, sales tax percentage rate, and the sale amount total
    public void displayPurchaseDetails() {
        System.out.println("\n\n***************************************");
        System.out.println("INVOICE NUMBER: " + this.invoiceNumber);
        DecimalFormat money = new DecimalFormat("0.00"); //format dollar amount
        System.out.println("ORIGINAL AMOUNT: $" + money.format(this.originalAmount));
        DecimalFormat percentage = new DecimalFormat("0.00#%"); //format sales tax percent
        System.out.println("SALES TAX RATE: " + percentage.format(SALES_TAX_RATE));
        System.out.println("SALES TAX AMOUNT: $" + money.format(this.amountOfSalesTax));
        System.out.println("_______________________________________");
        System.out.println("FINAL SALES AMOUNT TOTAL: $" + money.format(this.amountOfSale));
        System.out.println("***************************************");
    }

    //Main
    public static void main(String[] args) {

        //define user input variables
        int invoiceNo;
        double salesAmount;

        //initialize scanner
        Scanner input = new Scanner(System.in);

        //designate new purchase
        Purchase purchase = new Purchase();

        //user interaction
        System.out.print("Please enter the invoice number for this order: ");
        invoiceNo = input.nextInt();
        System.out.print("Please enter the amount of the sale: ");
        salesAmount = input.nextDouble();

        //send user details to set methods
        purchase.setInvoiceNumber(invoiceNo); //set invoice
        purchase.setSaleAmount(salesAmount); //set sale amount

        //display output of invoice information
        System.out.println("\nHere is your invoice receipt:");
        purchase.displayPurchaseDetails();

    } //end Main
}//end Class

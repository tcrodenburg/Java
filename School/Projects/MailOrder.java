/*
Tanner Rodenburg
Assignment 9.1
Write an application for a mail order company.
The program uses a data entry screen in which the user types an item number and a quantity.
Write each record to a file. Save your file as MailOrder.java.
*NOTE: YOU WILL NEED TO CHANGE THE FILE PATH TO MATCH THAT OF YOUR PC IN ORDER FOR YOUR OUTPUT TO PROPERLY EXECUTE*
3/07/2021
Bellevue University
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MailOrder {

    //frame name
    private JFrame frame;

    //frame design
    private JLabel itemNumberLabel = new JLabel("Item Number:");
    private JTextField itemNumberText = new JTextField(15);
    private JLabel quantityNumberLabel = new JLabel("Quantity Number:");
    private JTextField quantityNumberText = new JTextField(15);
    private JButton addButton = new JButton("Write The Data");
    private JButton viewDataButton = new JButton("View the Data");
    private JTextArea readMe = new JTextArea(10, 20);


    //designate the frame
    public MailOrder() {
        frame = new JFrame("Mail Order");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(itemNumberLabel);
        frame.getContentPane().add(itemNumberText);
        frame.getContentPane().add(quantityNumberLabel);
        frame.getContentPane().add(quantityNumberText);
        frame.getContentPane().add(addButton);
        frame.getContentPane().add(viewDataButton);
        frame.getContentPane().add(readMe);
        addButton.addActionListener(dataListener);
        viewDataButton.addActionListener(viewDataListener);
        frame.setVisible(true);
    }

    //add button saves item and quantity entered to Mail Data File
    public ActionListener dataListener = new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == addButton) {
                String item = itemNumberText.getText();
                String quantity = quantityNumberText.getText();
                //create file for mail data, append the data so each order is saved and accessible on file
                try {
                    FileWriter writer = new FileWriter("mail_data.txt", true);
                    writer.write("Item number: " + item + " Quantity number: " + quantity + "\n");
                    writer.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                } finally {
                    itemNumberText.setText(""); //clear box for new value
                    quantityNumberText.setText(""); //clear box for new value
                }
            }
        }
    };

    //data button outputs the Mail file into the text area
    public ActionListener viewDataListener = new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == viewDataButton) {
                //file is read and displayed into the text area
                try {
                    FileReader reader = new FileReader("mail_data.txt");
                    BufferedReader br = new BufferedReader(reader);
                    readMe.read(br, null);
                    br.close();
                    readMe.requestFocus();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    };

    public static void main(String[] args) throws IOException {
        //new mail order object
        new MailOrder();
    } // Main
} // Class

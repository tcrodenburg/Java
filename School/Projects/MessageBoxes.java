/*
Tanner Rodenburg
Assignment 8.1
Modify the following 'MessageBoxes' application so it uses a single action listener for each button.
This will require you to separate the single action listener logic into multiple listeners, one for each button.
Then modify the code to provide additional options to two or more buttons.
2/28/2021
Bellevue University
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MessageBoxes {

    //add individual buttons
    private JButton alertButton = new JButton("Alert");
    private JButton yesNoButton = new JButton("Yes/No/Cancel");
    private JButton colorButton = new JButton("Color");
    private JButton inputButton = new JButton("Input");
    private JButton threeValsButton = new JButton("6 Vals");
    private JButton secretButton = new JButton("Change Colors");

    //add text box
    private JTextField txt = new JTextField(15);

    //new frame
    private JFrame frame;

    //individual listener for alert button
    private ActionListener alertListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == alertButton) {
                JOptionPane.showMessageDialog(null,
                        "There's a bug on you! It's a huge spider!", "Hey!",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    };

    //individual listener for yes / no button
    private ActionListener yesNoListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == yesNoButton) {
                int val = JOptionPane.showConfirmDialog(null,
                        "or no or cancel", "Chose yes",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (val != JOptionPane.CLOSED_OPTION) {
                    if (val == 0) {
                        txt.setText("Yes");
                    } else if (val == 1) {
                        txt.setText("No");
                    } else {
                        txt.setText("Cancel");
                    }
                }
            }
        }
    };

    //individual listener for color button
    private ActionListener colorListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == colorButton) {
                Object[] options = {"Red", "Green", "Blue", "Yellow", "Purple"};
                int sel = JOptionPane.showOptionDialog(null,
                        "Choose a Color!", "Warning",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.WARNING_MESSAGE, null,
                        options, options[0]);
                if (sel != JOptionPane.CLOSED_OPTION) {
                    txt.setText("Color Selected: " + options[sel]);
                }
            }
        }
    };

    //individual listener for input button
    private ActionListener inputListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == inputButton) {
                String val = JOptionPane.showInputDialog("How many fingers do you see?");
                txt.setText(val);
            }
        }
    };

    //individual listener for three values button
    private ActionListener threeValsListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == threeValsButton) {
                Object[] selections = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth"};
                Object val = JOptionPane.showInputDialog(null,
                        "Choose one", "Input",
                        JOptionPane.INFORMATION_MESSAGE,
                        null, selections, selections[0]);
                if (val != null) {
                    txt.setText(val.toString());
                }
            }
        }
    };

    //individual listener for a new secret button
    private ActionListener secretListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == secretButton) {
                alertButton.setBackground(Color.red);
                yesNoButton.setBackground(Color.blue);
                colorButton.setBackground(Color.white);
                inputButton.setBackground(Color.green);
                threeValsButton.setBackground(Color.ORANGE);
                secretButton.setBackground(Color.yellow);
            }
        }
    };

    //updated to add each individual button to the panel
    public MessageBoxes() {
        frame = new JFrame("Week 8");
        frame.setSize(250, 250);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(alertButton);
        frame.getContentPane().add(yesNoButton);
        frame.getContentPane().add(colorButton);
        frame.getContentPane().add(inputButton);
        frame.getContentPane().add(threeValsButton);
        frame.getContentPane().add(secretButton);
        frame.getContentPane().add(txt);
        frame.setVisible(true);
    }

    //updated to add each individual action listener to corresponding button
    public void launchJFrame() {
        alertButton.addActionListener(alertListener);
        yesNoButton.addActionListener(yesNoListener);
        colorButton.addActionListener(colorListener);
        inputButton.addActionListener(inputListener);
        threeValsButton.addActionListener(threeValsListener);
        secretButton.addActionListener(secretListener);
    }

    //main new box + launch buttons + listeners
    public static void main(String[] args) {
        MessageBoxes messageBoxes = new MessageBoxes();
        messageBoxes.launchJFrame();
    } // Main

} // Class


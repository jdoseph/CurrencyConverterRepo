// Java program to convert from
// rupee to the dollar and vice-versa
// using Java Swing
  
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CurrencyExchange {
    // Function to convert from rupee
    // to the dollar and vice-versa
    // using Java Swing
    public static void converter()
    {
  
        // Creating a new frame using JFrame
        JFrame f = new JFrame("Currency Converter");
       
        // Creating two labels
        JLabel l1, l2;
        JComboBox c1;
        // Creating two text fields.
        // One for rupee and one for
        // the dollar
        JTextField t1, t2;
  
        // Creating three buttons
        JButton b1, b2, b3;
  
        // Naming the labels and setting
        // the bounds for the labels
        String s1[] = {"EUR:", "JPY:", "GBP:", "AUD:" ,"CAD:", "CHF:", "INR:"};
        
        c1 = new JComboBox(s1);
        c1.setBounds(10, 40, 70, 30);
        l2 = new JLabel("Dollars:");
        l2.setBounds(230, 40, 60, 30);
  
        // Initializing the text fields with
        // 0 by default and setting the
        // bounds for the text fields
        t1 = new JTextField("0");
        t1.setBounds(100, 40, 40, 30);
        t2 = new JTextField("0");
        t2.setBounds(300, 40, 40, 30);
  
        // Creating a button for INR,
        // one button for the dollar
        // and one button to close
        // and setting the bounds
        
        b1 = new JButton("Convert");
        b1.setBounds(50, 80, 80, 15);
        b2 = new JButton("Dollar");
        b2.setBounds(250, 80, 70, 15);
        b3 = new JButton("close");
        b3.setBounds(150, 150, 90, 30);
  
        // Adding action listener
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d
                    = Double.parseDouble(t1.getText());
                double d1 = 0;
                if(c1.getSelectedItem() == "EUR:"){
                    d1= (d / .85);
                }
                if(c1.getSelectedItem() == "JPY:"){
                    d1= (d / 110.04);
                }
                if(c1.getSelectedItem() == "GBP:"){
                    d1= (d / .73);
                }
                // Converting rupees to dollars
                if(c1.getSelectedItem() == "AUD:"){
                    d1= (d / 1.35);
                }
                if(c1.getSelectedItem() == "CHF:"){
                    d1= (d / .92);
                }
                if(c1.getSelectedItem() == "INR:"){
                    d1= (d / 74.61);
                }
                
  
                // Getting the string value of the
                // calculated value
                String str1 = String.valueOf(d1);
  
                // Placing it in the text box
                t2.setText(str1);
            }
        });
  
        // Adding action listener
        b2.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d2
                    = Double.parseDouble(t2.getText());
                double d3 = 0.0;
                //Converts Dollars to Euros
                if(c1.getSelectedItem() == "EUR:"){
                    d3= (d2 * .85);
                }
                //Converts Dollars to Yen
                if(c1.getSelectedItem() == "JPY:"){
                    d3= (d2 * 110.04);
                }
                //Converts Dollars to Pound
                if(c1.getSelectedItem() == "GBP:"){
                    d3= (d2 * .73);
                }
                //Converts Dollars to Australian Dollar
                if(c1.getSelectedItem() == "AUD:"){
                    d3= (d2 * 1.35);
                }
                //Converts Dollars to Swiss Franc
                if(c1.getSelectedItem() == "CHF:"){
                    d3= (d2 * .92);
                }
                //Converts Dollars to Swiss Rupee
                if(c1.getSelectedItem() == "INR:"){
                    d3= (d2 * 74.61);
                }               
  
                // Getting the string value of the
                // calculated value
                String str2 = String.valueOf(d3);
  
                // Placing it in the text box
                t1.setText(str2);
            }
        });
  
        // Action listener to close the form
        b3.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });
  
        // Default method for closing the frame
        f.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
  
        // Adding the created objects
        // to the form
        f.add(c1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
  
        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    }
  
    // Driver code
    public static void main(String args[])
    {
        converter();
    }
}

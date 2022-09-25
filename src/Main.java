import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{

    public static void main(String[] args){

        //Creating the application window
        JFrame frame = new JFrame("Help Finder");
        JPanel panel = new JPanel();

        //Information pane
        JLabel label = new JLabel("Hello! This is the Help Finder application. We understand that people all over the world need help.");
        label.setBounds(25, 20, 1330, 25);
        label.setFont(new Font("Arial", Font.BOLD,28));
        label.setForeground(Color.WHITE);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);
        label.setBorder(new EmptyBorder(0,10,0,0));
        panel.add(label);


        //Name label for textfield
        JLabel label1 = new JLabel("Name:");
        label1.setBounds(25, 120, 300,20);
        label1.setFont(new Font("Arial", Font.BOLD,18));
        panel.add(label1);
        //Textfield for label
        JTextField pane = new JTextField();
        pane.setBounds(85, 122, 275, 20);
        panel.add(pane);

        //Phone number label for textfield
        JLabel label2 = new JLabel("Phone number:");
        label2.setBounds(25, 150, 300,20);
        label2.setFont(new Font("Arial", Font.BOLD,18));
        panel.add(label2);
        //Textfield for label
        JTextField pane1 = new JTextField("");
        pane1.setBounds(160, 152, 200, 20);
        panel.add(pane1);

        //Zip code label for textfield
        JLabel label3 = new JLabel("Zip Code:");
        label3.setBounds(25, 180, 300,20);
        label3.setFont(new Font("Arial", Font.BOLD,18));
        panel.add(label3);
        //Textfield for label
        JTextField pane2 = new JTextField("");
        pane2.setBounds(110, 182, 250, 20);
        panel.add(pane2);


        //Name label for textfield
        JLabel label4 = new JLabel("Name:");
        label4.setBounds(815, 120, 300,20);
        label4.setFont(new Font("Arial", Font.BOLD,18));
        panel.add(label4);
        //Textfield for label
        JTextField pane4 = new JTextField();
        pane4.setBounds(870, 122, 275, 20);
        panel.add(pane4);

        //Phone number label for textfield
        JLabel label5 = new JLabel("Phone number:");
        label5.setBounds(815, 150, 300,20);
        label5.setFont(new Font("Arial", Font.BOLD,18));
        panel.add(label5);
        //Textfield for label
        JTextField pane5 = new JTextField();
        pane5.setBounds(950, 152, 200, 20);
        panel.add(pane5);

        //Zip code label for textfield
        JLabel label6 = new JLabel("Zip Code:");
        label6.setBounds(813, 180, 300,20);
        label6.setFont(new Font("Arial", Font.BOLD,18));
        panel.add(label6);
        //Textfield for label
        JTextField pane6 = new JTextField("");
        pane6.setBounds(900, 182, 250, 20);
        panel.add(pane6);


        //Multiple choice select (I need help)
        JRadioButton radioButton1 = new JRadioButton("I need help");
        radioButton1.setBounds(17, 50, 160, 50);
        radioButton1.setFont(new Font("Arial", Font.BOLD,18));
        panel.add(radioButton1);
        //Multiple choice select (I Can help)
        JRadioButton radioButton2 = new JRadioButton("I can help");
        radioButton2.setBounds(811, 50, 150, 50);
        radioButton2.setFont(new Font("Arial", Font.BOLD,18));
        panel.add(radioButton2);

        //Submit Button
        JButton button = new JButton("Submit");
        button.setFont(new Font("Arial", Font.BOLD,15));
        button.setForeground(Color.blue);
        button.setBounds(25, 300, 100, 20);

        final String[] name1 = new String[1];
        final String[] phoneNumber1 = new String[1];
        final String[] zipCode1 = new String[1];

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(radioButton1.isSelected()){
                    JOptionPane.showMessageDialog(null,"Your information has been recorded", "Response", JOptionPane.INFORMATION_MESSAGE);

                    //Making variables for storing all the responses
                    name1[0] = pane.getText();
                    phoneNumber1[0] = pane1.getText();
                    zipCode1[0] = pane2.getText();

                    System.out.println(name1[0]);
                    System.out.println(phoneNumber1[0]);
                    System.out.println(zipCode1[0]);
                }
            }
        });
        panel.add(button);

        //Submit Button
        JButton button1 = new JButton("Submit");
        button1.setFont(new Font("Arial", Font.BOLD,15));
        button1.setForeground(Color.blue);
        button1.setBounds(815, 300, 100, 20);

        final String[] name2 = new String[1];
        final String[] phoneNumber2 = new String[1];
        final String[] zipCode2 = new String[1];

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if(radioButton2.isSelected()){
                    JOptionPane.showMessageDialog(null,"Your information has been recorded", "Response", JOptionPane.INFORMATION_MESSAGE);

                    //Making variables for storing all the responses
                    name2[0] = pane4.getText();
                    phoneNumber2[0] = pane5.getText();
                    zipCode2[0] = pane6.getText();

                    System.out.println(name2[0]);
                    System.out.println(phoneNumber2[0]);
                    System.out.println(zipCode2[0]);
                }
            }
        });
        panel.add(button1);


        //Submit Button
        JButton button2 = new JButton("Search for help");
        button2.setFont(new Font("Arial", Font.BOLD,15));
        button2.setForeground(Color.RED);
        button2.setBounds(600, 300, 200, 20);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                if(zipCode1[0].equals(zipCode2[0])){
                    String foundHelp = "Help is on the way! \nThe name of the person helping is: " + name2[0] + "\nPhone number: " + phoneNumber2[0];
                    JOptionPane.showMessageDialog(null, foundHelp, "Found Help", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        panel.add(button2);

        //Making a group for the buttons
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        //touch up EDIT THIS LATER
        panel.setLayout(null);
        frame.setSize(1600, 1000);
        frame.setLocation(1520,100);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

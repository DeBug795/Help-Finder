import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args){

        //Creating the application window
        JFrame frame = new JFrame("Help Finder");
        JPanel panel = new JPanel();

        //Information pane
        JLabel label = new JLabel("If you are in help of need, please enter your information under \"I need help\" and then click \"submit\". After submitting, click \"search for help\" and the volunteer details from your");
        label.setBounds(25, 10, 1530, 20);
        label.setFont(new Font("Arial", Font.BOLD,18));
        label.setForeground(Color.BLUE);
        label.setOpaque(true);
        panel.add(label);

        //Information pane
        JLabel label12 = new JLabel("area will be displayed. You mau call/text the volunteer directly at the their contact number. If you are looking to volunteer, click  \"I can help\", add the required information and");
        label12.setBounds(25, 30, 1530, 20);
        label12.setFont(new Font("Arial", Font.BOLD,18));
        label12.setForeground(Color.BLUE);
        label12.setOpaque(true);
        panel.add(label12);

        //Information pane
        JLabel label0 = new JLabel( "click \"submit\". Thank your for volunteering! It is because of people like you that the world is a better place.");
        label0.setBounds(25, 50, 1530, 20);
        label0.setFont(new Font("Arial", Font.BOLD,18));
        label0.setForeground(Color.BLUE);
        label0.setOpaque(true);
        panel.add(label0);

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


        String zipCodeA1[] = {"08520","08525","08534","08540","08541","08542","08543","08544","08550","08536"};
        List<String> zipCodeL = new ArrayList<>();
        Arrays.asList(zipCodeL);

        String zipCodeA2[] = zipCodeL.toArray(zipCodeA1);

        HashMap<String, String> zipCodes = new HashMap<String, String>();
        zipCodes.put("08520", "John");
        zipCodes.put("08525", "Karen");
        zipCodes.put("08534", "Russell");
        zipCodes.put("08540", "Bob");
        zipCodes.put("08541", "Jack");
        zipCodes.put("08542", "Suresh");
        zipCodes.put("08543", "Mahesh");
        zipCodes.put("08544", "Christopher");
        zipCodes.put("08550", "Richard");
        zipCodes.put("08536", "Rowley");

        HashMap<String, String> phoneNumbers = new HashMap<String, String>();
        phoneNumbers.put("John", "609-610-1111");
        phoneNumbers.put("Karen", "609-610-2222");
        phoneNumbers.put("Russel", "609-610-3333");
        phoneNumbers.put("Bob", "609-610-4444");
        phoneNumbers.put("Jack", "609-610-5555");
        phoneNumbers.put("Suresh", "609-610-6666");
        phoneNumbers.put("Mahesh", "609-610-7777");
        phoneNumbers.put("Christopher", "609-610-8888");
        phoneNumbers.put("Richard", "609-610-9999");
        phoneNumbers.put("Rowley", "8923704587024893");

        //Multiple choice select (I need help)
        JRadioButton radioButton1 = new JRadioButton("I need help");
        radioButton1.setBounds(17, 65, 160, 50);
        radioButton1.setFont(new Font("Arial", Font.BOLD,18));
        panel.add(radioButton1);
        //Multiple choice select (I Can help)
        JRadioButton radioButton2 = new JRadioButton("I can help");
        radioButton2.setBounds(811, 65, 150, 50);
        radioButton2.setFont(new Font("Arial", Font.BOLD,18));
        panel.add(radioButton2);

        //Submit Button for I can help
        JButton button1 = new JButton("Submit");
        button1.setFont(new Font("Arial",Font.BOLD,15));
        button1.setForeground(Color.blue);
        button1.setBounds(815, 250, 100, 40);

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

                    zipCodes.put(zipCode2[0], name2[0]);
                    phoneNumbers.put(name2[0], phoneNumber2[0]);

                    zipCodeL.add(zipCode2[0]);

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
        button2.setBounds(20, 250, 200, 40);

        final String[] name1 = new String[1];
        final String[] phoneNumber1 = new String[1];
        final String[] zipCode1 = new String[1];
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                //Making variables for storing all the responses
                name1[0] = pane.getText();
                phoneNumber1[0] = pane1.getText();
                zipCode1[0] = pane2.getText();

                if((zipCode1[0].equals(zipCodeA1[0])) || (zipCode1[0].equals(zipCodeA1[1]) || (zipCode1[0].equals(zipCodeA1[2]) || (zipCode1[0].equals(zipCodeA1[3])) || (zipCode1[0].equals(zipCodeA1[4]) || (zipCode1[0].equals(zipCodeA1[5])) || (zipCode1[0].equals(zipCodeA1[6]) || (zipCode1[0].equals(zipCodeA1[7])) || (zipCode1[0].equals(zipCodeA1[8])) ||  (zipCode1[0].equals(zipCodeL.get(0)))))))){
                    String nameFromZip = zipCodes.get(zipCode1[0]);
                    System.out.println(nameFromZip);
                    System.out.println(phoneNumbers.get(nameFromZip));
                    String foundHelp = "Help is on the way! \nThe name of the person helping is: " + nameFromZip + "\nPhone number: " + phoneNumbers.get(nameFromZip);
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

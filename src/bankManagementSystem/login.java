package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener{
    JButton login,clear,signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
    login(){
        setTitle("AUTOMATED TELLER MACHINE");

        setLayout(null);
//      Insert Bank icons, and set into window frame.
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

//      Add Title into Window Frame.
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Onward", Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

//      Add Card No text and their input field.
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Railway", Font.BOLD,28));
        cardno.setBounds(120,150,150,40);
        add(cardno);
        cardTextField = new JTextField();
        cardTextField.setBounds(300,160,250,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);

//      Add PIN No text and their input field.
        JLabel pin = new JLabel("Pin No:");
        pin.setFont(new Font("Railway", Font.BOLD,28));
        pin.setBounds(120,220,400,40);
        add(pin);
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,230,250,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);

//      Sign In Button
        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        add(login);
        login.addActionListener(this);

//       Clear Button
        clear = new JButton("CLEAR");
        clear.setBounds(450,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        add(clear);
        clear.addActionListener(this);

//      Sign Up Button
        signup = new JButton("SIGN UP");
        signup.setBounds(300,350,250,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        add(signup);
        signup.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);

    }

    public void actionPerformed(ActionEvent ac) {
//
        if(ac.getSource() == "clear")
        {
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if (ac.getSource() == "login") {
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else{
            cardTextField.setText("");
            pinTextField.setText("");
        }

    }

    public static void main(String[] args){
        new login();
    }
}

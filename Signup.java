import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel titleLabel = new JLabel("Sign up here"); 
    JLabel firstnameLabel = new JLabel("Firstname");
    JLabel lastnameLabel = new JLabel("Lastname");
    JLabel usernameLabel = new JLabel("Username");
    JLabel passwordLabel = new JLabel("Password");
    JLabel confirmpaswordLabel = new JLabel("Confirm Password");
    JTextField firstnameTextField = new JTextField();
    JTextField lastnameTextField = new JTextField();
    JTextField usernameTextField = new JTextField();
    JPasswordField passwordTextField = new JPasswordField();
    JPasswordField confirmpasswordTextField = new JPasswordField();
    JButton registerButton = new JButton("Register");
    JButton backButton = new JButton("Cancel");

    


    public Signup() {

        setVisible(true);
        setBounds(10,10,370,600);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setResizable(false); 
        setLocationRelativeTo(null);
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer(container);
        addActionEvent();
    }

    public void setLayoutManager(){
        container.setLayout(null);

    }

    public void setLocationAndSize(){
        //title
        titleLabel.setBounds(50, 45, 300, 30);
        titleLabel.setFont(new Font("Consolas", Font.BOLD, 25));

        //firstname
        firstnameLabel.setBounds(50, 100, 250, 30);
        firstnameLabel.setFont(new Font("Consolas" , Font.BOLD, 17));
        firstnameTextField.setBounds(50,125,250,30);

        //lastname
        lastnameLabel.setBounds(50, 150, 250, 30);
        lastnameLabel.setFont(new Font("Consolas" , Font.BOLD, 17));
        lastnameTextField.setBounds(50, 175, 250, 30);

        //username
        usernameLabel.setBounds(50, 205, 250, 30);
        usernameLabel.setFont(new Font("Consolas" , Font.BOLD, 17));
        usernameTextField.setBounds(50, 230,250, 30);

        //password
        passwordLabel.setBounds(50, 260, 250, 30);
        passwordLabel.setFont(new Font("Consolas" , Font.BOLD, 17));
        passwordTextField.setBounds(50, 290, 250, 30);

        //confirm password
        confirmpaswordLabel.setBounds(50, 315, 250, 30);
        confirmpaswordLabel.setFont(new Font("Consolas" , Font.BOLD, 17));
        confirmpasswordTextField.setBounds(50, 340, 250, 30); 

        //register button
        registerButton.setBounds(50,400,100,30);
        registerButton.setFont(new Font("Consolas" , Font.BOLD, 15));
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(new Color(52, 153, 255));

        //back button
        backButton.setBounds(200, 400, 100,30);
        backButton.setFont(new Font("Consolas" , Font.BOLD, 15));
        backButton.setForeground(Color.WHITE);
        backButton.setBackground(new Color(52, 153, 255));
        
    }

    //container
    public void addComponentsToContainer(Container cointainer){
        cointainer.add(titleLabel);
        cointainer.add(firstnameLabel);
        container.add(firstnameTextField);
        cointainer.add(lastnameLabel);
        container.add(lastnameTextField);
        cointainer.add(usernameLabel);
        cointainer.add(usernameTextField);
        cointainer.add(passwordLabel);
        container.add(passwordTextField);
        cointainer.add(confirmpaswordLabel);
        container.add(confirmpasswordTextField);
        container.add(registerButton);
        container.add(backButton);

    }
    //ActionLister
    public void addActionEvent(){
        registerButton.addActionListener(this);
        backButton.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            String firstname = firstnameTextField.getText();
            String lastname = lastnameTextField.getText();
            String username = usernameTextField.getText();
            String password = new String(passwordTextField.getPassword());
            String confirmPassword = String.valueOf(confirmpasswordTextField.getPassword());
    
            // Check if the password and confirm password match
            if (firstname.equals("") || lastname.equals("") || username.equals("") || password.equals("") || confirmPassword.equals("")) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            } else if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Passwords do not match.");
                
            } else {       
            // Add the new user to the database
            JOptionPane.showMessageDialog(this, "Sign up successfully!"); 
            
            }


        } else if (e.getSource() == backButton) {
            // Open the login form
            new LoginForm();
            dispose(); // Close the sign up form
        }
    }

    
}



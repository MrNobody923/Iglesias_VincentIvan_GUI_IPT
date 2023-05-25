import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class LoginForm extends JFrame implements ActionListener {

    
    Container container = getContentPane();
    JLabel titleLabel = new JLabel("LOGIN");
    JLabel subtitle = new JLabel("Don't have an account?");
    JLabel userLabel = new JLabel("Username");
    JLabel passwordLabel = new JLabel("Password");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton signupButton = new JButton("Create Now");
    JCheckBox remembermeCheckBox = new JCheckBox("Remember me");
    JCheckBox showPassword = new JCheckBox("Show Password");
 
 
    public LoginForm() {
        //title
        setTitle("");
        setVisible(true);
        setBounds(10, 10, 370, 600);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
        setVisible(true);
 
    }
    //LayoutManager
    public void setLayoutManager() {
        container.setLayout(null);
    }
    //
    public void setLocationAndSize() {
        //Title
        titleLabel.setBounds(130, 90, 200, 30);
        titleLabel.setFont(new Font("Consolas", Font.BOLD, 35));
        titleLabel.setForeground(new Color(0, 0, 0));

        //subtitle
        subtitle.setBounds(75,500,300,30);
        subtitle.setFont(new Font("Consolas", Font.PLAIN, 10));
        subtitle.setForeground(Color.DARK_GRAY);
        subtitle.setBackground(new Color(238,238,238));
        subtitle.setBorder(BorderFactory.createEmptyBorder());

        //Username
        userLabel.setBounds(50, 150, 100, 30);
        userLabel.setFont(new Font("Consolas", Font.BOLD, 17));
        userTextField.setBounds(50, 180, 250, 35);

        //Password 
        passwordLabel.setBounds(50, 220, 100, 30);
        passwordLabel.setFont(new Font("Consolas", Font.BOLD, 17));
        passwordField.setBounds(50, 250, 250, 35);

        //Show password
        showPassword.setBounds(200, 290, 150, 30);
        showPassword.setFont(new Font("Consolas", Font.BOLD, 13));

        //Remember me
        remembermeCheckBox.setBounds(50, 290,150,30);
        
        //Login Button
        loginButton.setFont(new Font("Consolas", Font.BOLD, 15));
        loginButton.setBounds(50, 330, 250, 30);
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(51,153, 255));

        //Signup Button
        signupButton.setBounds(215, 500, 80, 30);
        signupButton.setFont(new Font("Consolas", Font.BOLD, 12));
        signupButton.setForeground(new Color(255, 90, 50));
        signupButton.setBackground(new Color(240, 240, 240));
        signupButton.setBorder(BorderFactory.createEmptyBorder());
        
    }
    //components
    public void addComponentsToContainer() {
        container.add(titleLabel);
        container.add(subtitle);
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(remembermeCheckBox);
        container.add(loginButton);
        container.add(signupButton);
    }
    //ActionListener
    public void addActionEvent() {
        loginButton.addActionListener(this);
        signupButton.addActionListener(this);
        showPassword.addActionListener(this);
        remembermeCheckBox.addActionListener(this);
    }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
        //LOGIN button
        if (e.getSource() == loginButton) {
            String userText = userTextField.getText();;
            String pwdText = new String(passwordField.getPassword());
            if (userText.equalsIgnoreCase("admin") && pwdText.equalsIgnoreCase("password")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
 
        }
        //Sign up  button
        else if (e.getSource().equals(signupButton)) {
            dispose();
            new Signup();
        }
       //show password
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
        if (remembermeCheckBox.isSelected()){
            
        }    
 
        }
    }

 
 }

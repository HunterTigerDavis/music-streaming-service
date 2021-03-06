package Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {

    private JLabel noAccLabel;
    private JLabel titleLabel;
    private JLabel usernameLabel;
    private JTextField enterUsernameField;
    private JButton loginButton;
    private JButton signUpButton;

    private static final int FRAME_WIDTH = 550;
    private static final int FRAME_HEIGHT = 400;


    public LoginFrame() {
        createComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("Login");
    }

    public void createComponents() {

        titleLabel = new JLabel("Music Streaming Service!");
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        usernameLabel = new JLabel("Enter your username: ");
        noAccLabel = new JLabel("Don't have an account?");

        enterUsernameField = new JTextField(15);
        enterUsernameField.setMaximumSize(enterUsernameField.getPreferredSize());

        loginButton = new JButton("Log in");
        loginButton.addActionListener(new ButtonListener());
        signUpButton = new JButton("Sign up");
        signUpButton.addActionListener(new ButtonListener());

        JPanel loginPanel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(loginPanel, BoxLayout.Y_AXIS);
        loginPanel.setLayout(boxLayout);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginPanel.add(titleLabel);
        loginPanel.add(Box.createRigidArea(new Dimension(0, 60)));
        usernameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginPanel.add(usernameLabel);
        loginPanel.add(enterUsernameField);
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginPanel.add(loginButton);
        loginPanel.add(Box.createRigidArea(new Dimension(0, 60)));
        noAccLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginPanel.add(noAccLabel);
        signUpButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginPanel.add(signUpButton);

        this.add(loginPanel);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent click) {
            if (click.getSource() == loginButton) {
                setVisible(false);
            }
        }
    }

}

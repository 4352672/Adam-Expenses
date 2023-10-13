import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

public class Login extends JFrame {


    private JPanel LoginPanel;
    private JButton backButton;
    private JButton loginButton;
    private JTextField EmailT;
    private JPasswordField passwordT;
    private JButton newUserButton;


    Login() {
        setTitle("Login Form");
        setContentPane(LoginPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(800, 500);
        setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == loginButton) {
                    boolean Equal = false;
                    try {
                        File login = new File("Logintext.txt");
                        Scanner Reader = new Scanner(login);

                        String tempEmail = EmailT.getText();
                        String tempPassword = passwordT.getText();

                        while (Reader.hasNextLine()) {
                            String data = Reader.nextLine();
                            String[] account = data.split(",");
                            String Email = account[3];
                            String Password = account[4];

                            if (tempEmail.equals(Email) && tempPassword.equals(Password)) {
                                Equal = true;
                            }
                        }

                        if (Equal = true) {
                            System.out.println("Welcome to adams expenses");
                        } else {
                            System.out.println("Please try again and check password");
                        }

                        Reader.close();

                    } catch (Exception exception) {
                        System.out.println("Something is not right.Please make sure your information is right");
                        throw new RuntimeException(exception);
                    }
                }


                Expenses Expensesform = new Expenses();

            }


        });
        newUserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == newUserButton) {
                    newuser newuserform = new newuser();

                }

            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == backButton) {
                    Welcome Welcomeform = new Welcome();
                }


            }
        });
    }

    public static void main(String[] args) {
        BasicLogin User = new BasicLogin();
        String Password = User.getPassword();
        System.out.println(Password);


        Login loginform = new Login();

    }
}




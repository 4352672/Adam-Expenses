import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class newuser extends JFrame {
    static String Name;
    static String Surname;
    static String Email;
    static String Password;
    static String Number;

    private JTextField EmailT;
    private JTextField NumT;
    private JTextField SurnameT;
    private JTextField NameT;
    private JButton genarateButton;
    private JButton backButton;
    private JTextField PasswordT;
    private JTextField ConfirmPT;
    private JPanel Newuserpanel;

    newuser() {

        setTitle("New User Form");
        setContentPane(Newuserpanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(800, 500);
        setVisible(true);
        genarateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == genarateButton) {
                    try {
                        FileWriter login = new FileWriter("Logintext.txt");  //Adds to text file
                        String Email = EmailT.getText();
                        String Password = PasswordT.getText();
                        String Name = NameT.getText();
                        String Surname = SurnameT.getText();
                        Number = NumT.getText();


                        login.write(Name + "," + Surname + "," + Number + "," + Email + "," + Password);
                        login.close();
                        System.out.println("Your details have been added to the system");
                        if (Password.equals(ConfirmPT.getText())) {
                            Login loginform = new Login();
                        } else {
                            System.out.println("Confirm password and password are not the same");
                        }


                    } catch (Exception exception) {
                        System.out.println("Something is not right.Please make sure your information is right");
                        throw new RuntimeException(exception);
                    }


                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == genarateButton) {

                    Login loginform = new Login();

                }
            }
        });
    }

    public static void main(String[] args) {
        BasicLogin User = new BasicLogin();
        User.setName(Name);
        User.setSurname(Surname);
        User.setNumber(Number);
        User.setEmail(Email);
        User.setPassword(Password);
        newuser newuserform = new newuser();

    }

}


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame {
    private JPanel Welcomepanel;
    private JButton Login;
    private JButton loginButton;
    private JLabel welcome;


    Welcome() {
        setTitle("Wecome Form");
        setContentPane(Welcomepanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(800, 500);
        setVisible(true);


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == loginButton) {
                    Login loginform = new Login();

                }

//                Loginform.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        Welcome Welcomeform = new Welcome();

    }
}

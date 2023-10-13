import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Expenses extends JFrame {
    private JTable table1;
    private JButton deleteExpenseButton;
    private JButton addExpenseButton;
    private JButton saveBudgetButton;
    private JTextField textField1;
    private JButton editExpenseButton;
    private JButton doneButton;
    private JPanel ExpensesPanel;


    Expenses() {
        setTitle("Login Form");
        setContentPane(ExpensesPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(800, 500);
        setVisible(true);
        doneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == doneButton) {
                    Welcome Welcomeform = new Welcome();
                }
            }
        });
    }

    public static void main(String[] args) {
        Expenses Expensesform = new Expenses();

    }
}


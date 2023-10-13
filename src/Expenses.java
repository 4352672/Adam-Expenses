import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Expenses extends JFrame {
    private JTable table1;
    private JButton deleteExpenseButton;
    private JButton addExpenseButton;
    private JButton saveBudgetButton;
    int budget;
    private JButton editExpenseButton;
    private JButton doneButton;
    private JPanel ExpensesPanel;
    String Email;
    private JTextField BudgetB;
    private JLabel BudgetL;


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
        saveBudgetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == saveBudgetButton) {
                    budget = Integer.valueOf(BudgetB.getText());
                    BudgetL.setText(String.valueOf(budget));
                }

            }
        });
        addExpenseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == addExpenseButton) {
                    String Expense, Amount;
                    Scanner in = new Scanner(System.in);
                    System.out.println("Please re enter email");
                    String Email = in.nextLine();
                    try {
                        FileWriter Expenses = new FileWriter(Email + ".txt");
                        System.out.println("Please enter a expense");
                        Expense = in.nextLine();
                        System.out.println("Please enter the amount");
                        Amount = in.nextLine();
                        Expenses.write(Expense + "," + Amount);
                        Expenses.close();

                    } catch (IOException ex) {
                        System.out.println("file gone");
                        throw new RuntimeException(ex);
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        Expenses Expensesform = new Expenses();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your email");
        String Email = input.nextLine();
        try {
            File myObj = new File(Email + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created");

            } else {

                System.out.println("File already exists");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }




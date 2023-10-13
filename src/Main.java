import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static String Email, Password;
    public static void main(String[] args) {
        RegorLog();
    }

    public static void RegorLog() {
        Scanner choose = new Scanner(System.in);
        //String Email,Password;
        int RegorLog;

        System.out.println("Choose 1 to register or choose 2 to Login");  //Choice to choose either to register or to login
        RegorLog = choose.nextInt();
        if (RegorLog == 1) {
            Register();


        } else if (RegorLog == 2) {
            login();
        } else {
            System.out.println("Email or password is wrong.Try Again!!");
        }
    }

    public static void Register()   //Register method
    {
        Scanner input = new Scanner(System.in);
        String Name, Surname, Number;
        try {
            FileWriter login = new FileWriter("Logintext.txt");  //Adds to text file
            System.out.println("Enter Name");
            Name = input.nextLine();
            System.out.println("Enter Surname");
            Surname = input.nextLine();
            System.out.println("Enter Number");
            Number = input.nextLine();
            System.out.println("Enter Email");
            Email = input.nextLine();
            System.out.println("Enter Password");
            Password = input.nextLine();

            login.write(Name + "," + Surname + "," + Number + "," + Email + "," + Password);
            login.close();
            System.out.println("Your details have been added to the system");


        } catch (Exception e) {
            System.out.println("Something is not right.Please make sure your information is right");
            throw new RuntimeException(e);
        }


    }

    public static void login() {
        //login method
        Scanner input = new Scanner(System.in);
        boolean Equal = false;
        String Email1, Password1;
        try {
            File login = new File("Logintext.txt");
            Scanner Reader = new Scanner(login);

            System.out.println("Enter Email");
            Email1 = input.nextLine();

            System.out.println("Enter Password");
            Password1 = input.nextLine();

            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                String[] account = data.split(",");
                Email1 = account[3];
                Password1 = account[4];

                if (Email1.equals(Email) && Password1.equals(Password)) {
                    Equal = true;
                }
            }

            if (Equal = true) {
                System.out.println("Welcome to adams expenses");
            } else {
                System.out.println("Please try again and check password");
            }

            Reader.close();

        } catch (Exception e) {
            System.out.println("Email or Password is incorrect");
            throw new RuntimeException(e);
        }
    }

}





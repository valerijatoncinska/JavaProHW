package homework_02.handlers;

import java.util.Scanner;

public class AppHandler {

    public void greeting () {
        System.out.println("Welcome to number analysis app!\n" +
             "You can start by entering your number!\n"   );
    }

    public void goodbye () {
        System.out.println("\nThank you for using this app!");
    }

    public double scannerManager () {
        Scanner scanner = new Scanner(System.in);
        boolean error = true;
        double userNumber = 0;

        do {
            try {
                userNumber = Double.parseDouble(scanner.next());
                System.out.println("Your number is " + userNumber + "!\n");
                error = false;
            }
            catch (Exception e) {
                System.out.println("This is not a number!\n");
            }
        } while (error);
        return userNumber;
    }
}

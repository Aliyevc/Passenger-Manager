

import exceptionHandling.ExceptionHandling;
import exceptions.NotCorrectOperationException;
import operations.Operator;

import java.util.Scanner;

public class MethodsOfMain {
    public static void access() {
        Operator operator = new Operator();
        Scanner scanner = new Scanner(System.in);


        boolean isWorked = false;
        while (!isWorked) {
            System.out.println("Choose operation: ");
            System.out.println("1.Register passenger");
            System.out.println("2.All passenger list");
            System.out.println("3.Find passenger");
            System.out.println("4.Upgrade passenger");
            System.out.println("0.Stop operations");

            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    ExceptionHandling.registerPassengersHandling();
                    break;
                case 2:
                    ExceptionHandling.ShowPassengerHandling();
                    break;
                case 3:

                    ExceptionHandling.findPassengerHandling();
                    break;
                case 4:
                    ExceptionHandling.upgradePassenger();
                    break;
                case 0:
                    operator.stopOperations();
                    break;
                default:
                    throw new NotCorrectOperationException("Enter the correct operation!");
            }
            if (number == 0) {
                isWorked = true;
            }
            System.out.println();

        }

    }

}

package exceptionHandling;

import exceptions.NoSuchPassengerException;
import exceptions.NullListException;
import operations.Operator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static Operator operator = new Operator();

    public static void findPassengerHandling () {
        System.out.print("Enter the name of passenger: ");
        String name = new Scanner(System.in).next();
        try {
            operator.findPassenger(name);
        } catch (NoSuchPassengerException exception) {
            System.err.println(exception.getMessage());
        }

    }

    public static void ShowPassengerHandling () {
        try {
            operator.showAllList();
        }catch (NullListException exception) {
            System.err.println(exception.getMessage());
        }
    }

    public static void registerPassengersHandling() {
        System.out.print("How many passenger will be registered: ");

        int countPassenger = 0;
        int newI = Operator.i;
        try{
            countPassenger = new Scanner(System.in).nextInt();
            operator.registeredPassenger(countPassenger + newI);
        } catch (InputMismatchException exception) {
            System.err.println(exception.getMessage());
        }

    }

    public static void upgradePassenger() {
        System.out.print("Enter the name of passenger: ");
        String name = new Scanner(System.in).next();
        try {
            operator.upgradePassenger(name);
        } catch (NoSuchPassengerException exception) {
            System.err.println(exception.getMessage());
        }
    }
}

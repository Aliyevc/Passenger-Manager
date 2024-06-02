package operations;

import exceptions.NoSuchPassengerException;
import exceptions.NullListException;
import people.Passenger;

import java.util.Scanner;

public class Operator implements Operations{
    public static int size = 100;
    public static int i = 0;

    public static Passenger[] passengers = new Passenger[size];



    Scanner scanner = new Scanner(System.in);
    public void findPassenger(String name) {
        boolean flag = false;
        for (Passenger passenger : passengers) {
            if (passenger != null && passenger.getName().equals(name)) {
                flag = true;
                System.out.println(passenger);
                break;
            }
        }
        if (!flag) {
            throw new NoSuchPassengerException("There is no such passenger.");
        }
    }


    public void showAllList() {
        if (passengers[0] != null) {
            for (Passenger passenger : passengers) {
                if (passenger == null){
                    break;
                }
                else {
                    System.out.println(passenger);
                }
            }
        }
        else {
            throw new NullListException("There is no passenger");
        }
    }

    public Passenger[] registeredPassenger(int countPassenger) {
        for (; i < countPassenger; i++) {

            System.out.print("Enter the name: ");
            String name = scanner.next();
            System.out.print("Enter the age: ");
            int age = scanner.nextInt();

            passengers[i] = new Passenger(name, age);

        }
        return passengers;
    }

    public void stopOperations() {
        System.exit(0);
    }

    public void upgradePassenger(String name) {
        boolean flag = false;


        for (int j = 0; j < i; j++) {
            if (passengers[j] != null && passengers[j].getName().equals(name)) {
                System.out.print("Enter the new name: ");
                String newName = new Scanner(System.in).next();
                System.out.print("Enter the new age: ");
                int age = new Scanner(System.in).nextInt();
                flag = true;
                passengers[j] = new Passenger(newName,age);
                break;
            }
        }
        if (!flag) {
            throw new NoSuchPassengerException("There is no such passenger.");
        }
    }

    @Override
    public Passenger[] increaseArraySize(Passenger[] passengers) {
        return new Passenger[0];
    }
}

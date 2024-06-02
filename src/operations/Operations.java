package operations;

import people.Passenger;

public interface Operations {
    void findPassenger(String name);

    void showAllList();

    Passenger[] registeredPassenger(int countPassenger);

    void stopOperations();

    void upgradePassenger(String name);

    Passenger[] increaseArraySize(Passenger[] passengers);


}

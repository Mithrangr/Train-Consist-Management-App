class InvalidCapacityException extends Exception {
    InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    String type;
    int capacity;

    PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }
}

public class TrainExceptionApp {
    public static void main(String[] args) {

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println(b1.type + " " + b1.capacity);

            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);
            System.out.println(b2.type + " " + b2.capacity);

        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }

        try {
            PassengerBogie b3 = new PassengerBogie("First Class", 0);
            System.out.println(b3.type + " " + b3.capacity);
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}
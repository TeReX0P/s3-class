abstract class Compartment {
    protected int availableSeats;

    public Compartment(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public abstract void notice();

    public void bookTicket(int seats) {
        if (seats <= availableSeats) {
            availableSeats -= seats;
            System.out.println(seats + " seats booked successfully.");
        } else {
            System.out.println("Not enough seats available.");
        }
    }
}

class FirstClass extends Compartment {

    public FirstClass(int availableSeats) {
        super(availableSeats);
    }

    public void notice() {
        System.out.println("First Class Compartment: " + availableSeats + " seats available.");
    }
}

class GeneralClass extends Compartment {

    public GeneralClass(int availableSeats) {
        super(availableSeats);
    }

    public void notice() {
        System.out.println("General Class Compartment: " + availableSeats + " seats available.");
    }
}

public class Train {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass(50);
        GeneralClass generalClass = new GeneralClass(100);

        firstClass.notice();
        generalClass.notice();

        firstClass.bookTicket(5);
        generalClass.bookTicket(10);

        firstClass.notice();
        generalClass.notice();
    }
}
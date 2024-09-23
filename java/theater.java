abstract class Theatre {
    protected int totalTickets;
    protected int soldTickets;

    public Theatre(int totalTickets) {
        this.totalTickets = totalTickets;
        this.soldTickets = 0;
    }

    public void booking(int numberOfTickets) {
        if (numberOfTickets <= (totalTickets - soldTickets)) {
            soldTickets += numberOfTickets;
            System.out.println(numberOfTickets + " tickets booked successfully.");
        } else {
            System.out.println("Not enough tickets available.");
        }
    }

    public void cancellation(int numberOfTickets) {
        if (numberOfTickets <= soldTickets) {
            soldTickets -= numberOfTickets;
            System.out.println(numberOfTickets + " tickets cancelled successfully.");
        } else {
            System.out.println("Not enough tickets to cancel.");
        }
    }

    public abstract void total_collection();
}

class NewRelease extends Theatre {
    private String filmName;

    public NewRelease(String filmName, int totalTickets) {
        super(totalTickets);
        this.filmName = filmName;
    }

    public void total_collection() {
        int totalCollection = soldTickets * 150;
        System.out.println("Total collection for the film " + filmName + " is: Rs. " + totalCollection);
    }

    public static void main(String[] args) {
        NewRelease movie = new NewRelease("Inception", 100);
        movie.booking(10);
        movie.booking(5);
        movie.cancellation(3);
        movie.total_collection();
    }
}


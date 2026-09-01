import java.util.Scanner;

public class Activity2 {

    public void cinemaTicket() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CINEMA TICKET SYSTEM ===");
        System.out.println("Select Format (1: REGULAR, 2: 3D, 3: IMAX): ");
        int format = sc.nextInt();

        System.out.println("Enter Screening Hour (24-Hour Format, e.g., 18): ");
        int hour = sc.nextInt();

        String screeningFormat = "";
        double basePrice = 0;
        double peakFee = 0;

        // Select ticket format
        if (format == 1) {
            screeningFormat = "REGULAR";
            basePrice = 300;
        } else if (format == 2) {
            screeningFormat = "3D";
            basePrice = 400;
        } else if (format == 3) {
            screeningFormat = "IMAX";
            basePrice = 450;
        } else {
            System.out.println("Invalid format selected!");
            return;
        }

        // Peak hour: 5:00 PM to 8:00 PM
        if (hour >= 17 && hour <= 20) {
            peakFee = 50;
        }

        double totalCost = basePrice + peakFee;

        System.out.println();
        System.out.println("=== TICKET BREAKDOWN ===");
        System.out.println("Screening Format: " + screeningFormat);
        System.out.printf("Base Ticket Price: PHP %.2f%n", basePrice);
        System.out.printf("Peak Hour Fee:     PHP %.2f%n", peakFee);
        System.out.println("-------------------------");
        System.out.printf("TOTAL TICKET COST: PHP %.2f%n", totalCost);
        System.out.println("STATUS: SEAT RESERVED");
        System.out.println("-------------------------");
    }
}
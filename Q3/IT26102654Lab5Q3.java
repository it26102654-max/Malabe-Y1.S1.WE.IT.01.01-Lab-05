
import java.util.Scanner;

public class IT26102654Lab5Q3 {

    public static void main(String[] args) {

        // Declare constants
        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 10.0;
        final double DISCOUNT_20 = 20.0;

        int startDate, endDate, daysReserved;
        double totalAmount, discountRate;

        Scanner input = new Scanner(System.in);

        // Input start date and end date
        System.out.print("Enter Start Date (day): ");
        startDate = input.nextInt();

        System.out.print("Enter End Date (day): ");
        endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }

        // Validation 2
        if (startDate >= endDate) {

            System.out.println("Error: Start date should be less than end date.");
            return;
        }

        // Calculate number of days reserved
        daysReserved = endDate - startDate;

        // Calculate discount rate
        if (daysReserved < 3) {
            discountRate = 0;
        } else if (daysReserved <= 4) {
            discountRate = DISCOUNT_10;
        } else {
            discountRate = DISCOUNT_20;
        }

        // Calculate total amount
        totalAmount = daysReserved * ROOM_CHARGE;
        totalAmount = totalAmount -
                      (totalAmount * discountRate / 100);

        // Display results
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.printf("Total Amount to be Paid: Rs. %.2f%n",
                          totalAmount);

        input.close();
    }
}

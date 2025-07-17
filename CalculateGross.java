public class CalculateGross {
    public static void main(String[] args) {
        double hoursWorked = 40; // Example value for hours worked
        double yourHoursWorked = 3.5;
        calculateGross(yourHoursWorked);
        calculateGross(hoursWorked);

    }

    public static void calculateGross(double hours) {
        final double STD_RATE = 15.00; // Standard hourly rate;
        double grossPay = hours * STD_RATE; // Calculate gross pay

        System.out.printf("Your gross pay is: $%.2f%n", grossPay);
    }
}

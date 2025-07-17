import java.time.*;
public class LocalDateDemo {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        
        
        // Print the current date
        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Date: " + currentDate.getDayOfWeek() + ", " + currentDate.getMonth() + " " + currentDate.getDayOfMonth() + ", " + currentDate.getYear());
        System.out.println("current time: " + LocalTime.now());
        
        // Create a specific date
        LocalDate specificDate = LocalDate.of(2023, Month.OCTOBER, 1);
        
        // Print the specific date
        System.out.println("Specific Date: " + specificDate);
        
        // Check if the specific date is before the current date
        if (specificDate.isBefore(currentDate)) {
            System.out.println(specificDate + " is before " + currentDate);
        } else {
            System.out.println(specificDate + " is not before " + currentDate);
        }
    }
}

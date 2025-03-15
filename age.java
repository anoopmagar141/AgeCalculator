import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (YYYY-MM-DD, YYYY/MM/DD, YYYY.MM.DD): ");
        String inputDate = scanner.nextLine();

        // Replacing different separators with "-"
        inputDate = inputDate.replace("/", "-").replace(".", "-");

        try {
            // Parsing the birth date
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate birthDate = LocalDate.parse(inputDate, formatter);
            LocalDate currentDate = LocalDate.now();

            // Validate birth date
            if (birthDate.isAfter(currentDate)) {
                System.out.println("Invalid date! Birth date cannot be in the future.");
            } else {
                // Calculating age
                Period age = Period.between(birthDate, currentDate);
                long daysLived = ChronoUnit.DAYS.between(birthDate, currentDate);


        scanner.close();
    }
}

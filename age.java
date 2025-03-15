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


        scanner.close();
    }
}

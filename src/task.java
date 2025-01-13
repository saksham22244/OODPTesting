import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Define the regular expression pattern
        // The pattern matches a 10-digit number starting with 7, 8, or 9
        String regex = "^[789]\\d{9}$";

        // Prompt the user to enter the phone number
        System.out.print("Enter a 10-digit phone number starting with 7, 8, or 9: ");
        String phoneNumber = scanner.nextLine();

        // Create a Pattern object with the defined regular expression
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object to match the input string against the pattern
        Matcher matcher = pattern.matcher(phoneNumber);

        // Check if the phone number matches the pattern
        if (matcher.matches()) {
            System.out.println("Valid phone number.");
        } else {
            System.out.println("Invalid phone number. It must be 10 digits long and start with 7, 8, or 9.");
        }

        // Close the scanner
        scanner.close();
    }
}




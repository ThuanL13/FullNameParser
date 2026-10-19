import java.util.Scanner;
public class FullNameParser {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Asking user for full name
        System.out.println("What is your full name? (First and Last or First, Middle and Last: ");
        String fullName = read.nextLine().trim();

        // Splitting the name
        // \\s+ = one or more whitespace chars
        String[] nameParts = fullName.split("\\s+"); //Splits the name into parts

        // Storing the first, middle, last names
        String firstName = "";
        String middleName = "";
        String lastName = "";

        // Checking for only first and last name entered
        if (nameParts.length == 2) { // If only two parts of the name is entered, First and Last
            firstName = nameParts[0];
            middleName = "(none)";
            lastName = nameParts[1];
        }
        // Checking for first, middle and last name
        else if (nameParts.length == 3) { // // If 3 parts of the name is entered, First, Middle and Last
            firstName = nameParts[0];
            middleName = nameParts[1];
            lastName = nameParts[2];
        }
        // Displaying names
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name " + lastName);

        read.close();
    }
}

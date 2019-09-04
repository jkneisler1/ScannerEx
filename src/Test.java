import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // User prompt
        System.out.println("Enter the input text for this example:");

        // Set up the variables and variable types to read the input text
        // The input text is: "P Sherman 42 Wallaby Way Sydney"
        String firstInitial = keyboard.next();
        String lastName = keyboard.next();
        int houseNumber = keyboard.nextInt();
        String streetName = keyboard.next();
        String streetType = keyboard.next();
        String city = keyboard.next();

        // Print out the data
        System.out.println(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
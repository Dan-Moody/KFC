package Text.Palindrome.JavaFiles;

import java.lang.String;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        isPalindrome();
    }

    // Loops asking for string until told not to
    public static void isPalindrome() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a string to check if its a palindrome:\n(Type quit to exit program)");
            String inputString = scanner.nextLine();
            inputString = inputString.strip();
            inputString = inputString.toLowerCase();

            // Stop program if quit is typed
            if (inputString.equals("quit")) {
                break;
            }

            // Call helper funciton to check if its a palindrome
            Boolean checked = checkPalindrome(inputString);

            // Print appropriate response
            if (checked) {
                System.out.println("\"" + inputString + "\" is a Palindrome.\n");
            } else {
                System.out.println("\"" + inputString + "\" is NOT a Palindrome.\n");
            }
        }
        scanner.close();
    }

    // Reverse string and compare it to original
    public static Boolean checkPalindrome(String input) {
        // System.out.println(input);
        String rev = new StringBuilder(input).reverse().toString();
        // System.out.println(rev);
        return (rev.equals(input));
    }
}

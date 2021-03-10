package Text.CountVowels.JavaFiles;

import java.util.Scanner;

import java.lang.String;

public class CountVowels {

    public static String vowels = "aeiouAEIOU";
    public static void main(String[] args) {
        System.out.println("Enter a string to have the number of vowels counted : ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        int count = vowelCounter(inputString); // StringBuilder
        // inputString = reverse2(inputString); // Swaps letters
        // inputString = reverse3(inputString); // Temp array

        System.out.println("The number of vowels is : " + count);
        scanner.close();
    }

    public static int vowelCounter( String input ) {
        int count = 0;
        for ( int i = 0; i < input.length(); i++ ) {
            if ( vowels.contains( String.valueOf( input.charAt(i) ) ) ) {
                count++;
            }
        }
        return count;
    }
}

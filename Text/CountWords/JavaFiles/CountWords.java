package Text.CountWords.JavaFiles;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        whenPigsFly();
    }

    public static void whenPigsFly() {
        System.out.print("Enter a string to be converted : ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        int count = wordCounter(inputString);

        System.out.println("The number of words is : " + count);
        scanner.close();
    }

    public static int wordCounter( String input ) {
        return input.split(" ").length;
    }
}

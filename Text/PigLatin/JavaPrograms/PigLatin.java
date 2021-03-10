package Text.PigLatin.JavaPrograms;

import java.util.Scanner;

import java.lang.String;

public class PigLatin {

    public static String vowels = "aeiouAEIOU";
    public static void main(String[] args) {
        whenPigsFly();
    }

    public static void whenPigsFly() {
        System.out.print("Enter a string to be converted : ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        inputString = pigLatin1(inputString);

        System.out.println("The Pig Latin String is : " + inputString);
        scanner.close();
    }

    public static String pigLatin1( String input ) {
        String temp = "";
        for (String retval: input.split(" ")) {

            for ( int i = 0; i < retval.length(); i++ ) {
                if ( vowels.contains( String.valueOf( retval.charAt(i) ) ) ) {
                    if ( i >= 1 ) {
                        String pig = retval.substring( 0, i );
                        String latin = retval.substring( i, retval.length() );
                        retval = latin + pig + "ay";
                    } else {
                        retval = retval + "ay";
                    }
                    break;
                }
            }

            temp += retval + " ";
        }
        return temp;
    }
}

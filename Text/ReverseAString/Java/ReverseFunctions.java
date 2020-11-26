public class ReverseFunctions {
    /**
     * Reverses the string using the StringBuilder reverse function
     * @param str String to be reversed
     * @return String object of the reveresed string
     */
    public static String reverse1(String str) {
        // USes built in StringBuilder reverse function
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Reverses the string by converting the original to a char array and flipping 
     * the first and last characters
     * @param str String to be reversed
     * @return String object of the reversed string
     */
    public static String reverse2(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Flips the first and last characters in the string until it reaches the middle
        for ( int start = 0, end = charArray.length - 1; start < end; start++, end-- ) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
        }
        
        // Convert the temp array back into a string
        String flipped = new String(charArray);
        return flipped;
    }

    /**
     * Reverses the string by making a new temporary array of characters and inserting the string 
     * from end to beginning
     * @param str String to be reversed
     * @return String object of the reversed string
     */
    public static String reverse3(String str) {
        // char array of input
        char[] charArray = str.toCharArray();
        // New temp array same size as string
        char[] tempArray = new char[charArray.length];

        // Traverses all the characters of the original string
        for ( int i = charArray.length - 1, j = 0; i >= 0; i--, j++ ) {
            tempArray[j] = charArray[i];
        }

        // Convert the temp array back into a string
        String flipped = new String(tempArray); 
        return flipped;
    }
}

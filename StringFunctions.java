import java.util.Scanner;


public class StringFunctions {

    public static void main(String[] args) {
        String x;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string ");
        // This function captures the next string typed into the terminal.
        x = input.nextLine();
        // Uses the .lenth() function of a String wrapper class to get the total amount of letters in the string.
        System.out.println("The string is " + x.length() + " characters long.");
        // Uses the .toUpperCase() function of a String wrapper class to get the upper-case variant of the string.
        System.out.println("Uppercase version of the String : " + x.toUpperCase());
        // Uses the .toLowerCase() function of a String wrapper class to get the lower-case variant of the string.
        System.out.println("Lowercase version of the String : " + x.toLowerCase());
        // Uses the .charAt() function to get the first (0) and last (totalLength of String - 1) via their indeces.
        System.out.println("The first character of the String is '" + x.charAt(0) + "' and the last character is '" + x.charAt(x.length()-1) + "'");
        // If the string is longer than 4, print out the 2nd and 5th character, the if statement is used to avoid likely errors of shorter strings.
        if (x.length() > 5){
            System.out.println("The second character of the string is '" + x.charAt(1) + "' and the fifth character of the string is '" + x.charAt(4) + "'");
        }
        input.close();
    }

}
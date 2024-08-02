import java.util.Scanner;

public class StringBuilderExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sentence;
        do {
            System.out.println("Enter a string with at least 10 characters :");
            sentence = new StringBuilder(input.nextLine());
        } while (sentence.length() <= 9);

        System.out.println("The length of the string is \"" + sentence.length() + "\"");
        System.out.println("The first character of the string is \"" + sentence.charAt(0) + "\"");
        System.out.println("The last character of the string is \"" + sentence.charAt(sentence.length()-1) + "\"");
        System.out.println("The first instance of 'a' is at index " + sentence.indexOf("a"));
        System.out.println("The substring from index 3 to 6 is \"" + sentence.substring(3, 6) + "\"");
        System.out.println("The resulting string after appending \"123\" is \"" + sentence.append("123") + "\"");
        System.out.println("The resulting string after inserting at index 4 is \"" + sentence.insert(4, "xyz") + "\"");
        System.out.println("The resulting string after deleting index 2 to 4 is \"" + sentence.delete(2, 4));
        System.out.println("The resulting string after deleting index 8 is \"" + sentence.deleteCharAt(8));
        System.out.println("The reverse of the string is \"" + sentence.reverse());
    }

}

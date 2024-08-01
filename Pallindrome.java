import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        var word = new StringBuilder(new Scanner(System.in).nextLine().replaceAll("[,\\s!&;:]", "").toLowerCase());
        System.out.println((word == word.reverse()) ? "Pallindrome" : "Not Pallindrome");
    }
}
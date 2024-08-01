import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class LargestNumber {
    static Scanner input = new Scanner(System.in);

    public static int getInt(String message) {
        while (true) {
            System.out.println(message);
            try {
                return Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a valid number.");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Please enter 3 numbers to compare.");
        numbers.add(getInt("Enter first number :"));
        numbers.add(getInt("Enter second number :"));
        numbers.add(getInt("Enter third number :"));
        numbers.sort(Comparator.reverseOrder());
        String result = (numbers.stream().distinct().limit(2).count() <= 1) ?
                "All the numbers are Equal." :
                "The largest number is " + numbers.getFirst();
        System.out.println(result);
    }
}

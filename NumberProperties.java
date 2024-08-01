import java.util.Scanner;

public class NumberProperties {

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
        int number = getInt("Please enter a number to be evaluated.");
        if (number == 0) {
            System.out.println("The number is zero, neither positive nor negative, neither odd nor even.");
        }else{
            String positiveOrNegative = number < 0 ? "negative " : "positive ";
            String oddOrEven = number%2 == 0 ? "even " : "odd ";
            System.out.println("The number you entered is a " + positiveOrNegative + oddOrEven + "number.");
        }
    }

}

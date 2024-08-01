import java.util.Scanner;
import java.time.Month;

public class DaysInMonth {

    static Scanner input = new Scanner(System.in);

    public static int getInt(String message){
        while (true) {
            System.out.println(message);
            try {
                int x = Integer.parseInt(input.nextLine());
                if (x > 0 && x < 13) return x;
                else throw new Exception();
            } catch (Exception e){
                System.out.println("Invalid input, please enter a valid number (1-12).");
            }
        }
    }

    public static void main(String[] args) {
        int month = getInt("Please enter a month using numerical format (1-12) :");
        Month actual = Month.of(month);

        // Using short-cut method by applying built-in libraries to Java.
        System.out.println("The month of " + actual.name() + " has " + actual.length(false) + " days.");
        // Long and boring method
        System.out.print("The month of ");
        switch(month){
            case 1:
                System.out.println("January has 31 days.");
                break;
            case 2:
                System.out.println("February has 28 days.");
                break;
            case 3:
                System.out.println("March has 31 days.");
                break;
            case 4:
                System.out.println("April has 30 days.");
                break;
            case 5:
                System.out.println("May has 31 days.");
                break;
            case 6:
                System.out.println("June has 30 days.");
                break;
            case 7:
                System.out.println("July has 31 days.");
                break;
            case 8:
                System.out.println("August has 31 days.");
                break;
            case 9:
                System.out.println("September has 30 days.");
                break;
            case 10:
                System.out.println("October has 31 days.");
                break;
            case 11:
                System.out.println("November has 30 days.");
                break;
            case 12:
                System.out.println("December has 31 days.");
                break;
        }
    }
}

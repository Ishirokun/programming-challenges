import java.util.Scanner;
import java.time.DayOfWeek;

public class DaysOfTheWeek {

    static Scanner input = new Scanner(System.in);

    public static int getInt(String message) {
        while (true) {
            System.out.println(message);
            try {
                int x = Integer.parseInt(input.nextLine());
                if (x > 0 && x < 7) return x;
                else throw new Exception();
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a valid number (1-7).");
            }
        }
    }

    public static void main(String[] args) {
        int dayOftheWeek = getInt("Please enter a number between 1 and 7 to get the corresponding day of the week :");
        DayOfWeek day = DayOfWeek.of(dayOftheWeek);
        System.out.println("The corresponding day of the week is " + day.name());
    }

}

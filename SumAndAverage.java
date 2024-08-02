import java.util.ArrayList;
import java.util.Scanner;

public class SumAndAverage {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Integer> numbers = new ArrayList<>();

    public static void getIntegers(){
        while (true) {
            try {
                int toAdd = Integer.parseInt(input.nextLine());
                if (toAdd == 0) return;
                numbers.add(toAdd);
            } catch (Exception e){
                System.out.println("Invalid input, please enter a valid number.");
            }
        }
    }

    public static void main(String[] args) {
        double sum = 0;
        System.out.println("Enter a number for as much as you want, enter a 0 to sum and get the average of all the numbers.");
        getIntegers();
        for (Integer x : numbers){
            sum += x;
        }
        System.out.println("The total of all the numbers is " + sum);
        System.out.println("The average is " + sum/numbers.size());
    }
}

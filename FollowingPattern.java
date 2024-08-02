import java.util.Scanner;

public class FollowingPattern {

    static Scanner input = new Scanner(System.in);

    public static int getInt(String message){
        while (true) {
            System.out.println(message);
            try {
                return Integer.parseInt(input.nextLine());
            } catch (Exception e){
                System.out.println("Invalid input, please enter a valid number (1-12).");
            }
        }
    }

    public static void main(String[] args) {
        int startNumber = getInt("Enter a number for the pattern generation :");
        System.out.println("Resulting pattern : ");
        for(int i = startNumber; i < startNumber+10; i++){
            System.out.print(i + ", ");
        }
    }
}

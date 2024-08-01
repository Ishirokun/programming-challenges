import java.util.Scanner;

public class Scoring {
    static Scanner input = new Scanner(System.in);

    public static int getInt(String message){
        while (true) {
            System.out.println(message);
            try {
                return input.nextInt();
            } catch (Exception e){
                System.out.println("Invalid input, please enter a valid number.");
            }
        }
    }

    public static void main(String[] args) {
        int score = getInt("Enter a score to evaluated :");
        System.out.print("The score's rating is ");
        if (score < 60) {
            System.out.print("F");
        }else if(score < 70) {
            System.out.print("D");
        }else if(score < 80) {
            System.out.print("C");
        }else if(score < 90) {
            System.out.print("B");
        }else{
            System.out.print("A");
        }
        input.close();
    }
}

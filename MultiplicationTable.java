

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("~~~~~ 10x10 Multiplication Table ~~~~~");
        for (int y = 1; y <= 10; y++){
            for (int x = 1; x <= 10; x++){
                System.out.print(y*x + "\t");
            }
            System.out.print("\n");
        }
    }
}

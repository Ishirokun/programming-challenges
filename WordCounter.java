import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence to count the words :");
        String sentence = input.nextLine();
        String[] words = sentence.split("\\s+");
        List<String> trimmedWords = Arrays.stream(words).filter(x -> !x.isEmpty()).toList();
        System.out.println("Word Count : " + trimmedWords.size());
    }

}

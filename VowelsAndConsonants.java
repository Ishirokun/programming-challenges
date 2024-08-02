import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VowelsAndConsonants {

    public static void main(String[] args) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        List<Character> consonants = List.of('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
                                        'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'y', 'z');
        ArrayList<Character> foundVowels = new ArrayList<>();
        ArrayList<Character> foundConsonants = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence to check for vowels and consonants :");
        char[] sentence = input.nextLine().toCharArray();
        for (char x : sentence){
            if(vowels.contains(x)) foundVowels.add(x);
            if(consonants.contains(x)) foundConsonants.add(x);
        }
        String result = (vowels.contains(sentence[0])) ? "vowel" : "consonant";
        System.out.println("The first character of the sentence is a " + result);
        List<Character> foundVowelsList = foundVowels.stream().distinct().toList();
        List<Character> foundConsonantsList = foundConsonants.stream().distinct().toList();
        System.out.print("Found Vowels : ");
        for(Character n : foundVowelsList){
            System.out.print(n);
        }
        System.out.print("\n");
        System.out.print("Found Consonants : ");
        for(Character n : foundConsonantsList){
            System.out.print(n);
        }
    }

}

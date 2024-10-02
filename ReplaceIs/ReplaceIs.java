import java.util.Scanner;

public class ReplaceIs {
    public static void main(String[] args) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        //print output
        System.out.println("Sentence after replacing: " + notReplace(sentence));
    }

    public static String notReplace(String str) {
        //use regex to find "is" and replace it with is not
        return str.replaceAll("\\b(is)\\b", "is not");
    }
}

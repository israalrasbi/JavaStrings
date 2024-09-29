import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        System.out.println("The count of largest Block of Consecutive: " + maxBlock(word));
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
    public static int maxBlock(String str) {
        //define variables
        int strLen = str.length();
        int count = 0;

        //the outer loop will consider the current character
        for(int i = 0; i < strLen; i++) {
            //define a variable to count the current count
            int currentCount = 1;
            //the inner loop will count occurrences of the current character
            for(int j = i+1; j < strLen; j++) {
                //if the current char are not matching, then break the loop
                if(str.charAt(i) != str.charAt(j)) {
                    break;
                }
                //otherwise, update the count
                currentCount++;
            }
            //update the result
            if(currentCount > count) {
                count = currentCount;
            }
        }
        //return the count
        return count;
    }
}
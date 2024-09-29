import java.util.Scanner;

public class HappyGChecker {
    public static void main(String[] args) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        //print result
        System.out.println("Is g happy? " + isGHappy(word));

    }
    public static boolean isGHappy(String str) {
        int strLength = str.length();
        //loop through the string
        for (int i = 0; i < strLength; i++) {
            //check if the current char is g, if yes then check the letters before and after
            if(str.charAt(i) == 'g') {
                //gBefore will check the char before g (i-1), and to avoid out of bound error, i>0
                boolean gBefore = (i > 0 && str.charAt(i - 1) == 'g');
                //gAfter will check the chat after g (i+1), and to avoid out of bound error i shouldn't be the last char
                boolean gAfter = (i < strLength - 1 && str.charAt(i + 1) == 'g');
                //if there is no g before or after the current g, return false
                if(!gBefore && !gAfter ) {
                    return false;
                }
            }
        }
        //return true if all g are happy
        return true;
    }
}

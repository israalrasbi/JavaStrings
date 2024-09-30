import java.util.Scanner;

public class LongestMirrorImage {
    public static void main(String[] args) {
        //take the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        System.out.println("The mirror image is: "+mirrorEnds(word));

    }
    public static String mirrorEnds(String str){
        //define variables
        String backwordString = ""; //here store the result
        int strLen = str.length();

        //loop through the string
        for (int i = 0; i < strLen; i++) {
            //compare the first char with the last char, if there is match then concat
            //strLen-1-i >> this will access the char backwords
            //strLen - 1 >> this mean start from last element
            //-i >> increase from 0 onward
            if (str.charAt(i) == str.charAt(strLen-1-i)){
                //concat the current char
                backwordString += str.charAt(i);
            }
            //otherwise, return whatever matched char is found
            else{
                return backwordString;
            }
        }
        //return final results
        return backwordString;
    }
}

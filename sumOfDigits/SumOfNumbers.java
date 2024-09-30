import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        //take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        System.out.println("The sum of digits is: " + sumOfDigits(word));
    }

    public static int sumOfDigits(String str) {
        //define variable length
        int strLength = str.length();
        int sum = 0;
        //loop through the string to get char
        for(int i = 0; i < strLength; i++) {
            //check if the current char is integer or not
            //if yes, calculate the sum
            if(Character.isDigit(str.charAt(i))){
                //extract the number
                String numInString = str.substring(i,i+1);
                //convert the string to integer and added it to the sum
                sum += Integer.parseInt(numInString);
            }
        }
        return sum;
    }
}

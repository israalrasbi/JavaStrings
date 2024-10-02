import java.util.Scanner;

public class RemoveString {
    public static void main(String[] args) {
        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String base = sc.nextLine();
        System.out.print("Enter the string you want to remove: ");
        String remove = sc.nextLine();
        System.out.println("The new sentence is: " + withoutString(base,remove));

    }

    public static String withoutString(String base, String remove) {
        //using the replace method, it will replace the char in the remove variable with empty string
        //first check the upper char in remove var and remove them
        base = base.replace(remove.toUpperCase(), "");
        //second check the lower char in remove var and remove them
        base = base.replace(remove.toLowerCase(), "");
        //third remove any char that is mixed like HeLLo
        return base.replace(remove, "");
    }
}

package lessons;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter User Input for Year: ");
        int userInputyear =scanner.nextInt();

        //Logic
        if (userInputyear % 400 == 0) {
            System.out.println("User Input" + userInputyear + " is a leap year.");
        } else if (userInputyear % 100 == 0) {
            System.out.println("User Input" + userInputyear + " is not a leap year.");
        } else if (userInputyear % 4 == 0) {
            System.out.println("User Input" + userInputyear + " is a leap year.");
        } else {
            System.out.println(userInputyear + " is not a leap year.");
        }

    }
}

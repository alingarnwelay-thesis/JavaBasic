package lessons;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter User Input : ");
        int userInput=scanner.nextInt();
        if(userInput % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("ODD");
        }


    }
}

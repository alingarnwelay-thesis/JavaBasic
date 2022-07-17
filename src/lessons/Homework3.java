package lessons;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        char Useroperator;
        Double number1, number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        Useroperator = input.next().charAt(0);

        // ask users to enter first numbers
        System.out.println("Enter first number");
        number1 = input.nextDouble();

        // ask users to enter second numbers
        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (Useroperator) {

            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();

    }
}

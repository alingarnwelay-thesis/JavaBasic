package com.codewall.calculator;
import java.util.Locale;
import java.util.Scanner;

public class LessonTwo {
    public static void main(String[] args) {
     //precedence
        int a =7;
        int b=9;
        boolean result= a>b;
        System.out.println(result);

        boolean result1 =a>b && a<b || 6>7;
        int ab=14;
        ab=ab+5;
        ab +=8;
        ab -=5;
        int num1=9;
        int num2=4;
        int rel=num1/num2;
        int rel2= num1%num2;
        System.out.println(rel); //2
        System.out.println(rel2); //1

        //Ternary
        //Syntax ==> condition ? experssion1 : experssion2;
        String result3 =(true)? "This is ok" :"This is not ok";

        //Unary
        int abcd=12; abcd ++;
        //postfix a++ a--
        //prefix ++a --a

        //Operators
        //DataTypes


        //Control Statement
        /**
         * if
         * if else
         * if else if
         * switch
         * while
         * do while
         * for i
         * for r
         * for each
         */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Your name : ");
        String userInput=scanner.nextLine();
        userInput=userInput.toUpperCase();
        System.out.println(userInput);

        Scanner scannerAge=new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int userInputAge=scannerAge.nextInt();
        userInputAge =userInputAge;
        System.out.println("Age " + (userInputAge));

        /** IF .. ELSE
        if( userInputAge == 10) //Condition
        {
            //Implementation
            System.out.println(userInputAge);
        }
        else if( userInputAge == 15) //Condition
        {
            //Implementation
            System.out.println(userInputAge);
        }
        if( userInputAge == 20) //Condition
        {
            //Implementation
            System.out.println(userInputAge);
        }
        else
        {
            //Implementation
            System.out.println(userInputAge);
        }

    */
        /** SWITCH
        switch (userInputAge) //Expression
        {
            case 12:
                System.out.println(12);
                break;
            case 13:
                System.out.println(13);
                break;
            case 14:
                System.out.println(14);
                break;
            case 15:
                System.out.println(15);
                break;
            default:
                System.out.println("Shown default value " + userInputAge);

        }
         */
        /**
         * syntax for switch case
         * switch(){
         * case value;
         * implementation;
         * break;
         * case value;
         * implementation
         * break;
         * }
         */
 int number=0;
 while(number <5) {
     System.out.println(number);
     number++;
 }

do{
    System.out.println(number);
    number ++;
} while (number > 5);
    }
}
//arithmetic
//comparison operator < > >= <= == instead of
//Logical Operator && ||
//Bitwise operator | & ~ ^
// shift operator << >> >>>
// assignment operator ++ -- = += -= *= /= %=

/**
 * Unary
 * Binary
 * Ternary
 *
 * Operand
 */
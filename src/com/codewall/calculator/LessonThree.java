package com.codewall.calculator;
import java.util.Arrays;

public class LessonThree {
    public static void main(String[] args) {

        for(int i =0;i<5;i++)
        {
            System.out.println("i = " + i);
        }

        //ArrayExample1
        int[] numbersArray={1,23,4,3,466,7};
        String[] namesArray={"AA1","AA2","AA3","AA4","AA5"};
        char[] charsArrary ={'B','C','D','E'};
        System.out.println(Arrays.toString(numbersArray));
        System.out.println(Arrays.toString(namesArray));
        System.out.println(Arrays.toString(charsArrary));
        System.out.println("String name Arrary value are :");
        for(int i=0; i <namesArray.length;i++)
        {
            System.out.println("String arrary name ["+ i +"] value ==> " + namesArray[i]);
        }
        /**
        for (int i = namesArray.length - 1; i >= 0; i--) {

        }
         */
        for (String name:namesArray) //Foreach
        {
            System.out.println(name);
        }
    }
}
/**
 * Syntax
 *for (3 Statement) //initialize ; condition; count
 * {
 *
 *
 * }
 */
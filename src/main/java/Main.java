/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blank47
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] numbArray = new int[5];
        numbArray[0] = 55;
        numbArray[1] = 32;
        numbArray[2] = 54;
        numbArray[3] = 64;
        numbArray[4] = 14;
        System.out.println("Total = "+getTotal(numbArray));
        System.out.println("Avg = "+getAverage(numbArray));
        System.out.println("Highest = "+getHighest(numbArray));
        System.out.println("Lowest = "+getLowest(numbArray));
    }

    public static int getTotal(int[] Array) {
        int result = 0;
        for (int i = 0; i < Array.length; i++) {
            result = Array[i] + result;
        }
        return result;
    }

    public static double getAverage(int[] Array) {

        int numberOfValues = Array.length;
        int total = getTotal(Array);
        double avg = total/numberOfValues ;
        return avg;
    }

    public static int getHighest(int[] Array) {
        int result = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (result < Array[i]) {
                result = Array[i];
            }
        }
        return result;
    }

    public static int getLowest(int[] Array) {
        int result = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (result > Array[i]) {
                result = Array[i];
            }
        }
        return result;
    }

}

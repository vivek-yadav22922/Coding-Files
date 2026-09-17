package Arrayplm;

import java.util.Arrays;
import java.util.Scanner;

public class printSmallestAndgreatestpart1 {

    static void Print(int[]arr) {

        for (int i = 0; i < arr.length; i++) { // only print array//
            System.out.println(arr[i]);

        }
    }

    static void smallandlarge(int[] arr) { // this method used for array shorting//
        Arrays.sort(arr);

    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        int[]arr1= new int[n];

        System.out.println("Enter the element of array");
        for(int i=0; i< arr1.length; i++){
            arr1[i]= sc.nextInt();
        }
        System.out.println("before array sorted element");

                Print(arr1);

        System.out.println("after array sorted element");
        smallandlarge(arr1);
        Print(arr1);

    }


}
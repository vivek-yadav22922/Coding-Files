package Arrayplm;

import java.util.Scanner;

public class userbase {
   static void add(int [] arr){
     int sum= 0;
     for(int i=0; i<arr.length; i++){
         sum=sum+arr[i];
     }
        System.out.println("sum of all array element is"+ sum);

    }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the array size");
         int n = sc.nextInt();
         int[] arr = new int[n];
         for (int i = 0; i < arr.length; i++) {
             System.out.println("enter the " + i + "element of array");
             arr[i] = sc.nextInt();
         }

         for (int i = 0; i < arr.length; i++) {
             System.out.println(i + "element of array is = :" + arr[i]);


         }

         add(arr);

     }
}

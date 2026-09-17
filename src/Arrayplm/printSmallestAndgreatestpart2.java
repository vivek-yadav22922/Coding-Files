package Arrayplm;

import java.util.Arrays;
import java.util.Scanner;

public class printSmallestAndgreatestpart2 {




        static int[]smallandlarge(int[] arr) { // this method used for array shorting//
            Arrays.sort(arr);

            int[] ans= {arr[0],arr[arr.length-1]};
            return ans;

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
            System.out.println(" array sorted element");

             int[] ans =   smallandlarge(arr1);
            System.out.println("smalest element"+ ans[0]);
            System.out.println(" element"+ ans[1]);

        }



    }

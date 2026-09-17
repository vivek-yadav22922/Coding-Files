package RECURSIONRELATEDPLM;

import java.util.Scanner;

public class Factorial {
    public static int Fact(int n) {
        if (n == 0) {
            return 1 ;
        }
       return n*Fact(n-1);
    }


     static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc  = new Scanner(System.in);
        int n= sc.nextInt();
         int result =  Fact(n);
         System.out.println("factorial is == "+result);
    }

}

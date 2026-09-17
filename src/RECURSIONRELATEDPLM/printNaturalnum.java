package RECURSIONRELATEDPLM;

import java.util.Scanner;

public class printNaturalnum {
    static void pN(int n) {
        if (n == 1) { // base case
            System.out.println(1);
            return;
        }
        pN(n - 1);//recusively call itself
        System.out.println(n); // here self work//


    }

    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);// user base input//
        System.out.println("enter the number ");
        int n = sc.nextInt();

        pN(n);//function call



    }

}

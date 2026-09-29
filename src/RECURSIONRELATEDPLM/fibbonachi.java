package RECURSIONRELATEDPLM;

import java.util.Scanner;

public class fibbonachi {
    public static int fib(int n){
        if(n==0 || n==1){
            return n ;
        }
        /*int ans= 0;
        ans= fib(n-1)+fib(n-2);
        return ans;*/
        return fib(n-1)+fib(n-2);

    }

    static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc  = new Scanner(System.in);
        int n= sc.nextInt();
        fib(n);
        for(int i=0; i<=n; i++){
            System.out.println(fib(i));

        }


    }

    }


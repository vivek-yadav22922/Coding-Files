import java.util.Scanner;

public class reverseofdigit {
    static void main() {
        Scanner sc= new Scanner(System.in);
        int ans=0;
        System.out.println("enter the digit");
        int num= sc.nextInt();
        System.out.println("before reverse of digit = "+num);

        while(num>0){

         ans = ans*10+num%10;
         num= num/10;


        }

        System.out.println("after reverse of digit = "+ans );

    }
    }


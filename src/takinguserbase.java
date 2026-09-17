import java.util.Scanner;
public class takinguserbase {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a= sc.nextInt();
        System.out.println("enter the second number");
        int b= sc.nextInt();
        int sum = a+b;
        System.out.println("sum of two number = "+ sum);
/* string user base input */
        System.out.println("enter the first name");
        String name1 = sc.next();
        System.out.println("enter the second name");
        String name2 = sc.next();
        System.out.println(name1+name2);

        /* float user base input */

        System.out.println("enter the first number");
        Float d = sc.nextFloat();
        System.out.println("enter the second number");
        Float c = sc.nextFloat();
        Float sum2 = c+d;
        System.out.println("sum of two floate number =" +sum2);


    }
    }


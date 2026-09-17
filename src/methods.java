import java.util.Scanner;

public class methods {
     int add(int a, int b) {
        int sum = a + b;
       return sum;

    }

    static void main() {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  value of a");
        int a = sc.nextInt();
        System.out.println("enter the  value of  b");
        int b = sc.nextInt();

        methods obj = new methods();
        System.out.println("sum of two number is "+ obj.add(a,b));

    }

}
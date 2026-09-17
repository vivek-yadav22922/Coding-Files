import java.util.*;
public class bitwiseoperator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();//9
        System.out.println("enter the second number");
        int b = sc.nextInt();//10
        System.out.println("output all operature");
        System.out.println(a | b);// /*ans=11*/
        System.out.println(a & b);// /*ans=8*/
        System.out.println(a ^ b);// /*ans=3*/

        System.out.println(a << 1);// left shift 1times 18//
        System.out.println(a << 2);// left shift 2 times 36//

        System.out.println(b >> 1);// right shift 1 times 5//
        System.out.println(b >> 2);// right shift 2 times 2//


    }
}


import java.util.Scanner;
public class usingloop {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            System.out.println("2*"+i+"="+ i*2);
        }
    }
}



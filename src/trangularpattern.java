import java.util.Scanner;

public class trangularpattern {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row size");
        int r = sc.nextInt();
        System.out.println("enter the column size");
        int c = sc.nextInt();
        for (int i = r; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

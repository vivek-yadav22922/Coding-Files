import java.util.Scanner;
public class pyramidpattern {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row size");
        int r = sc.nextInt();
        System.out.println("enter the column size");
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r -i; j++) {//space print karayga//
                System.out.print("  ");
                for (int k = 1; k <= 2*i-1; k++) {// star print karayga//
                    System.out.print(" * ");
                }
                System.out.println();

            }
            System.out.print("");

        }
    }
}

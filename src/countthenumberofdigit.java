import java.util.Scanner;

public class countthenumberofdigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of set which you want to count");
        int num= sc.nextInt();
        int numofDigit = 0;
         while(num>0) {
             num = num / 10;

             numofDigit++;
         }
        System.out.println("total digit = "+numofDigit);
    }
}

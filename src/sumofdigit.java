import java.util.Scanner;

public class sumofdigit {
    static void main() {
        Scanner sc= new Scanner(System.in);
        int digitsum=0;
        System.out.println("enter the digit");
        int num= sc.nextInt();
        while(num>0){

            digitsum+= num%10;
            num=num/10;


        }
        System.out.println("sum of digit = "+ digitsum);

    }


}

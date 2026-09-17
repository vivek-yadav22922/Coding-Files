import java.util.Scanner;

public class voidclass {
  static  void multiply(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  value of a");
        int a = sc.nextInt();
        System.out.println("enter the  value of  b");
        int b = sc.nextInt();

        int mul= a*b;
        System.out.println(mul);



    }

    static void main() {

multiply(); // when class is static//


//     voidclass obj = new voidclass();//  class is non static
//    obj.multiply();

    }

}

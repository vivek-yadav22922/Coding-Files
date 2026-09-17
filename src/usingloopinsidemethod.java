import java.util.Scanner;

public class usingloopinsidemethod {
    static void print( int num){
        for(int i=1; i<=num; i++){
            System.out.println(2*i);



        }
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        print(x);
    }

}

package RECURSIONRELATEDPLM;

public class countThenumberofzero {
    public static int countZero(int n){
        int count=0;
        while(n>0){

            int  rem= n%10;
         if (rem==0){
           count++;
         }
         n=n/10;
        }
        return count;
    }

    static void main() {
        int n= 30204;
        System.out.println(countZero(n));
    }
}

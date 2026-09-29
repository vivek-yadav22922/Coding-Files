package RECURSIONRELATEDPLM;

public class sumOfdigit {
    public static int SumOfDigit(int n){

        if(n==1){
            return 1;
        }
        return (n%10)+SumOfDigit(n/10);

    }

    public static void main(String[] args) {
        int ans= SumOfDigit(1234);
        System.out.println(ans);
    }
}

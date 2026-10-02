package RECURSIONRELATEDPLM;

public class sumOfdigit {
    public static int SumOfDigit(int n){

        if(n%10==n){
            return n;
        }
        return (n%10)+SumOfDigit(n/10);

    }

    public static void main(String[] args) {
        int ans= SumOfDigit(12341);
        System.out.println(ans);
    }
}

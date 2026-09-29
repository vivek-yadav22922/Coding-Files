package RECURSIONRELATEDPLM;

public class palidromeUsingrecursion {
    public static int reverse(int n, int ans) {
        if(n==0){
            return ans;
        }
        ans= ans*10+n%10; // here last digit add on answer//
        return reverse(n/10,ans);
    }

    public static boolean palidrome(int n){
        if (n < 0) {//for negative
            return false;
        }
        return n==reverse(n,0);
        // Negative numbers are not palindrome


    }

    public static void main(String[] args) {
        int n=121;
        int ans=0;
        System.out.println(palidrome(n));
    }
}

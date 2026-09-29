package RECURSIONRELATEDPLM;

public class ReverseNumberUsingRecursion {
    public static int reverse(int n, int ans) {
        if(n==0){
            return ans;
        }
        ans= ans*10+n%10; // here last digit add on answer//
         return reverse(n/10,ans);
    }



    public static void main(String[] args) {
        int n=1234;
        int ans=0;
        System.out.println(reverse(n,ans));

    }
}

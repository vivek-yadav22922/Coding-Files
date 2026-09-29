package RECURSIONRELATEDPLM;

public class productofdigit {
    public static int Product(int n){



        if((n%10)==n){
            return n;
        }
        return (n%10)*Product(n/10);

    }

    public static void main(String[] args) {
        int ans= Product(88);
        System.out.println(ans);
    }
}

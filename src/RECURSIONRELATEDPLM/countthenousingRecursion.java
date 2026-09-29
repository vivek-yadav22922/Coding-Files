package RECURSIONRELATEDPLM;

public class countthenousingRecursion {
    public static int countzero(int n,int count){
        if(n==0){
            return count;
        }
        int remainder= n%10;
        if(remainder==0){
            count++;
        }

       return countzero(n/10,count);
    }


    static void main() {
        int n=3020004;
        int count=0;
        System.out.println(countzero(n,count));
    }
}

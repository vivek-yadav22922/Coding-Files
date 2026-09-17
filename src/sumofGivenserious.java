public class sumofGivenserious {
    static void main() {
        int ans=0;
        for(int i=1; i<=5; i++){
            if(i%2==0){
                ans=ans-i;
            }
            else{
                ans=ans+i;
            }
        }

        System.out.println("sum of given series = "+ans);
    }
}

package HashsetRelatedPLM;

import java.util.HashSet;
import java.util.Scanner;

public class Happynumber {

    static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER the number and check number is happy or not");
            int n = sc.nextInt();
            Happynumber H= new Happynumber();
            System.out.println(H.numberisHappyORnot(n));

        }

        public boolean numberisHappyORnot(int n) {
            HashSet<Integer> set=new HashSet<>();
            while (n!=1 && !set.contains(n)){
                set.add(n);

                int sum =0;
                while(n>0){
                    int digit= n%10;
                    sum+= digit*digit;
                    n= n/10;
                }

                n=sum;
            }
            return n==1;
        }

    }


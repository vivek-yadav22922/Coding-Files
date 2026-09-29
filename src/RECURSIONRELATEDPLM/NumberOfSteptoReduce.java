package RECURSIONRELATEDPLM;

import com.sun.source.tree.BreakTree;

public class NumberOfSteptoReduce {
        public static int numberOfSteps(int num) {
return helpher(num,0);
        }

        private  static int helpher(int num, int steps){
            if(num==0){
                return steps;
            }
if(num%2==0){
    return helpher(num/2,steps+1);
}
            return helpher (num-1,steps+1);
        }


    public static void main(String[] args) {
        int n= 14;

        System.out.println(numberOfSteps(n));
    }
    }


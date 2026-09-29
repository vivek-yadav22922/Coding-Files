package STACKRELATEDPLM;

import java.util.Arrays;
import java.util.Stack;

public class Stockspanplm {
    public static int[] StockSpan(int[] price) {
        Stack<Integer> st = new Stack<>();
        int n= price.length;
        int[] ans = new int[n];

        for(int i=0; i<n; i++){

            while(!st.isEmpty() && price[st.peek()]< price[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]= i+1;
            }
            else {

               ans[i]= i-st.peek();
            }
           st.push(i);

        }
        return ans;
    }

    public static void main(String[] args) {
        int[]price= {100,80,60,70,60,75,85};
        int[]answe= StockSpan(price);
        System.out.println(Arrays.toString(answe));

    }
}
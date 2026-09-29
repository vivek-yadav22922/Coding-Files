package STACKRELATEDPLM;

import java.util.ArrayList;
import java.util.Stack;

public class StackSpan2Usinglinklist {
    Stack<Integer> st= new Stack<>();
    ArrayList<Integer> list= new ArrayList<>();
    int i=0;


    public int next (int price){
        list.add(price);

        while (!st.isEmpty() && list.get(st.peek())<=price){
            st.pop();
        }
        int span;
        if(st.isEmpty()){
            span= i+1;
        }
        else{
             span= i-st.peek();
        }

      st.push(i);
        return span;

    }

}

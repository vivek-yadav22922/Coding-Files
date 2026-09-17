package STACKRELATEDPLM;

import java.util.Stack;

public class InsertElementStackonBoTTom {
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop(); //recursively pop kar dega top wise //
        pushAtBottom(data, s);
        s.push(top);

    }

    static void main(String[] args) {
Stack<Integer> s= new Stack<>();
s.push(1);
s.push(2);
s.push(3);

pushAtBottom(4,s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}



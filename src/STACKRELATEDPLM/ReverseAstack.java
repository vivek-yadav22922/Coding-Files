package STACKRELATEDPLM;

import java.util.Stack;

public class ReverseAstack {
    public  static void   pushBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top= s.pop();
        pushBottom(data,s);
        s.push(top);

    }
  public static void Reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
    int top= s.pop();
    Reverse(s);// recursively reverse karagay //
      pushBottom(top,s);
    }

    static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        Reverse(s);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

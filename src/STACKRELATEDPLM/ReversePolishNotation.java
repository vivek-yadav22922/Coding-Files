package STACKRELATEDPLM;


import java.util.Stack;

public class ReversePolishNotation {
    public static int RPN(String[]tokens){
        Stack<Integer> st= new Stack<>();
        for(String token : tokens){
            if(token.equals("+")||token.equals("-")||token.equals("/")||token.equals("*")){
               //

               int b= st.pop();
               int a= st.pop();
               int result;

               if(token.equals("+")){
                   result = a+b;
               } else if(token.equals("-")){
                    result = a-b;
                } else if(token.equals("*")){
                   result = a*b;
               }else{
                   result= a/b;
               }
               st.push(result);
            }
           else {
               int num =  Integer.parseInt(token); //it convert string int integrs like "5"-->5
               st.push(num);
           }
        }
        return st.pop();

    }

    public static void main(String[] args) {
        String [] tokens= {"2","1","+","3","*"};
        int ans = RPN(tokens);
        System.out.println(ans);
    }
}

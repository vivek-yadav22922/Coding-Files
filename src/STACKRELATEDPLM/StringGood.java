package STACKRELATEDPLM;

import java.util.Stack;

public class StringGood {
    public static String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(!st.isEmpty() && Character.toLowerCase(st.peek())== Character.toLowerCase(ch)
            && Character.isUpperCase(st.peek())!= Character.isUpperCase(ch)){
                st.pop();

            }else{
                st.push(ch);

            }
        }
StringBuilder sb= new StringBuilder();
        for(char ch : st){
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s= "AbBac";
        System.out.println(makeGood(s));

    }
}

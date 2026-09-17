package STACKRELATEDPLM;
import java.util.Stack;
public class removeAdjacent{
    public static String removeDuplicates(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0;  i<s.length(); i++){
            char ch= s.charAt(i);
            if(!st.isEmpty() && st.peek()==ch){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder(); // here create stringBuider for storing character value from string//
        for(char ch : st){
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));

    }
}

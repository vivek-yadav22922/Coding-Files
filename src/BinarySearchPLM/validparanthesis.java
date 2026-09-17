package BinarySearchPLM;

import java.util.Stack;

public class validparanthesis {
    public static boolean validParenthesis(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);

            if(ch=='(' || ch== '{' || ch=='['){ //here opening bracket opening match//
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }

                char top= st.peek();
                if((ch==')' && top=='(') ||( ch==']' && top=='[')||(ch=='}' && top=='{')){ //here closing bracket//
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s= "({[]})";
        System.out.println(validParenthesis(s));
    }

    }





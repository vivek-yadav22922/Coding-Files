package STACKRELATEDPLM;

import java.util.Stack;

public class BackspaceStringCampare {
    public static boolean backspaceCompare(String s, String t) {
Stack<Character> s1= new Stack<>();
Stack<Character> s2= new Stack<>();
// process string s//
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);


                if(ch== '#'){
                    if(!s1.isEmpty()) {
                        s1.pop();
                    }
                }else {

                    s1.push(ch);
                }
            }


 // process string t for stack s2//
        for(int i=0; i<t.length(); i++){
            char ch= s.charAt(i);


                if(ch== '#'){
                    if(!s2.isEmpty()) {
                        s2.pop();
                    }
                }else {

                    s2.push(ch);
                }
            }

       return s1.equals(s2);

    }

    public static void main(String[] args) {
        String s="ab#e";
        String t= "ad#c";
        System.out.println(backspaceCompare(s,t));
    }
}

package STACKRELATEDPLM;

import java.util.Stack;

public class calculater2 {
public static int Calculater2(String s){
    Stack<Integer>st= new Stack<>();
     int n= s.length();
     int previousCharacter= '+';
     int num=0;

     for(int i=0; i<n; i++){
         char ch= s.charAt(i);

         if(Character.isDigit(ch)){
             num= num*10+(ch - '0');
         }

              if(!Character.isDigit(ch) && ch!=' ' || i== s.length()-1){
                  if(previousCharacter=='+'){
                      st.push(num);
                  }
               else if(previousCharacter=='-'){
                      st.push(-num);
                  }
               else  if(previousCharacter=='*'){
                      st.push(st.pop()*num);
               }
                else if(previousCharacter=='/'){
                      st.push(st.pop()*num);
                  }

               previousCharacter=ch;
                num=0;
              }
     }
     int ans=0;
     while(!st.isEmpty()){
     ans+=st.pop();

     }
return ans;

}

    public static void main(String[] args) {
        String s= "3+2*2";
        int ans= Calculater2(s);
        System.out.println(ans);
    }

}

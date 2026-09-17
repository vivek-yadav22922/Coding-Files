package HashmAPrelatedPlm;

import java.util.HashMap;
import java.util.HashSet;

public class NonRepitingelement2 {
    static void main(String[] args) {
        String s= "swiss";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        boolean found= false;
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(map.get(ch)==1){
                System.out.println("first non repeating character is : " +ch);
             found=true;
             break;
            }
        }
        if(!found){
            System.out.println("not any non repeating charater");
        }
    }
}

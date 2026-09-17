package HashmAPrelatedPlm;

import java.util.HashMap;
import java.util.HashSet;

public class firstReapitingCharacter {
    static void main(String[] args) {
        String str= "abcaebd";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);

            }
            else {
                if(map.containsKey(ch)){
                    System.out.println("this is first reapiting charater =" + ch);
                    break;
                }
            }
        }
    }


}

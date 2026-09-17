package HashmAPrelatedPlm;

import java.util.HashMap;

public class isomorphicString {
    public boolean Isomorphic(String s, String t){
        HashMap<Character,Character> map= new HashMap<>();
        if(s.length() != t.length()) { // here check both  string length //
            return false;
        }
        for(int i=0; i<s.length(); i++){
            Character sch= s.charAt(i);
            Character tch= t.charAt(i);
            if(map.containsKey(sch)){
                if (map.get(sch) != tch) { // here check mapping //
                    return false;
                }
            }
            // New character
            else {

                // Another character is already mapped to tch
                if (map.containsValue(tch)) {
                    return false;
                }

                map.put(sch, tch);
            }

        }
       return true;


    }

    static void main(String[] args) {
        String s= "paper";
        String t= "title";
        isomorphicString S= new isomorphicString();
        System.out.println( S.Isomorphic(s,t));
    }
}

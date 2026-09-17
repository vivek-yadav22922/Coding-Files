package Arrayplm;

import java.util.HashMap;

public class longestSubSTring {
    public static int longestsubStringWithKuniqueCharacter(String s, int k){
        int i=0;
        int j=0;
        int n= s.length();
        int max= Integer.MIN_VALUE;
        HashMap<Character,Integer> map= new HashMap<>();
        while(j<n){
            char ch= s.charAt(j);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }

            if(map.size()>k){ // firstly window ko expand karo //
                while(map.size()>k){
                    char remove=s.charAt(i);
                    map.put(remove,map.get(remove)-1);
                    if(map.get(remove)==0){
                        map.remove(remove);
                    }
                    i++;
                }

            }

            if(map.size()==k){
                max= Math.max(max, j-i+1);
            }
            j++;
        }
       return max;

    }

    static void main() {
        String s= "aabacbcbebe";
        int k=3;
        int result= longestsubStringWithKuniqueCharacter(s,k);
        System.out.println(result);
    }
}

package Arrayplm;

import java.util.HashMap;

public class withoutRepeatinglongestSubarray {
    public static int longessubString(String s){
        int i=0;
        int j=0;
        int max= 0;
        int n= s.length();
        HashMap<Character,Integer>map= new HashMap<>();
        while(j<n){
            char ch= s.charAt(j);
            while(map.containsKey(ch)){
                char remove= s.charAt(i);
                map.remove(remove);
                i++;
            }
            map.put(ch,1);
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }

    static void main(String[] args) {
         String s = "abcabcbb";
        int result= longessubString(s);
        System.out.println(result);
    }
}

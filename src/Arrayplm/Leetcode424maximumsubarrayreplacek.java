package Arrayplm;

import java.util.HashMap;

public class Leetcode424maximumsubarrayreplacek {
    public static int ReplaceKelementMaximumsubarray(String s, int k){
        int i=0;
        int j=0;
        int maxfreq=0;
        int maxsubArray=0;
        HashMap<Character,Integer> map= new HashMap<>();
        while(j<s.length()){
            char ch= s.charAt(j);
            if(!map.containsKey(ch)){
                map.put(ch,1);

            }else{
                map.put(ch, map.get(ch)+1);
            }
           maxfreq= Math.max(maxfreq,map.get(ch)); // here store maximum frequency//

            while ((j-i+1) - (maxfreq)> k){
                char rch= s.charAt(i);
                map.put(rch, map.get(rch)-1);
                i++;
            }

            if((j-i+1) - (maxfreq) == k){
                maxsubArray= Math.max(maxsubArray,j-i+1);
            }
            j++;
        }

        return maxsubArray;
    }

    static void main(String[] args) {
        String s= "AABABBA";
        int k=1;
        int result= ReplaceKelementMaximumsubarray(s,k);
        System.out.println(result);
    }


}

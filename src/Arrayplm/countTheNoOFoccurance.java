package Arrayplm;

import java.util.HashMap;

public class countTheNoOFoccurance {
    public static int anagramOccurance(String txt, String pat){
        int k= pat.length();
        int count=0;
        HashMap<Character, Integer> map= new HashMap<>(); // here store frequency of pattern//
        for(int i=0; i<pat.length(); i++){
            char ch= pat.charAt(i);
            if(!map.containsKey(ch)) {
                map.put(ch, 1);
            }else {
                map.put( ch,  map.get(ch)+1);
            }
        }

       // here store window of frequency //
       HashMap<Character , Integer> window=new HashMap<>();
        int i=0; //left
        int j=0; // right
        while (j< txt.length()){
            char ch= txt.charAt(j);
            if(!window.containsKey(ch)) {
                window.put(ch, 1);
            }else{
                window.put(ch,window.get(ch)+1);
            }
            // here check while window is small //
            if(j-i+1< k){
                j++;
            }

            // here window size ho gya //

            else{
                if(map.equals(window)){
                    count++;
                }
                // left character remove //
                char lrem= txt.charAt(i);
                window.put(lrem, window.get(lrem)-1);
                if(window.get(lrem)==0){
              window.remove(lrem);
                }
                i++;
                j++;
            }
        }
        return count;

    }

    static void main(String[] args) {
        String text= "forxxorfxdofr";
        String pattern ="for";
        int ans= anagramOccurance(text,pattern);
        System.out.println("anagram occurence in text string =:"+ans);
    }
}

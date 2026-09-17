package HashmAPrelatedPlm;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class Anagram {
    static HashMap<Character, Integer> makeFrequencyMap(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int currFrequency = map.get(ch);
                map.put(ch, currFrequency + 1);
            }

        }
        return map;
    }

    public boolean isAngular(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> mp1= makeFrequencyMap(s);
        HashMap<Character, Integer> mp2= makeFrequencyMap(t);
return  mp1.equals(mp2);

    }

    static void main(String[] args) {
        String s = "listen";
        String t= "silent";
        Anagram an= new Anagram();
        System.out.println(an.isAngular(s,t));
    }

}
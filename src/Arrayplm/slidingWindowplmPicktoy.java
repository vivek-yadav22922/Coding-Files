package Arrayplm;

import com.sun.nio.sctp.SctpChannel;

import java.util.HashMap;

public class slidingWindowplmPicktoy {
    public static int pickToy(String s){
        int i=0;
        int j=0;
        int max=0;
        HashMap<Character,Integer>map= new HashMap<>();
        while (j<s.length()){
            char ch= s.charAt(j);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else {
                map.put(ch, map.get(ch) + 1);
            }
            while (map.size()>2){
             char remove= s.charAt(i);
             map.put(remove,map.get(remove)-1);
             if(map.get(remove)==0){
                 map.remove(remove);
             }
             i++;
            }
            if(map.size()<=2){
                max= Math.max(max,j-i+1);
            }
           j++;
        }
        return max;

    }

    static void main(String[] args) {
        String s=" abaccab";
        int result= pickToy(s);
        System.out.println(result);


    }
}

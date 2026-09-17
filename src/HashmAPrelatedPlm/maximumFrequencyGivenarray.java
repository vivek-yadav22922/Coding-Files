package HashmAPrelatedPlm;

import java.util.HashMap;

public class maximumFrequencyGivenarray {
    static void main(String[] args) {
        int[] arr={1,2,4,5,6,11,3,9,1,1,2,6,6,1,1,8};

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int el: arr){
            if(!map.containsKey(el)){
                map.put(el,1);
            }else{
                map.put(el,map.get(el)+1);
            }
        }
        System.out.println("frequency map");
        System.out.println(map.entrySet());

        // but here we want maximum frequency wala element print ho//
        int maxfreq=0;
        int anskey= -1;

        for(var e: map.entrySet()){
            if(e.getValue()> maxfreq){
                maxfreq= e.getValue();
                anskey= e.getKey();
            }
        }
        System.out.printf("%d has max frequency and it occur %d imes \n" ,anskey,maxfreq);
    }
}

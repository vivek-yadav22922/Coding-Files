package HashmAPrelatedPlm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GROUPANagram {
    static void main(String[] args) {
        String [] stra= {"eat","tea", "tan","ate","nat","bat"};// String array//
        HashMap<String, List<String>> map= new HashMap<>();
        for(String s: stra){
            char[]ch= s.toCharArray();
            Arrays.sort(ch);
            String key= new String(ch);
            if(map.containsKey(key)){

                map.get(key).add(s);
            }else {

                List <String> list=new ArrayList<>();
                list.add(s);
                map.put(key,list);
            }
        }
        List<List<String>> ans= new ArrayList<>( map.values());
        System.out.println();
        System.out.println(ans);

    }
}

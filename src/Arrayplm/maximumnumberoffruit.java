package Arrayplm;

import java.util.HashMap;

public class maximumnumberoffruit {

    public static int pickFruit(int[]fruits){
            int i=0;
            int j=0;
            int max=0;
            HashMap<Integer,Integer> map= new HashMap<>();
            while (j<fruits.length){
                int el= fruits[j];
                if(!map.containsKey(el)){
                    map.put(el,1);
                }else {
                    map.put(el, map.get(el) + 1);
                }
                while (map.size()>2){
                    int remove= fruits[i];
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
            int[]fruits ={1,2,3,2,2};
            int result= pickFruit(fruits);
            System.out.println(result);


        }
    }



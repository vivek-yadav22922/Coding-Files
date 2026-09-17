package HashmAPrelatedPlm;

import java.util.HashMap;

public class NonrepeatingCharacter {
    static void main(String[] args) {
//        String s = "abcadbc";
       String s = "swiss";


            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char st = s.charAt(i);
                if (!map.containsKey(st)) {
                    map.put(st, 1);
                } else {
                    map.put(st, map.get(st) + 1);
                }

            }
            Character Nrep=null;
            int freq = 0;

            for (var e : map.entrySet()) {
                if (e.getValue() == 1) {
                    Nrep = e.getKey();
                    freq = e.getValue();
                    System.out.printf("%s has occur %d times",Nrep,freq);
break;
                }
            }


        }

    }

package HashmAPrelatedPlm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MOSTfrequentelement {
    static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3,3,3,3,3};
        int k = 3;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int el = arr[i];
            if (map.containsKey(el)) {
                map.put(el, map.get(el) + 1);
            } else {
                map.put(el, 1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int maxfreq = 0;
            int maxelement = 0;

            for (int key : map.keySet()) {
                if (map.get(key) > maxfreq) {
                    maxfreq = map.get(key);
                    maxelement = key;
                }
            }
            ans.add(maxelement);
            map.remove(maxelement);

        }

        System.out.println(ans);
    }
    }


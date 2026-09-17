package HashmAPrelatedPlm;
import java.util.HashMap;
public class  isomorphic2 {

    public boolean isIsomorphic(String s, String t) {

            if (s.length() != t.length()) {
                return false;
            }

            HashMap<Character, Character> mapST = new HashMap<>();
            HashMap<Character, Character> mapTS = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {

                char sc = s.charAt(i);
                char tc = t.charAt(i);

                if (mapST.containsKey(sc) && mapST.get(sc) != tc) {
                    return false;
                }

                if (mapTS.containsKey(tc) && mapTS.get(tc) != sc) {
                    return false;
                }

                mapST.put(sc, tc);
                mapTS.put(tc, sc);
            }

            return true;
        }

    static void main(String[] args) {
        String s= "paper";
        String t= "title";
        isomorphic2 S= new isomorphic2();
        System.out.println(S.isIsomorphic(s,t));


    }
    }


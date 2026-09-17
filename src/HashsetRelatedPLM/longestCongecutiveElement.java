package HashsetRelatedPLM;

import java.util.HashSet;

public class longestCongecutiveElement {
    public int longestconsequitiveElementsLENGTH(int[]arr){
        HashSet<Integer> set= new HashSet<>();
        for(int num : arr){ // here array element add inside hashset for duplicate element remove//
            set.add(num);

        }
        int maxstreak=0;
        for(int num: set){
            if(!set.contains(num-1)){

                int currnum= num;
                int currStreak=1; // length of current consiquitive sequences//

                while(set.contains(currnum+1)){// here travers fix lenth not starting //
                    currStreak++;
                    currnum++;
                }

               maxstreak= Math.max(maxstreak,currStreak);// over all maximum length//

            }
        }

        return maxstreak;
    }

    static void main(String[] args) {
        longestCongecutiveElement E= new longestCongecutiveElement();
        int[]arr={99,1,100,4,200,1,2,2,3,5,6,7,8,9,0};
         int  length =   E.longestconsequitiveElementsLENGTH(arr);
        System.out.println( "maximum length of consecutive element is == "+length);
    }

    }


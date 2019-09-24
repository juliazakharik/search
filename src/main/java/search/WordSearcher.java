package search;

import constants.Constants;

import java.util.ArrayList;
import java.util.List;

import static compare.WordComparer.preCompare;

public class WordSearcher {
    public static List<String> search(List<String> arr, String entered){
        String[] subStr;
        entered = entered.toLowerCase();
        String delimeter = " "; // Разделитель
        subStr = entered.split(delimeter);
        List<String> res = new ArrayList<String>();
        for(int i = 0; i < subStr.length; i++) {
            String temp = preCompare(arr, subStr[i]);
            if(!temp.equals("no match")){
                res.add(temp);
            }
            else{
                String t = perhapsSearch(arr, subStr[i]);
                if(!t.equals("no match"))
                    res.add(t);
            }
        }
        return res;
    }

    public static String perhapsSearch(List<String> arr, String entered){
        String res ="";
        int coincidence = 0;
        int dist = 0;
        for(String word:arr) {

//            char repetitive = ' ';
//            int repetitiveInd = 0;
//            int dist = 0;
            dist = 0;
            coincidence = 0;
            boolean dif = false;
            for (int i = 0, j = 0; i < word.length();i++) {
                if (word.charAt(i) == entered.charAt(j)) {
                    System.out.println(word.charAt(i)+" "+entered.charAt(j)+" "+i);

                    j++;
                    coincidence++;
//                    if (i - repetitiveInd < Constants.getRepetitiveInd()) {
//                        dist++;
//                    }
//                    repetitiveInd = i;

                }
                else {
                    dist++;

//                    dif = true;
//                    if(dif) {
//
//                        dist++;
//                    }
//                    else{
//                        dif = true;
//                    }
                }
                if(dist>5)
                    break;
            }
//            if(dist<minDist&&dist!=0){
//                res = word;
//                System.out.println(entered);
//                minDist = dist;
//            }
        }
        if ((double)coincidence/entered.length()>=Constants.getEqualPerc()) {
            System.out.println((double)coincidence/entered.length()+" "+res);
            return "perhaps: " + res;
        }
        return "no match";
    }

}

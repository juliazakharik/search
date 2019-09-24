package compare;

import constants.Constants;

import java.util.List;

import static help.Math.*;

public class WordComparer {
    public static String compare(List<String> arr, String right){
        double max = 0;
        double maxPerc = 0;
        String r = "";
        for(String i : arr) {
            double perc = perc(i, right);


            if (perc > Constants.getEqualPerc()) {
                if(perc > max){
                    if((double)min(i.length(), right.length())/max(i.length(), right.length())>maxPerc){
                        max =  perc;
                        r=i;
                        maxPerc=(double)min(i.length(), right.length())/max(i.length(), right.length());
                    }

                }
            }
        }
        if(!r.equals("")){
            return r;
        }
        return "no match";
    }

    public static String preCompare(List<String> arr, String entered){
        while(!entered.isEmpty()) {
            String comp = compare(arr, entered);

            if (comp.equals("no match")) {
                entered = entered.substring(1);
            }
            else{
                return comp;
            }
        }
        return "no match";
    }
}

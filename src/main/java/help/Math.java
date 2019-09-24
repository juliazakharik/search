package help;

public class Math {

    public static double perc(String right, String s){
        String temp = s.length() - right.length() > 0? right : s;//if-else
        return (double)hamm(right, s)/temp.length();
    }

    public static double percWrong(String right, String s){
        int temp = s.length() - right.length() > 0? right.length() : s.length();//if-else
        return (double)hamm(right, s)/temp;
    }
    public static int hamm(String s1, String s2){
        String temp = s1.length() - s2.length() > 0? s2 : s1;//if-else
        int hamm = 0;
        char[] s1ch = s1.toCharArray();
        char[] s2ch = s2.toCharArray();
        for(int i = 0; i < temp.length();i++){
            if(s1ch[i] == s2ch[i]){
                hamm++;
            }
        }
        return hamm;
    }

    public static int min(int a, int b){
        return a < b?a:b;
    }

    public static int max(int a, int b){
        return a > b?a:b;
    }
}

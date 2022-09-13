import java.util.*;

class StringBackspace{
    public static void main(String args[]){
        

        String s = "xywrrmp";
        String t = "xywrrmu#p";
        boolean ans = backspaceCompare(s, t);
        System.out.println(ans);
    }
    
    public static boolean backspaceCompare(String s, String t) {
        int s_length = s.length();
        int t_length = t.length();
        int xs = 0;
        int xt = 0;
        String newS = "";
        for(int i=0;i<s_length;i++){
            if(s.charAt(i)=='#'){
                //xs = xs+1;
                s = removeEle(s, i);
            }
        }
        for(int i=0;i<t_length;i++){
            if(t.charAt(i)=='#'){
                xt = xt+1;
            }
        }
        int ls = s.lastIndexOf('#');
        for(int i=ls;i>-1;i--){
            if(s.charAt(i)!='#' && xs!=0){
                s = s.replace(s.charAt(i), '');
                xs--;
            }
        }
        int lt = t.lastIndexOf('#');
        for(int i=lt;i>-1;i--){
            if(t.charAt(i)!='#' && xt!=0){
                t = t.replace(t.charAt(i), '');
                xt--;
            }
        }


        System.out.println("s: "+s);
        System.out.println("t: "+t);
        if(s_length<=t_length){
            for(int i=0;i<s_length;i++){
                if(s.charAt(i)!=t.charAt(i)){
                    return false;
                }
            }
        }
        else{
            for(int i=0;i<t_length;i++){
                if(s.charAt(i)!=t.charAt(i)){
                    return false;
                }
            }
        }
        return true;
        
    }

    public static String removeEle(String s, int i){
        return s.substring(0, i-2) + s.substring(i + 1); 
    }

}
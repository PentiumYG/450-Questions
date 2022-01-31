//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class StringAllSubsequences {
    static Set<String> arr = new HashSet<>();
    public static void main(String[] args) {
        String s="abcd";
        subsequence(s);
        System.out.print(arr);
    }
    public static void subsequence(String s){
        for(int i=0;i<s.length();i++){
            for(int j=s.length();j>i;j--){
                arr.add(s.substring(i, j));
                for(int k=0;k<s.length()-1;k++){
                    StringBuffer sb= new StringBuffer(s);
                    sb.deleteCharAt(k);
                    if(!arr.contains(sb)){
                        subsequence(sb.toString());
                    }
                }
            }
        }
    }
}

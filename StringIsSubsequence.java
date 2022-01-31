public class StringIsSubsequence {
    public static void main(String[] args) {
        String s="abc";
        String t = "gahandjbsic";
        boolean ans = isSubsequence(s, t);
        System.out.println(ans);
    }
    public static boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int n1=s.length();
        int n2=t.length();
        while(i<n1 && j<n2){
            if(s.charAt(i)==t.charAt(j)){
                i=i+1;
                j=j+1;
            }
            else{
                j=j+1;
            }
        }
        if(i==n1){
            return true;
        }
        else{
            return false;
        }
    }
}

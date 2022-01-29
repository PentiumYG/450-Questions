import java.util.*;
public class StringPalindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        boolean t=isPalindrome(s);
        System.out.println(t);
    }
//Method -1 using seperate list to store complete Alphanumeric String
//TC : O(n^2)
//SC: O(n)
    // public static boolean isPalindrome(String s) {
    //     String a=s.replaceAll("[^a-zA-Z0-9]+","");
    //     a=a.toLowerCase();
    //     System.out.println("a= "+a);
    //     int n=a.length();
    //     ArrayList<Character> b=new ArrayList<Character>();
    //     for(int i=n-1;i>-1;i--){
    //         char c=a.charAt(i);
    //         b.add(c);
    //     }
    //     System.out.println("b= "+b);
    //     int count=0;
    //     for(int i=0;i<n;i++){
    //         char c=a.charAt(i);
    //         if(c==b.get(i)){
    //             count++;
    //         }
    //     }
    //     System.out.println("n= "+n);
    //     System.out.println("count= "+count);
    //     if(count==n){
    //         return true;
    //     }
        
    //     return false;
    // }
}

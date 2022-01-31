public class StringLongestPalindrome {
    public static void main(String[] args) {
        String s = "abaxyzzyxf";
        // String l = s.substring(0,1);
        // System.out.println("String: "+l);
        String ans = longestPalindrome(s);
        System.out.println("Longest palindrome: "+ans);

    }
    public static String longestPalindrome(String s) {
        String currentLongest = s.substring(0,1);
        int n=s.length();
        for(int i=1;i<n;i++){
            String odd = getLongestPalindromeFrom(s, i-1, i+1);
            System.out.println("odd: "+odd);
            String even = getLongestPalindromeFrom(s, i-1, i);
            System.out.println("even: "+even);
            int oddLength = odd.length();
            int evenLength = even.length();
            int currentLongestLength = currentLongest.length();
            if(oddLength>evenLength && oddLength>currentLongestLength){
                currentLongest=odd;
            }
            if(evenLength>=oddLength && evenLength>currentLongestLength){
                currentLongest=even;
            }
            
        }
        System.out.println("currentLongest: "+currentLongest);
        return currentLongest;
        
    }
    public static String getLongestPalindromeFrom(String s, int leftidx, int rightidx){
        while(leftidx>=0 && rightidx < s.length()){
            if(s.charAt(leftidx) != s.charAt(rightidx)){
                break;
            }
            leftidx = leftidx -1;
            rightidx = rightidx +1;
        }
        String str = s.substring(leftidx+1, rightidx);
        System.out.println("Susbstring returned: "+str);
        return str;
    }
}

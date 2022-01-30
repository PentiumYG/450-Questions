/*Given a string s='xyz' consisting of only lowercase and unique alphabets from a to b 
generate a cypher text which shifts the given string by n.

for example: n=2 and s='xyz'
output string is: "zab" i.e. shifted all letters by 2 */

import java.util.*;
public class StringCeasarCypher {
    public static void main(String[] args) {
        String s="aaa";
        int shifts[]={1,2,3};
        String ans = shiftingLetters(s, shifts);
        System.out.println(ans);
    }
    //TC :TLE
    public static String shiftingLetters(String s, int[] shifts) {
        int n=s.length();  //n=3   'aaa'
        int nlc; 
        char nl;
        for(int i=0;i<n;i++){   //i=2
            for(int j=0;j<=i;j++){   //j=0
                char ch = s.charAt(j); //d
                int sh = shifts[i]%26; //2
                nlc = ((int) ch) + sh; //99
                if(nlc<=122){
                    nl = (char) nlc;  //c
                    s = s.substring(0, j) + nl + s.substring(j + 1);
                }
                else{
                    nl= (char) (96 + (nlc % 122));
                    s = s.substring(0, j) + nl + s.substring(j + 1);
                }
            }
        }
        return s;
    }
}

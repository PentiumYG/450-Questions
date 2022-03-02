// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class SearchSortCountSq {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            System.out.println(Sol.countSquares(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Sol {
    static int countSquares(int N) {
        
        int count =0;
        for(int i=1;i<Math.sqrt(N);i++){
            count++;
        }
        return count;
    }
}
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class SearchSortMiddle {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int A=Integer.parseInt(S[0]);
            int B=Integer.parseInt(S[1]);
            int C=Integer.parseInt(S[2]);
            Solu ob = new Solu();
            System.out.println(ob.middle(A,B,C));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solu{
    int middle(int A, int B, int C){
        //code here
        int arr[] = new int[3];
        arr[0]=A;
        arr[1]=B;
        arr[2]=C;
        Arrays.sort(arr);
        return arr[1];
    }
}

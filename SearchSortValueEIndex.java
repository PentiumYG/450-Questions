// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;

public class SearchSortValueEIndex {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            ArrayList<Integer> ans = new ValIndex().valueEqualToIndex(arr, n);
            if (ans.size() == 0) {
                System.out.println("Not Found");
            } else {
                for (Integer x : ans) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class ValIndex {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> lis = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
                lis.add(i+1);
            }
        }
        return lis;
    }
}

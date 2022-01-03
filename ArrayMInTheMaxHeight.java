import java.io.*;
import java.util.*;

  public class ArrayMInTheMaxHeight {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new MinMaxHeight().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}

class MinMaxHeight {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int avg = average(arr, n);
        System.out.println("Average is : " +avg);
        for(int i=0;i<n;i++){
            if(arr[i] < avg){
                arr[i] = arr[i] + k;
            }
            else if (arr[i] - k < 0) {
                arr[i] = arr[i] + k;
            }
            else{
                arr[i] = arr[i] - k;
            }
        }
        int min = minimum(arr, n);
        int max2 = maximum(arr, n);
        int diff = max2 - min;
        return diff;
    }
    private int minimum(int[] arr, int n) {
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    private int maximum(int[] arr, int n) {
        int max=0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    private int average(int[] arr, int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        int avg = (int)sum/n;
        return avg;
    }
    
}


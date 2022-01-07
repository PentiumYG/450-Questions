public class ArrayMergeIntervals {
    public static void main(String[] args) {
        
    }
}
class Solution {
    public int[][] merge(int[][] intervals) {
        
        int n = intervals.length;
        //int[][] arr=new int[n][2];
       // int[] a=new int[2];
        int k=n;
        if(n==1){
            return intervals;
        }
        for(int i=1;i<n;i++){
            if(intervals[i-1][1]>=intervals[i][0] && intervals[i-1][0]<=intervals[i][1]){
                k=k-1;
                break;
            }  
        }
        if(k<n){
            int[][] arr=new int[k][2];
            for(int i=1;i<n;i++){
                if(intervals[i-1][1]>=intervals[i][0] && intervals[i-1][0]<=intervals[i][1]){
                    if(intervals[i-1][0]<intervals[i][0]){
                        arr[i-1][0]=intervals[i-1][0];
                    }
                    else{
                        arr[i-1][0]=intervals[i][0];
                    }
                    if(intervals[i-1][1]>intervals[i][1]){
                        arr[i-1][1]=intervals[i-1][1];
                    }
                    else{
                       arr[i-1][1]=intervals[i][1]; 
                    }
                    
                }
                else{
                    arr[i-1][0]=intervals[i][0];
                    arr[i-1][1]=intervals[i][1];
                }
            }
            return merge(arr);
        }
        else{
            int[][] arr=new int[k][2];
            for(int i=1;i<n;i++){
               if(intervals[i-1][1]>=intervals[i][0] && intervals[i-1][0]>intervals[i][0]){
                   int temp[][]=new int[1][2];
                   temp[i-1]=intervals[i-1];
                   intervals[i-1]=intervals[i];
                   intervals[i]=temp[i-1];
               }
            }
            return intervals;
        }
        
    }
}

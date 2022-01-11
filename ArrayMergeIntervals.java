import java.util.*;

public class ArrayMergeIntervals {
    public static void main(String[] args) {
        
    }
}
class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        List<List> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(int i=0;i<n;i++){
            b.add(0,intervals[i][0]);
            b.add(1,intervals[i][1]);
            a.add(b);
        }
        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.size();j++){
                if((int)a.get(i).get(1)>=(int)a.get(j).get(0) && (int)a.get(i).get(0)<=(int)a.get(j).get(1)){
                    if(intervals[i][0]<intervals[j][0]){
                        b.add(0,intervals[i][0]);
                    }
                    else{
                        b.add(0,intervals[j][0]);
                    }
                    if(intervals[i][1]>intervals[j][1]){
                        b.add(1,intervals[i][1]);
                    }
                    else{
                       b.add(1,intervals[j][1]);                         
                    }
                    a.remove(i);
                    a.remove(j);
                    a.add(i, b);

                }
            }
            
        }
    }
}

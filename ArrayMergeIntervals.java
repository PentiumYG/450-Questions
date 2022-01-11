import java.util.*;

public class ArrayMergeIntervals {
    public static void main(String[] args) {
        int[][] intervals={{2,3},{5,5},{2,2},{3,4},{3,4}};
        MergeIntervals obj = new MergeIntervals();
        intervals = obj.merge(intervals);
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<2;j++){
                System.out.print(intervals[i][j]+" ");
            }
        } 
    }
}
class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if(n==1){
            return intervals;
        }
        int t=0;
        List<List> temp1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> temp2=new ArrayList<>();
            temp2.add(intervals[i][0]);
            temp2.add(intervals[i][1]);
            temp1.add(temp2);
        }
        List<List> a = new ArrayList<>();
        
        for(int i=0;i<n-1;i++){
            if(intervals[i][0]==-1){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(intervals[j][0]==-1){
                    continue;
                }
                if(intervals[i][1]>=intervals[j][0] && intervals[i][0]<=intervals[j][1]){
                    List<Integer> b = new ArrayList<>(2);
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
                    a.add(b);
                    intervals[i][0]=-1;
                    intervals[i][1]=-1;
                    intervals[j][0]=-1;
                    intervals[j][1]=-1;
                    temp1.remove(i);
                    temp1.remove(j-1);
                    t=1;
                    break;
                }
                else{
                    continue;
                }   
            }
            if(t==1){
                break;
            }
        }
        a.addAll(temp1);
        
        int l=a.size();
        int m=a.get(0).size();
        int c[][]=new int[l][m];
        for(int i=0;i<l;i++){
            for(int j=0;j<m;j++){
                c[i][j]=(int) a.get(i).get(j);
            }
        }
        if(t==0){
            return c;
        }
        else{
            intervals = merge(c);
            return intervals;
        }
    }
}

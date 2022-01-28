import java.util.*;
public class MatrixSpiral {
    public static void main(String[] args) {
        
    }
}
class MatrixS {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0;
        int left=n-1, down=i, right=i, up=m-1;
        List<Integer> arr=new ArrayList<>();
        while(right<=left && down<=up){
            if(right==down && right==left && right==up && right==i){
                arr.add(matrix[i][i]);
            }
            if(right==down){
                while(right<left){
                    arr.add(matrix[down][right]);
                    right++;
                }
            }
            if(right==left){
                while(down<up){
                    arr.add(matrix[down][right]);
                    down++;
                }
            }
            if(down==up && right==left){
                while(left>i){
                    arr.add(matrix[down][left]);
                    left--;
                }
            }
            if(down==up){
                while(up>i){
                    arr.add(matrix[up][left]);
                    up--;
                    if(down>0 && right==0){
                        i=i+1;
                    }
                    if(down==0 && right>0){
                        i=i+1;
                    }
                }
            }
            i=i+1;
            left=right-1;
            up=down-1;
            right=i;
            down=i; 
        }
        
        return arr;
        
    }
}
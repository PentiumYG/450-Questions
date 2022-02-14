import java.util.*;
public class MatrixSpiral {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3}, {4,5,6},{7,8,9}};
        List<Integer> ans=new ArrayList<>();
        ans = spiralOrder(matrix);
        System.out.println(ans);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int sr=0, sc=0, er=row-1, ec=col-1;
        List<Integer> arr=new ArrayList<>();
        //adding elements as part of perimeter
        while(sr<=er && sc<=ec){
            //starting row added
            for(int i=sc; i<=ec; i++){
                arr.add(matrix[sr][i]);
            }
            //last column elements added
            for(int i=sr+1; i<=er; i++){
                arr.add(matrix[i][ec]);
            }
            //last row elements added
            if(sr!=er){
                for(int i=ec-1; i>=sc; i--){
                    arr.add(matrix[er][i]);
                }
            }
            if(sc!=ec){
            //first column elements added
                for(int i=er-1; i>sr; i--){
                    arr.add(matrix[i][sc]);
                }
            }
            sr = sr+1;
            sc = sc+1;
            er = er-1;
            ec = ec-1;
        }
        return arr; 
        
    }
}
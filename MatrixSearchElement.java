public class MatrixSearchElement {
    public static void main(String[] args) {
        int[][] matrix = {{1},{3}};
        int[][] matrix2 = {{1, 3}};
        int target = 2;
        int target2 = 3;
        boolean ans = searchMatrix(matrix, target);
        //boolean ans2 = searchMatrix(matrix2, target2);

        System.out.println("Answer: "+ans);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length-1; //m=
        //System.out.println("m: "+m);
        int n = matrix[0].length-1; //n=
        //System.out.println("n: "+n);
        //System.out.println("j: "+j);
        int temp=-1;
        for(int i=0;i<=m;i++){
            if(matrix[i][0]<=target && matrix[i][n]>=target){
                temp=i;
                break;
            }
        }
        if(temp!=-1){
        for(int j=0;j<=n;j++){
            if(matrix[temp][j]==target){
                return true;
            }
        }}
        return false;
    }
}

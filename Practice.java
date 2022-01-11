import java.util.*;

public class Practice{
    public static void main(String args[]){
        int[][] arr={{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int n=arr.length;
        List<List> temp1 = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            List<Integer> temp2=new ArrayList<>(2);
            //temp2.clear();
            temp2.add(arr[i][0]);
            temp2.add(arr[i][1]);
            temp1.add(temp2);
        }

        System.out.println(temp1);

        temp1.remove(1);

        System.out.println(temp1);
        
        int[][] barr = new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<2;j++){
                if(arr[i][j]>4){
                    barr[i][j]=arr[i][j];
                } 
            }
        } 
        
        List<List> a = new ArrayList<>();
        // List<Integer> b = new ArrayList<>();
        // for(int i=1;i<8;i++){
        //     b.add(0, arr[i-1]);
        //     b.add(1, arr[i]);
        //     i=i+1;
        //     a.add(b); 
        //     b.clear();
        // }
        a.add(temp1.get(1));
        // b.add(0, arr[0]);
        // b.add(1, arr[1]);
        // a.add(b);
        // b.clear();
        // b.add(0,4);
        // b.add(1,5);
        // a.add(b);
        // b.clear();
        // b.add(0,8);
        // b.add(1,9);
        // a.add(b);
        // System.out.println(a);
        // System.out.println(b);
        // //int c=(int) a.get(0).get(0);
        // a.remove(1);
        // System.out.println(a);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" "); 
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<2;j++){
                System.out.print(barr[i][j]+" "); 
            }
        }
    }
}
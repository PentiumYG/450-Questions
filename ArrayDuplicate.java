import java.util.*;

public class ArrayDuplicate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter n:");
            int n=sc.nextInt();
            int a[]=new int[n+1];
            for(int i=0;i<n+1;i++){
                a[i]=sc.nextInt();
            }
            //Method 1:
            Arrays.sort(a);
            for(int i=1;i<n+1;i++){
                if(a[i-1]==a[i]){
                    System.out.println(a[i]);
                }
            }


            //Method 2:
            // int n = nums.length;
            // int a[]=new int[n-1];
            // for(int i=0;i<n-1;i++){
            //     a[i]=0;
            // }
            // for(int i=0;i<n;i++){
            //     int val = nums[i];
            //     a[val-1] = a[val-1] + 1;
            // }
            // for(int i=0;i<n-1;i++){
            //     if(a[i]>1){
            //         return i+1;
            //     }
            // }
            // return 0;
        }
    }
}

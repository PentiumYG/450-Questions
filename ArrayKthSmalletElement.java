import java.util.*;
public class ArrayKthSmalletElement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of array:");
            int n=sc.nextInt();
            System.out.println("Enter array elements:");
            int arr[]=new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter value of k: ");
            int k=sc.nextInt();
            System.out.print("The array is: ");
            for(int i=0; i<n; i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
            int ans=kUsingSort(arr, n, k);
            System.out.println("The kth smallest element is: "+ans);
        }
    }
    // using sort 
    static int kUsingSort(int arr[], int n, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
}

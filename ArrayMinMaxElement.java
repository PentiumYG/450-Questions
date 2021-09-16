import java.util.*;

public class ArrayMinMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        System.out.println("Enter array elements:");
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The array is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        Arrays.sort(arr);
        int minElement=arr[0];
        int maxElement=arr[n-1];
        System.out.println("Minimum element in the array: "+ minElement);
        System.out.println("Maximum element in the array: "+ maxElement);
    }

}

import java.util.*;
public class ArrayNegFrontPosEnd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
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
            int j=0;
            for(int i=0;i<n;i++){
                if(arr[i]<0){
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                    j++;
                }
            }
            System.out.print("The array after performing some operation is: ");
            for(int i=0; i<n; i++){
                System.out.print(arr[i]+ " ");
            }
        }
    }
}

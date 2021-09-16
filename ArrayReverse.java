import java.util.Scanner;

public class ArrayReverse {
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
        for(int i=0; i<=(n/2); i++){
            int temp;
            temp = arr[i];
            arr[i] = arr[(n-1)-i];
            arr[(n-1)-i] = temp;
        }
        System.out.print("The array after reversing is: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}

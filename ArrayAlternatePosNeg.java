import java.util.*;
public class ArrayAlternatePosNeg {
    public static void main(String[] args) {
        int arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int n=arr.length;
        //using O(n) space
        // List<Integer> neg=new ArrayList<>();
        // List<Integer> pos=new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     if(arr[i]<0){
        //         neg.add(arr[i]);
        //     }
        //     else{
        //         pos.add(arr[i]);
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     if(i%2==0 && neg.size()!=0){
        //         arr[i]=neg.get(0);
        //         neg.remove(0);
        //     }
        //     else{
        //         arr[i]=pos.get(0);
        //         pos.remove(0);
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }

        //using O(1) space
        

    }
    public static int minimum(int[] arr, int s){
        int min=arr[0];
        int indexmin=0;
        int n=arr.length;
        for(int i=s;i<n;i++){
            if(min<arr[i]){
                min=arr[i];
                indexmin=i;
            }
        }
        return indexmin;
    }
}

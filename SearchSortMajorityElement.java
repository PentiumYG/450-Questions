

import java.util.*;

class SearchSortMajorityElement
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                int n =sc.nextInt();
                int arr[] = new int[n];
                
                for(int i = 0; i < n; i++)
                 arr[i] = sc.nextInt();
                 
               System.out.println(majorityElement(arr, n)); 
            }
        }
    }

    static int majorityElement(int a[], int size)
    {
        Arrays.sort(a);
       int count=1;
       int res=-1;
       if(size==1){
           return a[0];
       }
       for(int i=1;i<size;i++){
           if(a[i]==a[i-1]){
               count++;
               if(count>size/2){
                   res= a[i];
               }
               continue;
           }
           count=1;
       }
       return res;
        
        
    }
}
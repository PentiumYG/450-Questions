// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class ArrayCommonElements
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> arr=new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        for(int i=0;i<n1;i++){
            set1.add(A[i]);
        }
        for(int i=0;i<n2;i++){
            set2.add(B[i]);
        }
        for(int i=0;i<n3;i++){
            set3.add(C[i]);
        }
        
        if(n1<n2 && n1<n3){
           for(int i=0;i<n1;i++){
               int temp=A[i];
               if(set2.contains(temp) && set3.contains(temp)){
                   if(!arr.contains(temp)){
                       arr.add(temp);
                   }
               }
           } 
        }
        else if(n2<n1 && n2<n3){
            for(int i=0;i<n2;i++){
               int temp=B[i];
               if(set1.contains(temp) && set3.contains(temp)){
                   if(!arr.contains(temp)){
                       arr.add(temp);
                   }
               }
           } 
        }
        else{
            for(int i=0;i<n3;i++){
               int temp=C[i];
               if(set1.contains(temp) && set2.contains(temp)){
                   if(!arr.contains(temp)){
                       arr.add(temp);
                   }
               }
           } 
        }
        
        return arr;
    }
}

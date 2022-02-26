
import java.io.*;
import java.util.*;



// { Driver Code Starts.

// Driver class
class SearchSortFirstLastPos {

    // Driver code
    public static void main(String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(a1[i]);
            }
            ArrayList<Long> ans=find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }

    static ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> pos = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                pos.add((long) i);
                break;
            }
            if(arr[i]>x){
                break;
            }
            
        }
        
        for(int i=n-1;i>-1;i--){
            if(arr[i]==x){
                pos.add((long) i);
                break;
            }
            if(arr[i]<x){
                break;
            }
            
        }
        
        if(pos.size()==0){
            pos.add((long) -1);
            pos.add((long) -1);
            return pos;
        }
        else{
            return pos;
        }

    }
}

  // } Driver Code Ends



    import java.io.*;
  //  import java.util.*;
    class ArrayMinJumps
     {
        public static void main (String[] args) throws IOException
         {
         
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            int t = Integer.parseInt(br.readLine()); 
    
            while(t-- > 0){
                int size = Integer.parseInt(br.readLine());
                String[] arrStr = ((String)br.readLine()).split("\\s+");
                int[] arr= new int[size];
                for(int i = 0;i<size;i++){
                    arr[i] = Integer.parseInt(arrStr[i]);
                }
                new MinJumps();
                System.out.println(MinJumps.minJumps(arr));
            }
         }
         
    }
    // } Driver Code Ends
    
    
    class MinJumps{
        static int minJumps(int[] arr){
            int i=0;
            int n= arr.length;
           // int steps = n-1;
            int count = 0;
            while(i<n){
                if(arr[i] != 0){
                  //  steps = steps - arr[i];
                    i = i + arr[i];
                    count = count + 1;
                }
            }
            return count;
        }
    }
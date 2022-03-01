import java.io.*;

    class  ArrayKadnesAlgo{
        
        public static void main (String[] args) throws IOException {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
                while(t-->0){
                    //size of array
                    int n = Integer.parseInt(br.readLine().trim());
                    int arr[] = new int[n];
                    String inputLine[] = br.readLine().trim().split(" ");
                    
                    //adding elements
                    for(int i=0; i<n; i++){
                        arr[i] = Integer.parseInt(inputLine[i]);
                    }
                    
                    //calling maxSubarraySum() function
                    System.out.println(maxSubarraySum(arr, n));
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        static long maxSubarraySum(int arr[], int n){
            long sum = 0;
            long max = arr[0];
            for(int i=0;i<n;i++){
                sum = sum + arr[i]; 
                if(sum > max){
                    max = sum;
                }
                if(sum < 0){
                    sum = 0;
                }
                
            }
            return max;
            
            
        }
    }
    
    
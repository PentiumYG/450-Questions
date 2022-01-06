import java.io.*;
import java.util.*;
    
    class GFG {
        // Driver code
        public static void main(String[] args) throws Exception {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            while (t-- > 0) {
                String inputLine[] = br.readLine().trim().split(" ");
                int n = Integer.parseInt(inputLine[0]);
                int m = Integer.parseInt(inputLine[1]);
                int arr1[] = new int[n];
                int arr2[] = new int[m];
                inputLine = br.readLine().trim().split(" ");
                for (int i = 0; i < n; i++) {
                    arr1[i] = Integer.parseInt(inputLine[i]);
                }
                inputLine = br.readLine().trim().split(" ");
                for (int i = 0; i < m; i++) {
                    arr2[i] = Integer.parseInt(inputLine[i]);
                }
    
                new Merging().merge(arr1, arr2, n, m);
    
                StringBuffer str = new StringBuffer();
                for (int i = 0; i < n; i++) {
                    str.append(arr1[i] + " ");
                }
                for (int i = 0; i < m; i++) {
                    str.append(arr2[i] + " ");
                }
                System.out.println(str);
            }
        }
    }
    
    //TC: O(n^2) 
    //SC: O(1)
    class Merging {
    
        public void merge(int arr1[], int arr2[], int n, int m) {
            int temp1;
        int temp2;
        int j=0;
        int k=0;
        while(j<n && k<m){
            if(arr1[j]>arr2[k]){
                temp1=arr1[j];
                arr1[j]=arr2[k];
                for(int i=j+1;i<n;i++){
                    temp2=arr1[i];
                    arr1[i]=temp1;
                    temp1=temp2;
                }
                arr2[k]=temp1;
                j=j+1;
                k=k+1;
            }
            else{
                j=j+1;
                continue;
            }
        }
        Arrays.sort(arr2);
        }
        
    }

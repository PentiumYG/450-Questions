import java.util.*;


public class ArraysIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter t");
            int t=sc.nextInt();
            sc.nextLine();
            while(t-->0){
                int n,m;
                n=sc.nextInt();
                m=sc.nextInt();
                int a[]=new int[n];
                int b[]=new int[m];
                for(int i=0;i<n;i++){
                    a[i]=sc.nextInt();
                }
                for(int i=0;i<m;i++){
                    b[i]=sc.nextInt();
                }
                System.out.println(Sol.doUnion1(a, n, b, m));
                System.out.println(Sol.doUnion2(a, n, b, m));
            }
        }
    }

class Sol{
    //TC: O(n^2)
    //SC: O(1)
    public static int doUnion1(int a[], int n, int b[], int m) 
    {
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]==b[j]){
                    count++;
                    break;
                }
            }
        }
        
        return count;
    }
    //TC: O((n+m)log(n+m))
    //SC: O(n+m)
    public static int doUnion2(int a[], int n, int b[], int m) 
    {
        int len=n+m;
        int arr[]=new int[len];
        for(int i=0;i<n;i++){
            arr[i]=a[i];
        }
        for(int j=0;j<m;j++){
            arr[n+j]=b[j];
        }
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<len;i++){
            if(i>0 && arr[i]==arr[i-1]){
                count++;
            }
        }
        
        return count;
    }
}

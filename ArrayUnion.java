import java.util.*;


public class ArrayUnion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
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
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            System.out.println(Solution.doUnion(a, n, b, m));
        }
    }
}
class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        int len=n+m;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]==b[j]){
                    count++;
                    break;
                }
            }
        }
        int union=len-count;
        
        return union;
    }
}

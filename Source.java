import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        // Declare the variable
        int n;
        int x;
        
        // Read the variable from STDIN
        n = in.nextInt();
        x = in.nextInt();

        int arr[]=new int[n];

        

        for(int i=0;i<n;i++){
            arr[i]=i+1;
        } 

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        } 

        System.out.println();

        int i=0;
        int j=1; 
        
        while(i<j){
            System.out.print(arr[i]+" ");
            while(j<x){
                System.out.print(arr[j]+" ");
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }

        
   }
}

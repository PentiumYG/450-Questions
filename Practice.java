import java.util.*;

public class Practice{
    public static void main(String args[]){
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8};
        List<List> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(int i=1;i<8;i++){
            b.add(0, arr[i-1]);
            b.add(1, arr[i]);
            i=i+1;
            a.add(b); 
            b.clear();
        }

        // b.add(0, arr[0]);
        // b.add(1, arr[1]);
        // a.add(b);
        // b.clear();
        // b.add(0,4);
        // b.add(1,5);
        // a.add(b);
        // b.clear();
        // b.add(0,8);
        // b.add(1,9);
        // a.add(b);
        System.out.println(a);
        System.out.println(b);
        //int c=(int) a.get(0).get(0);
        a.remove(1);
        System.out.println(a);
    }
}
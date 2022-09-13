import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> l = new ArrayList<>();
        int n = 4;
        for(int i=0;i<n;i++){
            l.add("Q");
        }
        for(int i=0;i<n;i++){
            list.add(l);
        }
        for(int i=0;i<n;i++){
            System.out.println(list.get(i));
        }
    }
}

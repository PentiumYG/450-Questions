public class StringReverseString {
    public static void main(String[] args) {
        char[] s = {'a', 'b', 'c', 'd' ,'e'};
        reverseString(s);
        System.out.print("Current String: ");
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]);
        }
        System.out.println();
        System.out.print("String after Reversing: ");
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]);
        }
    }
    public static void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}

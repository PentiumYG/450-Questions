import java.util.*;
public class ArrayBuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        Stock s=new Stock();
        int profit = s.maxProfit(prices);
        System.out.println(profit);
    }
}
class Stock {
    //O(n^2)
    // public int maxProfit(int[] prices) {
    //     int n=prices.length;
    //     List<Integer> arr=new ArrayList<>();
    //     arr.add(0);
    //     for(int i=0;i<n;i++){
    //         for(int j=n-1;j>i;j--){
    //             if(prices[j]-prices[i]>0){
    //                 arr.add(prices[j]-prices[i]);
    //             }
    //         }
    //     }
    //     int max=0;
    //     for(int l=0;l<arr.size();l++){
    //         if(max<arr.get(l)){
    //             max=arr.get(l);
    //         }
    //     }
    //     return max; 
    // }


    //O(n)
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int i=0;
        int j=1;
        List<Integer> arr=new ArrayList<>();
        while(j<n){
            if(prices[i]<prices[j]){
                arr.add(prices[j]-prices[i]);
            }
            else{
                i=j;
            }
            j=j+1;
        }
        int max=0;
        for(int l=0;l<arr.size();l++){
            if(max<arr.get(l)){
                max=arr.get(l);
            }
        }
        return max;
        
    }

    //Incorrect trials
    // public int maxProfit(int[] prices) {
    //     int n=prices.length;
    //     List<Integer> arr=new ArrayList<>();
    //     int i=0;
    //     int j=n-1;
    //     while(i<j){
    //         if(prices[j]-prices[i]>0){
    //             arr.add(prices[j]-prices[i]);
    //             j=j-1;
    //         }
    //         else{
    //             i=i+1;
    //         }
    //     }
    //     i=0;
    //     j=n-1;
    //     while(i<j){
    //         if(prices[j]-prices[i]>0){
    //             arr.add(prices[j]-prices[i]);
    //             i=i+1;
    //         }
    //         else{
    //             j=j-1;
    //         }
    //     }
    //     int max=0;
    //     for(int l=0;l<arr.size();l++){
    //         if(max<arr.get(l)){
    //             max=arr.get(l);
    //         }
    //     }
    //     return max;    
    // }
    // incorrect approach for [3,3,5,0,0,3,1,4]
    // public int maxProfit(int[] prices) {
    //     int n=prices.length;
    //     List<Integer> arr=new ArrayList<>();
    //     for(int i=0;i<n;i++){
    //         arr.add(prices[i]);
    //     }
    //     int max=0;
    //     int temp1=0;
    //     for(int l=1;l<arr.size();l++){
    //         if(max<arr.get(l)){
    //             max=arr.get(l);
    //         }
    //     }
    //     for(int l=1;l<arr.size();l++){
    //         if(max==arr.get(l)){
    //             temp1 = l;
    //         }
    //     }
    //     int temp2=0;
    //     int min=arr.get(0);
    //     for(int l=1;l<arr.size();l++){
    //         if(min>arr.get(l)){
    //             min=arr.get(l);
    //         }
    //     }
    //     for(int l=0;l<arr.size();l++){
    //         if(min==arr.get(l)){
    //             temp2 = l;
    //         }
    //     }
    //     while(temp1<temp2 && arr.size()>0){
    //         arr.remove(temp2);
    //         min=arr.get(0);
    //         for(int l=1;l<arr.size();l++){
    //             if(min>arr.get(l)){
    //                 min=arr.get(l);
    //             }
    //         }
    //         for(int l=0;l<arr.size();l++){
    //             if(min==arr.get(l)){
    //                 temp2 = l;
    //             }
    //         }
    //     }
    //     int ans=0;
    //     if(temp1>temp2){
    //         ans=max-min;
    //     }
               
    //     return ans;
        
    // }

}
public class ArrayGlobalLocalInversion {
    public static void main(String[] args) {
        int[] nums={2, 1, 0};
        boolean t;
        Temp s=new Temp();
        t = s.isIdealPermutation(nums);
        System.out.println(t);
    }
}
class Temp {
    public boolean isIdealPermutation(int[] nums) {
        // {TLE} 
        // int n=nums.length;
        // int globalInversion=0;
        // int localInversion=0;
        // for(int i=1;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(i<j && nums[i]>nums[j]){
        //             globalInversion=globalInversion+1;
        //         }
        //     }
        // }
        // for(int i=0;i<n-1;i++){
        //     if(nums[i]>nums[i+1]){
        //         localInversion=localInversion+1;
        //     }
        // }
        // if(localInversion==globalInversion){
        //     return true;
        // }
        // else{
        //     return false;
        // }

        
/*So the critical thing to understand here is that every local inversion is also, by definition, a global inversion. Any number that represents part of a global inversion, however, could represent more than one global inversion.

So then we should consider that the ideal version of A without any inversions would be one which is strictly increasing, which means that for all i, A[i] = i. Any deviation from this results in an inversion.

Also, the further A[i] deviates from i, the more global inversions are ultimately triggered. In fact, the only possible way for the number of global inversions to be equal to the number of local inversions is if each number has a maximum deviation from ideal of only 1, meaning that it represents only a single global inversion and a single local inversion.

Consider the two cases:

Case A) A number is more than one higher than the ideal; for example, i = 3, A[i] = 5.

When i is 3, that means we've seen 3 numbers already, yet there are 5 numbers that are less than 5. That then means that there are at least 2 numbers that are less than 5 that we have not yet seen, which in turn means that there are at least 2 global inversions triggered by this one deviation.

Case B) A number is more than one lower than the ideal; for example, i = 3, A[i] = 1.

When i is 3, that means we've seen 3 numbers already, yet only 1 number is less than 1. That then means that at least 2 of the numbers we've seen are higher than 1, which in turn means that we've already triggered at least 2 gobal inversions because of this one deviation.

Any move to offset these extra global inversions with additional local inversions would only trigger at least as many more global inversions.

So if we iterate through A and find any number that deviates more than 1 from its ideal, we can immediately return false. If we reach the end without triggering this, we can return true.
*/
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(Math.abs(nums[i]-i) > 1){
                return false;
            }
        }
        return true;
    }
}
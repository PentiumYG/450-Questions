//Although applied on Integer but can also be done on Characters
//using character Hashset.

import java.util.*;
public class StringDuplicate {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,1,3};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}

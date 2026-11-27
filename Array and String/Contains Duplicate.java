// Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

// Example 1:

// Input: nums = [1, 2, 3, 3]

// Output: true

// Example 2:

// Input: nums = [1, 2, 3, 4]

// Output: false

class Solution {
    public boolean hasDuplicate(int[] nums) {
        // System.out.println(nums.length);
    //    System.out.print(nums[3]);
       for (int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                // System.out.println(i);//0
                // System.out.println(j);//1
                // System.out.println(j==i);//false
                if(nums[i]==nums[j]){
                    return true;
                }

            }

        }
    
       return false;
    }
}

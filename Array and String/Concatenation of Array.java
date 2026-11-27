// You are given an integer array nums of length n. Create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

// Specifically, ans is the concatenation of two nums arrays.

// Return the array ans.

// Example 1:

// Input: nums = [1,4,1,2]

// Output: [1,4,1,2,1,4,1,2]
// Example 2:

// Input: nums = [22,21,20,1]

// Output: [22,21,20,1,22,21,20,1


class Solution {
    public int[] getConcatenation(int[] nums) {
       int n =nums.length;
    //    System.out.print(nums);
        int [] ans = new int[n*2];
        
    // System.out.print(ans.length);
       


       for(int i=0;i<n;i++)
       {
        
            // System.out.print(i);
            ans[i] = nums[i];
            
            // ans[i+n*2]=nums[i];
            // ans[i+n*3]=nums[i];
            // ans[i+n*4]=nums[i];


        }
        for (int i=0;i<n;i++){
            ans[i+n]=nums[i];
        }

        return ans;
        
    }
}

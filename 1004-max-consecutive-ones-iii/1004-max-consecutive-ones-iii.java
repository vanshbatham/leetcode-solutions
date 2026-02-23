class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int zeroCount = 0; 
        int maxOnes = 0;

        for(int end = 0; end < nums.length; end++){
            if(nums[end] == 0){
                zeroCount++;
            }
            
            //if zeroes are greater than k, minimize the window from the start
            while(zeroCount > k){
                //if zero is at start, reduce the value of zeroCount by 1
                if(nums[start] == 0)
                    zeroCount--;
                start++;
            }
             
            //max ones so far
            maxOnes = Math.max(maxOnes, end - start + 1);
        }
        return maxOnes;
    }
}
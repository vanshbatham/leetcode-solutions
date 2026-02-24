class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0, end = nums.length - 1;
        int ans = 0;

        while(start < end){
            if(nums[start] + nums[end] == k){
                start++;
                end--;
                ans++;
            }

            if(nums[start] + nums[end] < k){
                start++;
            }

            if(nums[start] + nums[end] > k){
                end--;
            }
        }
        return ans;
    }
}
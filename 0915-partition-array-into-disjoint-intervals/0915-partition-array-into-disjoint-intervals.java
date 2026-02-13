class Solution {
    public int partitionDisjoint(int[] nums) {
        int lMax = nums[0]; //max of current left parititon
        int gMax = nums[0]; //max seen so far
        int pIdx = 0;       //end idx of left  

        for(int i = 0; i < nums.length; i++){
            gMax = Math.max(gMax, nums[i]);

            //if current element is smaller than lMax,
            //it cannot belong to right partition.
            if(nums[i] < lMax){
                lMax = gMax;
                pIdx = i;
            }
        } 
    return pIdx + 1;
    }
}
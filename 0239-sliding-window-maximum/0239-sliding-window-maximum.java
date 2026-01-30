class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        int j = 0;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        
        for(int i = 0; i < nums.length; i++){
            while(!deque.isEmpty() && nums[deque.getLast()] < nums[i]){
                deque.removeLast();
            }

            deque.addLast(i);
            if(deque.getFirst() + k == i){
                deque.removeFirst();
            }

            if(i >= k - 1){
                ans[j++] = nums[deque.getFirst()];
            }
        }
        return ans;
    }
}
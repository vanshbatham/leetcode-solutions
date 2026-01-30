class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> ngeMap = new HashMap<>();

        for(int i = nums2.length - 1; i >= 0; i--){
            int element = nums2[i];

            //remove all smaller or equal elements
            while(!stack.isEmpty() && stack.peek() <= element){
                stack.pop();
            }
            
            //if stack is empty => no next greater element
            int nge = stack.isEmpty() ? -1 : stack.peek();
            ngeMap.put(element, nge);

            //push current element
            stack.push(element);
        }

        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            ans[i] = ngeMap.get(nums1[i]);
        }
    return ans;
    }
}
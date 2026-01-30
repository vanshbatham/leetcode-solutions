class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];

        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int i = 0;

        for(Map.Entry<Integer, Integer> entry: freq.entrySet()){
            if(entry.getValue() == 1){
                ans[i] = entry.getKey();
                i++;  
            }
        }
    return ans;
    }
}
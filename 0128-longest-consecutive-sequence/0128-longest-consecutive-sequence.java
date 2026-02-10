class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        
        //add all elements in hashset
        for(int num : nums){
            hs.add(num);
        }
    
        int longest = 0;
      
        for(int num : hs){
            //check if previous element exists in hashset or not
            if(!hs.contains(num - 1)){
                int length = 1;
                while(hs.contains(num + length)){
                length++;
                }
            longest = Math.max(longest, length);
            }
        }
    return longest;
    }
}
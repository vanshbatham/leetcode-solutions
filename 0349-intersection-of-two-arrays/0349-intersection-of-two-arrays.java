class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hs = new HashSet<>();
        
        for(int num : nums1){
            hs.add(num);
        }

        Set<Integer> ansSet = new HashSet<>();

        for(int num : nums2){
            if(hs.contains(num)){
                ansSet.add(num);
            }
        }

        int[] ans = new int[ansSet.size()];
        int i = 0;
        
        for(int num : ansSet){
            ans[i] = num;
            i++;
        }
    
    return ans;
    }
}
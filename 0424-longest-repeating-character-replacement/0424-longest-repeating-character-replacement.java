class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxWindow = 0;

        for(int right = 0; right < s.length(); right++){
            //update frequency of current character
            freq[s.charAt(right) - 'A']++;
            //update max frequency
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);
            int windowLength = right - left + 1;
            
            //if the windowLength - maxFreq > k
            //then we shrink the window from front
            if(windowLength - maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            } 

            maxWindow = Math.max(maxWindow, right - left + 1);
        }
    return maxWindow;
    }
}
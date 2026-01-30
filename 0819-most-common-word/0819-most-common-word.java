class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        
        // store banned words
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        Map<String, Integer> freq = new HashMap<>();

        // split by space
        String[] words = paragraph.split("[^a-z]+");

        for(String word : words){
            if(!bannedSet.contains(word) && word.length() > 0){
                freq.put(word, freq.getOrDefault(word, 0) + 1);
            }
        }

        String ans = "";
        int maxFreq = 0;
        
        for(Map.Entry<String, Integer> entry : freq.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                ans = entry.getKey();
            }
        }
    return ans;
    }
}
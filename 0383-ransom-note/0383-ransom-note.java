class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        // counting chars in magazine
        for(char ch : magazine.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // check ransomNote
        for(char ch : ransomNote.toCharArray()){
            if(!map.containsKey(ch) || map.get(ch) == 0){
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }
    return true;
    }
}
class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder ans = new StringBuilder(s);

        int idx;
        while((idx = ans.indexOf(part)) != -1){
            ans.delete(idx, idx + part.length());
        }

        return ans.toString();
    }
}
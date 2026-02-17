class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int l1 = w1.length, l2 = w2.length;
        int i = 0, j = 0;

        StringBuilder ans = new StringBuilder();

        while(i < l1 && j < l2){
            ans.append(w1[i]);
            i++;
            ans.append(w2[j]);
            j++;
        }

        while(i < l1){
            ans.append(w1[i]);
            i++;
        }

        while(j < l2){
            ans.append(w2[j]);
            j++;
        }
    return ans.toString();  
    }
}
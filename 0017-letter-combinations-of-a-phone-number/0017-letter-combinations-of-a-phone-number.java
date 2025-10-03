class Solution {
   static final String[] keypad = {
  "",    
  "",   
  "abc",
  "def", 
  "ghi", 
  "jkl", 
  "mno", 
  "pqrs",
  "tuv", 
  "wxyz"
};
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.isEmpty()){
            return new ArrayList<>();
        }

        return padList("", digits);
    }

    static List<String> padList(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        List<String> ans = new ArrayList<>();
        if(digit < 0 || digit > 9) {
            return ans;
        }

        String letters = keypad[digit];
        for(int i=0;i<letters.length();i++){
            char ch = letters.charAt(i);
            ans.addAll(padList(p + ch, up.substring(1)));
        }
        return ans;
    }
}
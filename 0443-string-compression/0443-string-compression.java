class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int r = 0;
        int w = 0;

        while(r < n){
            char curr = chars[r];
            int count = 0;
            
            //count consecutive chars
            while(r < n && chars[r] == curr){
                r++;
                count++;
            }

            chars[w] = curr;
            w++;

            //if count > 1, write the count next to the current character
            if(count > 1){
                String countStr = String.valueOf(count);
                for(char c : countStr.toCharArray()){
                    chars[w] = c;
                    w++;
                }
            }
        }
    return w;
    }
}
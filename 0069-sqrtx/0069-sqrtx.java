class Solution {
    public int mySqrt(int x) {
        int start = 0, end = x;

        while(start <= end){
            int mid = start + (end - start) / 2;
            long sq = (long) mid * mid;
            if(sq < x){
                start = mid + 1;
            }else if(sq > x){
                end = mid - 1;
            }else{
                return mid;
            }
        }
    return end;
    }
}
class Solution {
    public int maxArea(int[] heights) {

        int n = heights.length;

        int i = 0;
        int j = n-1;

        int res = Integer.MIN_VALUE;

        while(i<j){
            int current_cap = Math.min(heights[i],heights[j]) * (j-i);
            res = Math.max(current_cap,res);

            if(heights[i] < heights[j]){
                i++;
            }else{
                j--;
            }
        }

        return res;
        
    }
}

class Solution {
    public int trap(int[] height) {

    int n = height.length;
    int max_prefix[] = new int[n];
    int max_suffix[] = new int[n];
    int res = 0;
    int max = 0;

    for(int i = 0; i < n; i++){
        max_prefix[i] = max;
        max = Math.max(max, height[i]);
    }
    max = 0;
    for(int i = n-1; i>=0;i--){
        max_suffix[i] = max;
        max = Math.max(height[i],max);
    }

    for(int i = 0; i<n;i++){

        int val = Math.min(max_prefix[i], max_suffix[i]) - height[i];
        if(val > 0)
            res = res + val;
    }

    return res;
  
    }
}

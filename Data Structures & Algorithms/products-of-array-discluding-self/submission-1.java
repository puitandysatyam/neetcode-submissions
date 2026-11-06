class Solution {
    public int[] productExceptSelf(int[] nums) {

        int left_prod = 1;
        int right_prod = 1;

        int n = nums.length;

        int[] prefix = new int[n];
        

        for(int i = 0; i < n; i++){
            prefix[i] = left_prod;
            left_prod *= nums[i];
        }

        for(int i = n-1; i>=0;i--){
            prefix[i] *= right_prod;
            right_prod *= nums[i];
        }
        

        

        return prefix;

        
    }
}  

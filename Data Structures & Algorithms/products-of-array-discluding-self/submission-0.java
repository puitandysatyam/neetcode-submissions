class Solution {
    public int[] productExceptSelf(int[] nums) {

        int left_prod = 1;
        int right_prod = 1;

        int n = nums.length;

        int[] left_prefix = new int[n];
        int[] right_prefix = new int[n];

        for(int i = 0; i < n; i++){
            left_prefix[i] = left_prod;
            left_prod *= nums[i];
        }

        for(int i = n -1; i>=0; i--){
            right_prefix[i] = right_prod;
            right_prod *= nums[i];
        }

        for(int i = 0; i < n; i++){
            nums[i] = left_prefix[i] * right_prefix[i];
        }

        return nums;

        
    }
}  

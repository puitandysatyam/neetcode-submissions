class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i < n; i++){
            if(i>0 && nums[i] == nums[i-1])
                continue;
            int target = -1 * nums[i];
            int j = i+1;
            int k = n-1; 

            while( j < k){
                int sum = nums[j] + nums[k];
                if(sum > target){
                    k--;
                }
                else if(sum < target){
                    j++;
                }
                else{
                    res.add(new ArrayList<>(
                        Arrays.asList(nums[i],nums[j],nums[k])
                    ));
                    j++;
                    k--;

                    while(j<k && nums[j-1]==nums[j]){
                        j++;
                    }
                    while(k>j && nums[k+1]== nums[k]){
                        k--;
                    }
                }
            }
        }
        return res;
        
    }
}

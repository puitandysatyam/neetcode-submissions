class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0)
            return 0;
        
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        int max_len=Integer.MIN_VALUE;
        for(int num : nums){
            if(!set.contains(num-1)){
                int len = 1;
                while(set.contains(num+1)){
                    num+=1;
                    len++;
                }
                max_len = Math.max(max_len,len);
            }
        }

        return max_len;
    }
}

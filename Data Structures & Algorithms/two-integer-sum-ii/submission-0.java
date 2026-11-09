class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int i = 0;
        int n = numbers.length;
        int j = n-1;

        while(i<=j){
            int sum = numbers[i] + numbers[j];
            if(sum > target){
                j--;
            }
            else if (sum < target){
                i++;
            }
            else{
                return new int[] {(i+1),(j+1)};
            }
        }

        return new int[2];
    }
}

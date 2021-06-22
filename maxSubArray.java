
class Solution {
    public int maxSubArray(int[] nums) {
        int rSum = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            rSum = Math.max(rSum + nums[i], nums[i]);
            max = Math.max(rSum, max);
        }
        return max;
    }
}
========================================================================================

MAXIMUM SUB ARRAY WITH START AND END INDEXES

class Solution {
    public int maxSubArray(int[] nums) {
        int rSum = nums[0];
        int max = nums[0];
        int start = 0; 
        int end = 0; 
        int currStart = 0;
        
        for(int i = 1; i < nums.length; i++){
            if(rSum + nums[i] < nums[i]){
                rSum = nums[i];
                currStart = i;
            }else{
                rSum = rSum + nums[i];
            }
            if(rSum > max){
                max = rSum;
                end = i;
                start = currStart;
            }
        }
        System.out.println(start);
        System.out.println(end);
        return max;
    }
}

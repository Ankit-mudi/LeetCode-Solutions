
class Solution {
    public boolean canJump(int[] nums) {

        int finalPos = nums.length-1;
        for(int i=nums.length-2; i>=0; i--)
        {
            if(i+nums[i] >= finalPos){
                finalPos = i;
            }
        }
        //If we reach the final index, then we can make the jump possible
        return finalPos==0;
    }
}

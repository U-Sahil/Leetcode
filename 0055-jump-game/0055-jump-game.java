class Solution {
    public boolean canJump(int[] nums) {
        int lastpos = nums.length -1 ;
        for(int i= nums.length-2 ; i>=0 ; i--){
            if(i+nums[i] >= lastpos){
                lastpos= i ;

            }
        }
        return lastpos == 0;
        
    }
}
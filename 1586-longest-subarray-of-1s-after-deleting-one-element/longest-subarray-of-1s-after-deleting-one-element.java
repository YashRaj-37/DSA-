class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int low=0;
        int res=0;
        int zeros=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0)zeros++;

        while(zeros>1){
            if(nums[low]==0){
                zeros--;
            }
            low++;
        }

        res=Math.max(res,i-low);
        }
        return res;
    }
}
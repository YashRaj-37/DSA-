class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int low=0;
        int high=k-1;
        int sum=0;
        for(int i=low;i<=high;i++){
            sum+=nums[i];
        }
        double avg=(double)sum/k;
        double ans=avg;
        while(high<n){
         if(low==0){
            low++;
            high++;
            continue;
         }
         sum=sum-nums[low-1]+nums[high];
         avg=(double)sum/k;
         ans=Math.max(ans,avg);
         low++;
         high++;

        }
        return ans;
    }
}
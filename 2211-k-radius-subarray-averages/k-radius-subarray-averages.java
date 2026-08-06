class Solution {
    public int[] getAverages(int[] nums, int k) {
        if(k==0)return nums;
        int ans[]=new int[nums.length];
        Arrays.fill(ans, -1);
        if(nums.length<2*k+1)return ans;
        int low=0;
        int high=2*k;
        long sum=0;
        int a=k;
        for(int i=0;i<=high;i++){
            sum+=nums[i];
        }
        int c=2*k+1;
        ans[a]=(int)(sum/c);  
        a++;
        high++;
        low++;
        while(high<nums.length){
            sum=sum-nums[low-1]+nums[high];
            ans[a]=(int)(sum/c);
            a++;
            high++;
            low++;
        }
    return ans;

    }
}
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int low=0;
        int high=k-1;
        int sum=0;
        for(int i=low;i<=high;i++){
            sum+=arr[i];
        }
        int count =0;
        double avg=sum/k;        
        while(high<n){
            if(low==0){
                if(avg>=threshold)count++;
                low++;
                high++;
                continue;
            }
            sum=sum-arr[low-1]+arr[high];
            avg=sum/k;
            if(avg>=threshold)count++;
            low++;
            high++;
        }
        return count;
        
    }
}
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n=s.length();
        int low=0;
        int res=0;
        int sum=0;
        for(int i=0;i<n;i++){
          char c1=s.charAt(i);
          char c2=t.charAt(i);
          sum+=Math.abs(c1-c2);
        while(sum>maxCost){
            char s1=s.charAt(low);
            char s2=t.charAt(low);
            sum-=Math.abs(s1-s2);
            low++;
        }
        int len=i-low+1;
        res=Math.max(res,len);
        }
        return res;
    }
}
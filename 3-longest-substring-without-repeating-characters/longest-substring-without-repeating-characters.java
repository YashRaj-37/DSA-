class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int low=0;
        int res=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int h=0;h<n;h++){
            char ch=s.charAt(h);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()<h-low+1){
                char c=s.charAt(low);
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    map.remove(c);
                }
                low++;
            }
            int len=h-low+1;
            res=Math.max(res,len);
        }
        return res;
    }
}
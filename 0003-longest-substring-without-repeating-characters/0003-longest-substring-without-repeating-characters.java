class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,maxlen=0,n = s.length();
        int[] hash = new int[256];
        Arrays.fill(hash,-1);

        while(r<n){
            if(hash[s.charAt(r)] != -1){
                if(hash[s.charAt(r)] >= l){
                    l = hash[s.charAt(r)]+1;
                }
            }
            hash[s.charAt(r)] = r;
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }

        return maxlen;
    }
}
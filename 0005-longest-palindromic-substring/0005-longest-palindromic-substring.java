class Solution {
    public String longestPalindrome(String s) {
        int start =0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int len1 = isPal(s,i,i);
            int len2 = isPal(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len > end - start){
                start =i-(len-1)/2;
                end=i+len/2;
            }      
        }
        return s.substring(start,end+1);
    }
    int isPal(String str, int l,int r){
        while(l>=0 && r <str.length() && str.charAt(l) == str.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}
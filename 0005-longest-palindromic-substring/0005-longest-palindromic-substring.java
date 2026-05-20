class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        int start =-1;
        int end=-1;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPal(s,i,j)){
                    if(j-i+1 > max){
                        start =i;
                        end=j;
                        max=j-i+1;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
    boolean isPal(String str, int l,int r){
        while(l<r){
            if(str.charAt(l++) != str.charAt(r--)) return false;
        }
        return true;
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)) str+=c;
        }
        if(isPal(str.toLowerCase())) return true;
        else return false;
    }
    static boolean isPal(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i++) != str.charAt(j--)) return false;
        }
        return true;
    }
}
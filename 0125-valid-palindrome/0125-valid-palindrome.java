class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        String str = s.toLowerCase();
        for(char c : str.toCharArray()){
            if(Character.isLetterOrDigit(c)) sb.append(c);
        }
        if(isPal(sb.toString())) return true;
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
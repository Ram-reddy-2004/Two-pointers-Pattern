class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int[] map1 = new int[26];
        for(int i=0;i<p.length();i++){
            map1[p.charAt(i) - 'a']++;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<=s.length()-p.length();i++){
            int[] map2 = new int[26];
            for(int j=i;j<i+p.length();j++){
                map2[s.charAt(j) - 'a']++;
            }
            if(Arrays.equals(map1,map2)){
                res.add(i);
            }
        }
        return res;
        
    }
}
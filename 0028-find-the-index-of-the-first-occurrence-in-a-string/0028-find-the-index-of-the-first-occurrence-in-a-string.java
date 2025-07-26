class Solution {
    public int strStr(String haystack, String needle) {
        for(char ch : haystack.toCharArray()){
            if(haystack.contains(needle)){
                return 0;
            }
        }
        return -1;
        
    }
}
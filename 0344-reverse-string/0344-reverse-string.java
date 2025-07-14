class Solution {
    public void reverseString(char[] s) {
        StringBuilder name = new StringBuilder();
        name.append(s);
        name.reverse();
        
        for (int i = 0; i < s.length; i++) {
            s[i] = name.charAt(i);
        } 
        
    }
}
class Solution {
    public String reverseStr(String s, int k) {
        String result = "";
        for (int i = 0; i < s.length(); i += 2 * k) {
        
            int end = Math.min(i + k, s.length());
            String cha1 = new StringBuilder(s.substring(i, end)).reverse().toString();
            int end2 = Math.min(i + 2 * k, s.length());
            String cha2 = s.substring(end, end2);
            result += cha1 + cha2;
        }
        return result;

        
    }
}
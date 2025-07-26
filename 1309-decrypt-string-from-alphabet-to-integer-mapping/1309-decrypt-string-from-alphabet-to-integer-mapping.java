class Solution {
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            if (i >= 2 && s.charAt(i) == '#') {
                int num = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
                result.append((char) ('a' + num - 1));
                i -= 3;
            } else {
                int num = s.charAt(i) - '0';
                result.append((char) ('a' + num - 1));
                i--;
            }
        }

        return result.reverse().toString();

        
    }
}
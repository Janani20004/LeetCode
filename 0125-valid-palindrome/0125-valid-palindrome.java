class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        s = s.toLowerCase();
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(c);
            }
        }
        StringBuilder reversed = new StringBuilder(cleaned).reverse();

        return cleaned.toString().equals(reversed.toString());

        
        
    }
}
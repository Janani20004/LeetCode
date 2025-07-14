class Solution {
    public String reverseVowels(String s) {
        StringBuilder name = new StringBuilder(s);
        String vowels = "aeiouAEIOU";
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && vowels.indexOf(name.charAt(left)) == -1) left++;
            while (left < right && vowels.indexOf(name.charAt(right)) == -1) right--;

            char temp = name.charAt(left);
            name.setCharAt(left, name.charAt(right));
            name.setCharAt(right, temp);

            left++;
            right--;
        }
        return name.toString();

        
    }
}
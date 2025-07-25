class Solution {
    public String toLowerCase(String s) {
        StringBuilder Lc= new StringBuilder();
        for(char ch:s.toCharArray()){
            Lc.append(Character.toLowerCase(ch));
        }
        return Lc.toString();
    }
}
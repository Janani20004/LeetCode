 class Solution {
    public boolean isValid(String s) {
        if (s.contains("()")) s = s.replace("()", "");
        if (s.contains("{}")) s = s.replace("{}", "");
        if (s.contains("[]")) s = s.replace("[]", "");
        
        
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }
        
        return s.isEmpty(); 
    }
}
class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder name=new StringBuilder();
        name.append(word);
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                StringBuilder prefix=new StringBuilder(word.substring(0,i+1));
                prefix.reverse();
                prefix.append(word.substring(i+1));
                return prefix.toString();
            }
        }
        return word;
        
        
    }
}
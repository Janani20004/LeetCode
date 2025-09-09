class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sLast =new StringBuilder();
        StringBuilder tLast =new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='#'){
                sLast.append(ch);
            }
            else if (sLast.length() > 0) {
                sLast.deleteCharAt(sLast.length() - 1);
            }
        }
        for(int i=0;i<t.length();i++){
            char chh=t.charAt(i);
            if(chh!='#'){
                tLast.append(chh);
            }
            else if(tLast.length()>0){
                tLast.deleteCharAt(tLast.length()-1);
            }
        }
        return sLast.toString().equals(tLast.toString());

    }
}
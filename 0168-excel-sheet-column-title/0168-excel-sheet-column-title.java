class Solution {
    public String convertToTitle(int columnNumber) {
        String title = "";
        while (columnNumber > 0) {
            columnNumber--;
            title = (char)('A' + columnNumber % 26) + title;
            columnNumber /= 26;
        }
        return title;
    }
}
class Solution {
    public int maxRepeating(String sequence, String word) {
        int Count = 0;
        StringBuilder name = new StringBuilder(word);
         while (sequence.contains(name.toString())) {
            Count++;
            name.append(word);
        }
         return Count;
    }
}
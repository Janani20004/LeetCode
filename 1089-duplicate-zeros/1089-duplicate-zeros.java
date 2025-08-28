class Solution {
    public void duplicateZeros(int[] arr) {
        int[] ans = new int[arr.length];
        int n = 0;
        for (int i = 0; i < arr.length && n < arr.length; i++) {
            if (arr[i] == 0) {
                ans[n] = 0;
                n++;
                if (n < arr.length) {
                    ans[n] = 0;
                    n++;
                }
            } else {
                ans[n] = arr[i];
                n++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }

    }
}
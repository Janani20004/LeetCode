class Solution {
    public int countPrimes(int n) {
         boolean[] isPrime = new boolean[n];
        int count = 0;
        for (int i= 2; i < n; i++) {
            if (isPrime[i]) continue;
            count += 1;
            for (long j = (long)i* i; j < n; j += i)
                isPrime[(int) j] = true;
        }
        return count;
    }
}
    
    
        
    
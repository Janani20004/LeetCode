class Solution {
    public int totalNumbers(int[] digits) {
        boolean[] seen=new boolean[1000];
        int count =0;
        int n=digits.length;

        for(int i=0;i<n;i++){
            for( int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i==j||j==k||i==k)continue;

                    int even1=digits[i];
                    int even2=digits[j];
                    int even3=digits[k];
                    
                    if(even1==0){
                        continue;
                    }
                    if(even3 % 2!=0){
                        continue;
                    }
                    int num = even1*100+even2*10+even3;
                    if(!seen[num]){
                        seen[num]=true;
                        count++;
                    }
                }
            }
        }
        return count;

        
    }
}
/**
96. Unique Binary Search Trees 
*/

class Solution {
/** 
O(n!) solution
* NOTE: this wasn't an acceptable solution;
*       runtime limit exceeded when n = 18
*/
    public int numTrees(int n) {
        if(n <= 1){
            return 1;
        }else{
             int count = 0;
            for(int i = 1; i <= n; i++){
                count += numTrees(i-1)*numTrees(n-i);
            }
            return count;
        }
        
    }
    public int numTrees(int m, int n){
        int length = n - m + 1;
        return numTrees(length);
    }

// Dynamic Programming Solution
    public int numTreesDP(int n) {
        int[] counts = new int[n+1];
        
        counts[0]=1;
        counts[1]=1;
        for(int i = 2; i <= n; i++){
            for(int j = 0; j <= i-1; j++){
                counts[i]= counts[i] + counts[j] * counts[i-j-1];
            }
        }
        return counts[n];
        
    }

}
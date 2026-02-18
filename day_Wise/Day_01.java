
// 1. 2235- add two integers:

class Solution {
    public int sum(int num1, int num2) {
        int ans= num1+num2;
         return ans;       
    }
}

// 2. 2413- smallest even multiple:

class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0){
            return n;
        }
        else{
            return 2*n;
        }        
    }
}

// 3. 2011- final-value-of-variable-after-performing-operations:

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            String op=operations[i];
            if(op.charAt(1)=='+'){
                x++;
            }
            if(op.charAt(1)=='-'){
                x--;
            }
        }
        return x;  
    }
}

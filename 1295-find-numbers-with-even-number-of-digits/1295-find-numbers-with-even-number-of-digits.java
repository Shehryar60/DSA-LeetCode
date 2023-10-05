class Solution {
    public int findNumbers(int[] nums) {
         int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i]))
                count++;

        }
        return count;
    }
    boolean even(int n){
        int digits=countDigits(n);
//        if (digits%2==0)
//            return true;
//        return false;

        return digits%2==0;
    }
// find no of digits
    static int countDigits(int n){
        int count=0;
        if(n<0){
            n=n*-1; //for negative values make it positive
        }

//        while (n>0){
//            n=n/10;
//            count++;
//        }
//        return count;

        return (int) (Math.log10(n)+1);
    }
}
    



class Solution {
       public int splitArray(int[] nums, int m) {
        int start=0;
        int end=0;
        for (int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]); // at end max value will be returned i.e smallest sum
            end=end+nums[i]; // biggest sum i.e total sum of array



        }
        // apply binary search

        while (start<end){
              // try for mid as potential ans
            int middle=start+(end-start)/2;
            //calculate how many pieces you can divide this array into with max sum

            int sum=0;
            int pieces=1;

            for (int num:nums){
                if (num+sum>middle){
                    //  make new sub array,you cannot add in this subarray
                    sum=num;
                    pieces++;
                }
                else {
                     sum=sum+num;
                }
            }
            if (pieces>m){
                
                start=middle+1;
            }
            else {
                end=middle;
            }




        }



          return end; //when loop breaks and start==end
    }
}

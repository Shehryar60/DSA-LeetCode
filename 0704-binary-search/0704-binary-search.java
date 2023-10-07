class Solution {
      int search(int[] nums, int target) {

//            pointers of s and e
        int start=0;
        int end=nums.length-1;

// loop

            while (start<=end){
//                finding middle

                int middle=start+(end-start)/2;

                if(nums[middle]<target){
                    start=middle+1;

                } else if (nums[middle]>target) {
                    end=middle-1;

                }
                else {
                    return middle;
                }
            }
                return -1;


        }
}
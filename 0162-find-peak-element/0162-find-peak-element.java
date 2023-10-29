class Solution {
    public int findPeakElement(int[] arr) {
        
          int start=0;
        int end=arr.length-1;

        while (start<end){
            int mid=start+(end-start)/2;

            if (arr[mid]<arr[mid+1]){
//                we are ascending portion
                start=mid+1; //no need to look for mid as mid+1 is certainly bigger
            }
            else {
//                we are in the descending portion
                end=mid;  // possible ans is mid  or among no in left side
//                no need to check nos ahead


            }



        }
        return start;
    }
}
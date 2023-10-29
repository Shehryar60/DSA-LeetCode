class Solution {
    public int peakIndexInMountainArray(int[] arr) {
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
// in the end start==end and pointing towards the largest no because of two checks above
//        start and end are always trying to find  just one element i.e max element in above 2 checks
//        hence when they are pointing to just one elemnt, that is what checks say

//        in the end there are no checks left so this number is definitely the biggest

    }
}
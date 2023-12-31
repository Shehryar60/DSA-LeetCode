class Solution {
       
    
       static int search(int [] arr, int target){
        int peak=findPivot(arr);
        if (peak==-1){
            return binarySearch(arr,target,0,arr.length-1);

        }
        if (arr[peak]==target){
            return peak;
        }
        if (target>=arr[0]){
            return binarySearch(arr,target,0,peak-1);
        }

            return binarySearch(arr,target,peak+1,arr.length-1);


    }
    static int binarySearch(int[] arr,int target,int start,int end) {



        while (start<=end){

//             find middle element
            int middle=start+(end-start)/2;  //its possible (s+e) may exceed the limit
            if (target<arr[middle]){
                end=middle-1;
            } else if (target>arr[middle]) {
                start=middle+1;

            }
            else {
                return middle;
            }
        }
        return -1;
    }
static int findPivot(int [] arr){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;

//            4 cases here

            if (mid<end&& arr[mid]>arr[mid+1] ) {  //mid<end to avoid index out of bound
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            if (arr[start]>=arr[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }



        }
    return -1;

}


}
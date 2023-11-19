class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int start=0;
        int r=matrix.length;
        int c=matrix[0].length;
        
        int end=(r*c)-1;
        
        
        while(start<=end){
            int mid=start+(end-start)/2;
            int row=mid/c;
            int col=mid%c;
            
            
            if(target==matrix[row][col]){
                
                return true;
            }
            else if(target>matrix[row][col]){
                start=mid+1;
                
                
                
            }
            else if(target<matrix[row][col]){
                end=mid-1;
            
            
            
        }
        
        
        
        
    }
        return false;
}
    
    
}
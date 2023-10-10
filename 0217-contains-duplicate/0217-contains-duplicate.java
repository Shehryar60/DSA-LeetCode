class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> cars = new HashSet<Integer>();

            for (int i=0;i<nums.length;i++){

                if(cars.contains(nums[i])){
                    return true;
                }
                cars.add(nums[i]);
            }


        return false;


    }

 
            
}

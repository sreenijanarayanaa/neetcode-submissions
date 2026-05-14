class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0 || nums.length==1) return nums.length;
        int cons=1, longestCons=1,i=1;
        while(i<nums.length){
            if(nums[i]-nums[i-1]==0 || nums[i]-nums[i-1]==1)
            {
               if( nums[i]-nums[i-1]==1)
                cons++;
            }
            else{
                cons=1;
            }
             i++;
            longestCons = Math.max(cons,longestCons);
        }
        return longestCons;
    }
}

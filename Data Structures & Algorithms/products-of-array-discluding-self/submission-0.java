class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prodArray = new int[nums.length];
        int product = 1, zeros = 0;
        for(int n:nums){
            if(n==0)
            zeros++;
            else{
            product = product * n;
            }
        }
        if(zeros==0){
            for(int i=0;i<nums.length;i++){
            prodArray[i] = product/nums[i];
            }
        }
        else if(zeros==1){
            for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            prodArray[i] = product;
            }
        }
        return prodArray;
    }
}  

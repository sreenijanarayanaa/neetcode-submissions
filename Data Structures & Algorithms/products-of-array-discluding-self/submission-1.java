class Solution {
    public int[] productExceptSelf(int[] nums) {
        //find product of whole array ignoring zero's
        int product =1, len = nums.length, zeros = 0;
        int[] prod = new int[len];
        for(int n:nums){
            if(n!=0)
            product *= n;
            else
            zeros++;
        }
        for(int i=0;i<len;i++){
            if(zeros>1)
            return prod;
            else if(zeros==1){
            if(nums[i]==0)
            prod[i] = product;
            else
            prod[i] = 0;
            }
            else{
                prod[i] = product/nums[i];
            }
        }
        return prod;

    }
}  

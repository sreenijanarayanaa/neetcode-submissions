class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int find = target - nums[i];
            if(hashMap.containsKey(find)){
                int j = hashMap.get(find);
                return new int[]{Math.min(i,j),Math.max(i,j)};
            }
            hashMap.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}

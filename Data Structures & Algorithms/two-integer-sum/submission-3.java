class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            if(map.containsKey(n)){
                return new int[]{map.get(n),i};
            }
            int find = target - n;
            map.put(find,i);

        }
        return new int[]{-1,-1};
    }
}

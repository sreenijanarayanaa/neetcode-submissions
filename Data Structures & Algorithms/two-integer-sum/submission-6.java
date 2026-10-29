class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            if(hm.containsKey(n)){
                return new int[]{hm.get(n),i};
            }
            int find = target-n;
            hm.put(find,i);
            }
            return new int[]{-1,-1};
    }
}

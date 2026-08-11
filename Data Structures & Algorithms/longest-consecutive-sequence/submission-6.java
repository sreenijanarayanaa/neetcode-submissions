class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1)return nums.length;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int n:nums){
            hs.add(n);
        }
        int count=0, maxCount=0;
        for(int n:hs){
            count=0;
            if(!hs.contains(n-1)){
                while(hs.contains(n)){
                    count++;
                    n++;
                }
                maxCount = Math.max(count, maxCount);
            }
        }
        return maxCount;
    }
}

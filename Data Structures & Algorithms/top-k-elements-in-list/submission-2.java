class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> counts = new HashMap<>();
        List<Integer>[] countArray = new List[nums.length+1];
        for(int n:nums){
           counts.put(n,counts.getOrDefault(n,0)+1);
        }
        for(int key:counts.keySet()){
            if(countArray[counts.get(key)] ==null)
            countArray[counts.get(key)] = new ArrayList();
            countArray[counts.get(key)].add(key);
        }
        int[] result = new int[k];
        int j=0;
        for(int i=countArray.length-1;i>0;i--){
            if(countArray[i]!=null){
                for(int n:countArray[i]){
                    if(j>=k)return result;
                    result[j++] = n;
                }
            }
        }
        return result;



    }
}

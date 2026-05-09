class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //find freq of each ele in nums
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

        //create a bucket for each occ count
        List<Integer>[] bucket =  new List[nums.length+1];
        for(int key:hm.keySet()){
            if(bucket[hm.get(key)]==null){
                bucket[hm.get(key)] = new ArrayList();
            }
            bucket[hm.get(key)].add(key);
        }

        int ind=0;
        int[] arr = new int[k];
        for(int i=nums.length;i>=0 && ind<k;i--){
            if(bucket[i]!=null){
                for(int j=0;j<bucket[i].size() && ind<k;j++){
                    
                arr[ind++] = bucket[i].get(j);
                }
            }
        }
        return arr;
    }
}

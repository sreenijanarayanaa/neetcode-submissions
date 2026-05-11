class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

        //take a array of lists
        List<Integer>[] list = new List[nums.length+1];
        for(int key:hm.keySet()){
            int value = hm.get(key);
            if(list[value]==null){
                list[value] =  new ArrayList();
            }
            list[value].add(key);
        }

        int ind=0;
        int[] topK = new int[k];
        for(int i=list.length-1;i>=0 && ind<k; i--){
            if(list[i]!=null){
                for(int j=0;j<list[i].size() && ind<k;j++){
                topK[ind] = list[i].get(j);
                ind++;
                }
            }
        }

        return topK;

    }
}

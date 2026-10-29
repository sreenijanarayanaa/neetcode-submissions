class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> groupAnagramHM = new HashMap<>();

        for(String s: strs){
            int[] chars = new int[26];
            for(char ch:s.toCharArray()){
                chars[ch-'a']++;   
            }
            String counts = Arrays.toString(chars);

            if(!groupAnagramHM.containsKey(counts)){
                groupAnagramHM.put(counts,new ArrayList<>());
            }
            groupAnagramHM.get(counts).add(s);
        }
        return new ArrayList<>(groupAnagramHM.values());
    }
}

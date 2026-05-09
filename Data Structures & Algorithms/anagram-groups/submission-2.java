class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm =  new HashMap<>();
        for(String s: strs){
            int[] chars = new int[26];
            for(char ch:s.toCharArray()){
                chars[ch-'a']++;
            }
            String key = Arrays.toString(chars);
            hm.computeIfAbsent(key, v -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}

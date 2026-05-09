class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hashMap = new HashMap<>();
        
        for(String s:strs){
        int[] chars = new int[26];
        for(char ch:s.toCharArray()){
            chars[ch-'a']++;
        }
        String key = Arrays.toString(chars);
        hashMap.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(hashMap.values());
    }
}

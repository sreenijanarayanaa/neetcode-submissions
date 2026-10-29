class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<String,List<String>>();

        for(String s:strs){
            int[] chars = new int[26];
            for(char ch:s.toCharArray()){
                chars[ch-'a']++;
            }
            String charsCount = Arrays.toString(chars);
            if(!hm.containsKey(charsCount))
            hm.put(charsCount,new ArrayList<String>());
            hm.get(charsCount).add(s);
        }

        return new ArrayList<>(hm.values());
    }
}

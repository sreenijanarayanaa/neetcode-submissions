class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hashMap = new HashMap<String,List<String>>();
        List<List<String>> list = new ArrayList<>();
        for(String s:strs){
            int[] chars = new int[26];
            for(char ch:s.toCharArray()){
                chars[ch-'a']++;
            }
            String chCount = Arrays.toString(chars);
            if(!hashMap.containsKey(chCount))
            hashMap.put(chCount,new ArrayList<>());
            hashMap.get(chCount).add(s);
        }

         list.addAll(hashMap.values());
         return list;
    }
}

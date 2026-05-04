class Solution {
    public boolean isAnagram(String s, String t) {
        int n1 = s.length(), n2 = t.length();
        if(n1!=n2)return false;
        int i=0;
        int[] chars = new int[26];
        while(i<n1){
            chars[s.charAt(i)-'a']++;
            chars[t.charAt(i)-'a']--;
            i++;
        }
        for(i=0;i<26;i++){
            if(chars[i]!=0) return false;
        }
        return true;
    }
}

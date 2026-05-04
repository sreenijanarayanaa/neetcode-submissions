class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,len=0,maxLen=0;
        char[] chars = new char[256];
        while(j<s.length()){
            chars[s.charAt(j)]++;
            while(chars[s.charAt(j)]>1 && i<s.length()){
                chars[s.charAt(i)]--;
                i++;
            }
            len = j-i+1;
            maxLen = Math.max(len,maxLen);
            j++;
        }
        return maxLen;
    }
}

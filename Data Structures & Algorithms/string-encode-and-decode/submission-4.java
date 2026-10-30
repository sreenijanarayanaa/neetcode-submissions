class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s:strs){
            sb.append(s.length());
            sb.append("*");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int ind=0,j=0;
        ArrayList<String> strings = new ArrayList<String>();
        while(ind<str.length()){
            j=ind;
            while(str.charAt(j)!='*')
            j++;

            int len = Integer.parseInt(str.substring(ind,j));
            strings.add(str.substring(j+1,j+len+1));
            ind=j+len+1;

        }
        return strings;
    }
}

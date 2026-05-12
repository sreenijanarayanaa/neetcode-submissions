class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s:strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        int ind = 0;

        while (ind < str.length()) {

            int j = ind;

            // find '#'
            while (str.charAt(j) != '#') {
                j++;
            }

            // parse length
            int len = Integer.parseInt(str.substring(ind, j));

            // extract string
            list.add(str.substring(j + 1, j + len + 1));

            // move to next encoded part
            ind = j + len + 1;
        }

        return list;
    }

}

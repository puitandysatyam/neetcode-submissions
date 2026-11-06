class Solution {

    public String encode(List<String> strs) {

        StringBuilder res = new StringBuilder();

        for(String str : strs){
            int len = str.length();
            res.append(len).append('#').append(str);
        }

        return res.toString();
    }

    public List<String> decode(String str) {

        List<String> strs = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int hashIndex = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, hashIndex));
            String substr = str.substring(hashIndex + 1, hashIndex + 1 + len);
            strs.add(substr);
            i = hashIndex + 1 + len;
        }

        return strs;
    }
}
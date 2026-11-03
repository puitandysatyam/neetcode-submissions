class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        
        int ascii;
        for(int i = 0; i<strs.length;i++){
            String str = strs[i];
            int freq[] = new int[26];
            for(char c : str.toCharArray()){
                ascii = (int)c - 97;
                freq[ascii] +=1;
            }
            String key = Arrays.toString(freq);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);

        }

        return new ArrayList<>(map.values());


        
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>m=new HashMap<>();
        for(String x:strs){
            int[] count = new int[26];
            for(char c : x.toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            m.putIfAbsent(key,new ArrayList<>());
            m.get(key).add(x);
        }
        return new ArrayList<>(m.values());

        

    }
}

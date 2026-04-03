class TimeMap {
    HashMap<String,Map<Integer,String>>map=new HashMap<>();
    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new HashMap<>())
       .put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if(map.containsKey(key)){
            while(timestamp>0){
            if(map.get(key).containsKey(timestamp)){
                return map.get(key).get(timestamp);
            } else {
                timestamp--;
            }
            }
        }
        return "";
    }
}

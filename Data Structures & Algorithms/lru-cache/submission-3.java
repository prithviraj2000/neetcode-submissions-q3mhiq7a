class LRUCache {
    Deque<Integer> dq = new ArrayDeque<Integer>();
    HashMap<Integer,Integer>m = new HashMap<>();
    int capacity;
    public LRUCache(int capacity) {
        this.capacity=capacity;
    }
    
    public int get(int key) {
        if(m.containsKey(key)){
            dq.remove(key);
            dq.add(key);
            return m.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (m.containsKey(key)) {
            // Update existing key
            dq.remove(key);
        } 
        else if (m.size() == capacity) {
            // Evict least recently used key
            int lruKey = dq.removeFirst();
            m.remove(lruKey);
        }

        // Insert new / updated key
        m.put(key, value);
        dq.addLast(key);
    }
}

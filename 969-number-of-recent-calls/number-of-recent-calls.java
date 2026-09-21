class RecentCounter {
    ArrayDeque<Integer>arr;


    public RecentCounter() {
         this.arr = new ArrayDeque<>(); 
        
    }
    
    public int ping(int t) {
         arr.add(t);
        while(arr.peek()<t-3000){
            arr.remove();
        }
       
        return arr.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
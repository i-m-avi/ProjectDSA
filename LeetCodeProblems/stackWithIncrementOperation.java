class CustomStack {
    
    int[] arr;
    int len;

    public CustomStack(int maxSize) {
        arr= new int[maxSize];
        len = 0;
    }
    
    public void push(int x) {
        if(len < arr.length)
        {
            arr[len++]=x;   
        }
    }
    
    public int pop() {
        if(len > 0)
            return arr[--len];
        return -1;
    }
    
    public void increment(int k, int val) {
        for(int i=0; i<k && i<len; i++)
        {
            arr[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
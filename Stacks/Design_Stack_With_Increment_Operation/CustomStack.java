package Design_Stack_With_Increment_Operation;

class CustomStack {
    int[] arr = null;
    int current_size = 0;

    public CustomStack(int maxSize) {
        arr = new int[maxSize];
    }
    
    public void push(int x) {
        if(current_size == arr.length)
            return;
        
        arr[current_size] = x;
        current_size++;
    }
    
    public int pop() {
        if(current_size == 0)
            return -1;
        
        int ans = arr[current_size-1];
        arr[current_size-1] = 0;
        current_size--;
        return ans;
    }
    
    public void increment(int k, int val) {
        if(val == 0 || current_size == 0)
            return;
        if(k > arr.length)  
            k = arr.length;

        for(int i=0; i<k; i++)
            arr[i] = arr[i] + val;
    }
}
class MyStack {
    ArrayList<Integer> arr;
    
    public MyStack() {
        arr = new ArrayList<>();
    }
    
    public void push(int x) {
        arr.add(x);
    }
    
    public int pop() {
        return (arr.size()!=0) ? arr.remove(arr.size()-1) : -1;
    }
    
    public int top() {
        return (arr.size()!=0) ? arr.get(arr.size()-1) : -1;
    }
    
    public boolean empty() {
        return (arr.size()==0) ? true : false;
    }
}

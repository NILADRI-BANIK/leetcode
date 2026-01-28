class MyQueue {

    private Stack<Integer> m;
    private Stack<Integer> help;

    public MyQueue() {
        m = new Stack<>();
        help = new Stack<>();
    }

    public void push(int x) {
        while (m.size() > 0) {
            help.push(m.pop());
        }

        m.push(x);

        while (help.size() > 0) {
            m.push(help.pop());
        }
    }

    public int pop() {
        return m.pop();
    }

    public int peek() {
        return m.peek();
    }

    public boolean empty() {
        if (m.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
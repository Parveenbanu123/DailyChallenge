import java.util.*;
public class QueueUsingStack {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.pop());
        System.out.println(queue.pop());

        queue.push(4);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}
class MyQueue {
    public Stack<Integer> stk1 = new Stack<>();
    public Stack<Integer> stk2 = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!stk1.isEmpty())
        {
            stk2.push(stk1.pop());
        }
        stk1.push(x);
        while(!stk2.isEmpty())
        {
            stk1.push(stk2.pop());
        }
    }
    
    public int pop() {
        if(!stk1.isEmpty())
        {
            return stk1.pop();
        }
        return -1;
    }
    
    public int peek() {
        if(!stk1.isEmpty())
        {
            return stk1.peek();
        }
        return -1;
    }
    
    public boolean empty() {
        return stk1.isEmpty();
    }
}


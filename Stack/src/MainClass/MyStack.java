package MainClass;

import java.util.EmptyStackException;

public class MyStack<T> {
    static class StackNode<T>{
	private T data;
	private StackNode<T> next;
	public StackNode() {}
	public StackNode(T data) {
	    this.data = data;
	    this.next = null;
	}
    }
    private StackNode<T> top;
    public T pop() {
	if(top == null) {
	    throw new EmptyStackException();
	}
	T item = top.data;
	top = top.next;
	return item;
    }
    
    public void push(T item) {
	StackNode<T> t = new StackNode<T>(item);
	t.next = top;
	top = t;
    }
    
    public T peek() {
	if(top == null) {
	    throw new EmptyStackException();
	}
	return top.data;
    }
    
    public boolean isEmpty() {
	return top == null;
    }
}

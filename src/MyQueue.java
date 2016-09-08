import java.util.LinkedList;


public class MyQueue<T> implements Queue<T>{
	Node<T> head,tail;
	int size = 0;
	
	public MyQueue(){
		head = new Node<>(null);
		tail = head;
	}
	@Override
	public void push(T obj) {
		// TODO Auto-generated method stub
		tail.next = new Node<>(obj);
		tail = tail.next;
		size++;
	}

	@Override
	public T poll() {
		// TODO Auto-generated method stub
		if(head == tail){
			return null;
		}
		T temp = head.next.val;
		head.next = head.next.next;
		return temp;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if(head == tail){
			return null;
		}		
		return head.next.val;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}



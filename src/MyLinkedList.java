
public class MyLinkedList<T> implements LinkedList<T>{
	Node<T> head;
	
	public MyLinkedList(){
		head = new Node<T>(null);
	}
	@Override
	public boolean add(T t, int index) {
		// TODO Auto-generated method stub
		Node<T> current = head;
		while(--index != 0){
			if(current.next == null){
				return false;
			}
			current = current.next;
		}
		Node<T> temp = current.next;
		current.next = new Node<>(t);
		current.next.next = temp;
		return true;
	}

	@Override
	public boolean remove(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T find(int index) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public boolean update(T t) {
		// TODO Auto-generated method stub
		return false;
	}

}

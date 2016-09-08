
public class MyStack<T> implements Stack<T>{
	int capacity = 0;
	int top = 0;
	T[] nums = null;
	
	public MyStack(int capacity){
		if(capacity < 1){
			capacity = 1;
		}
		this.capacity = capacity;
		nums = (T[]) new Object[capacity];
	}
	
	
	@Override
	public void push(T obj) {
		// TODO Auto-generated method stub
		if(top  >= capacity){
			enlarge();
		}
		nums[top++] = obj;
	}

	
	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			return null;
		}
		return nums[--top];
	}

	@Override
	public T top() {
		// TODO Auto-generated method stub
		if(isEmpty()){
			return null;
		}
		return nums[top-1];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return top;
	}
	
	private void enlarge() {
		// TODO Auto-generated method stub
		T[] temp = (T[]) new Object[capacity*2];
		System.arraycopy(nums, 0, temp, 0, capacity);
		capacity *=2;
		nums = temp;
	}
	
}

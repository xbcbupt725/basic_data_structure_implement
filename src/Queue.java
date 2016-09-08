
public interface Queue<T> {
	void push(T obj);
	T poll();
	T peek();
	boolean isEmpty();
	int size();
}

package genericstacks;

public interface GenericStack<T> {
	int size();
	boolean isEmpty();
	void push(T element);
	T pop();
	T peek();
	String toString();
}

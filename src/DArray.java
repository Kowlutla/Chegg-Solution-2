/* ==================================
*
* @purpose: simple illustration of a dynamic array/vector
*/
public class DArray<T> {
	private final double GROW_FACTOR = 0.5;// array size growing rate
	private final int D_SIZE = 10;
	// attributes
	private int size;
	private T buffer[]; // the actual array

	// constructors
	public DArray() {
		this.size = 0;
		this.buffer = (T[]) new Object[D_SIZE];
	}

	public DArray(int size) throws Exception {
		if (size < 0) {
			throw new Exception("Not a valid range");
		}
		this.size = size;// the actual array size
		int bufferSize = (int) Math.ceil(this.size + this.size * GROW_FACTOR);
		this.buffer = (T[]) new Object[D_SIZE]; // create the buffer
	}

	// methods
	// method to insert value at given index
	public void insert(int index, T value) {
		// if length of array reaches the max length
		if (length() == maxLength()) {
			// resize the array
			resize((int) (this.size + this.size * GROW_FACTOR));
		}

		// create a new array of size n+1
		T newarr[] = (T[]) new Object[buffer.length];

		int n = size + 1;
		// insert the elements from
		// the old array To the new array
		// insert all elements till pos
		// then insert x at pos
		// then insert rest of the elements
		for (int i = 0; i < n; i++) {
			if (i < index)
				newarr[i] = buffer[i];
			else if (i == index)
				newarr[i] = value;
			else
				newarr[i] = buffer[i - 1];
		}
		size++;
		this.buffer = newarr;
	}

	// method to add value at end of array
	public void add(T value) {
		// if
		if (length() == maxLength()) {
			resize((int) Math.ceil(this.size + this.size * GROW_FACTOR));
		}
		this.buffer[size++] = value;
	}

	/**
	 *
	 * @return the actual size of the array
	 */
	public int length() {
		return this.size;
	}

	/**
	 *
	 * @return the max length of the dynamic array
	 */
	public int maxLength() {
		return this.buffer.length;
	}

	/**
	 *
	 * @param index - the location of the element in the array
	 * @return the element at the given location/index
	 */
	public T elementAt(int index) throws Exception {
		if (index < 0 || index >= this.size)
			throw new Exception("Index out of bound");
		return this.buffer[index];
	}

	public void set(int index, T value) throws Exception {
		if (index < 0 || index >= this.size)
			throw new Exception("Index out of bound");
		this.buffer[index] = value;
	}

	// method to resize the array
	public void resize(int size) {
		T temp[] = (T[]) new Object[size];
		int currentSize = -1;
		if (size < length()) {
			currentSize = size;
		} else {
			currentSize = length();
		}
		System.arraycopy(this.buffer, 0, temp, 0, currentSize);
		this.buffer = temp;
		this.size = currentSize;
	}

	// method to get the first value in array
	public T getFirst() throws Exception {
		if (length() == 0) {
			throw new Exception("No elements in array");
		}
		return this.buffer[0];
	}

	// method to get last value in array
	public T getLast() throws Exception {
		if (length() == 0) {
			throw new Exception("No elements in array");
		}
		return this.buffer[size - 1];
	}
}


/**Thomas Burlett
 * Lab 2
 * 8/29/2015
 */
import java.lang.IllegalStateException;

public class IntStack {

	private int[] array;
	private int maxSize;
	private int size = 0;

	/**
	 * Constructor
	 * 
	 * @param max_size
	 *            Maximum size of the queue
	 */
	public IntStack(int maxSize) {

		this.maxSize = maxSize;
		this.array = new int[maxSize];
	}

	/**
	 * Push a value onto the top of a queue.
	 * 
	 * @param value
	 *            Value to be pushed
	 * @exception IllegalStateException
	 *                Thrown if the stack is full
	 */
	public void push(int value) {

		if (size == array.length) {
			throw new IllegalStateException("The stack is full.");
		}

		array[size++] = value;

	}

	/**
	 * Pop a value from the stack: return the value, remove from stack.
	 * 
	 * @return Top values of stacke
	 * @exception IllegalStateException
	 *                Thrown if you pop from an empty stack.
	 */
	public int pop() {

		if (size == 0) {
			throw new IllegalStateException("Stack is empty.");
		}

		int n = array[size - 1];
		array[--size] = 0;
		return n;

	}

	/**
	 * Return the top value on the stack without removing it.
	 * 
	 * @return Topf value of stacke.
	 * @exception IllegalStateException()
	 *                Thrown if if applied to an empty stack.
	 */
	public int peek() {

		if (size == 0) {
			throw new IllegalStateException("Stack is empty.");
		}

		return array[size - 1];
	}

	/**
	 * Determine if the stack is empty.
	 * 
	 * @return True if empty.
	 */
	public boolean isEmpty() {

		return (size == 0);

	}

	/**
	 * Determine if the stack is at capacity.
	 * 
	 * @return True if at capacity.
	 */
	public boolean isFull() {

		return (size == maxSize);

	}

	/**
	 * Number of elements in the stack.
	 * 
	 * @return Number of elements in the stack.
	 */
	public int size() {

		return size;

	}
}
import java.lang.reflect.Array;
import java.util.EmptyStackException;

public class ArrayBasedStack<T> implements StackInterface<T> {
	private final int MINIMUM_CAPACITY = 5;
	private T[] stack;
	private int topPos = -1;
	@SuppressWarnings("unchecked")
	public ArrayBasedStack(){
		stack = (T[])new Object[MINIMUM_CAPACITY];
		
	}
	
	private void expandArray(){
		this.stack = (T[])new Object[stack.length *  2];
		
	}
	
	private boolean arrayFull(){
		return stack.length == topPos+1;
	}
	
	@Override
	public void push(T newEntry) {
		if(arrayFull())
			expandArray();
		stack[topPos + 1] = newEntry;
		topPos++;
	}

	@Override
	public T pop() {
		if(isEmpty())
			throw new EmptyStackException();
		T val = stack[topPos];
		topPos--;
		return val;
	}

	@Override
	public T peek() {
		if(isEmpty())
			throw new EmptyStackException();
		return stack[topPos];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return topPos == -1;
	}

	@Override
	public void clear() {
		topPos = -1;
		
	}

}

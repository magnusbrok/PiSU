package dk.dtu.compute.se.pisd.stack;

/**
 * A template for implementing a {@see dk.dtu.compute.se.pisd.stack.Stack}
 * by using arrays. This is supposed to be implemented by
 * the students as a task of assignment 1 of the course. Note that
 * since Java arrays cannot be extended dynamically, the array must
 * be replaced at some points by a larger array.
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public class ArrayStack implements Stack {

	int size = 0;
	int[] arr = new int[10];



	@Override
	public void clear() {
		size = 0;
	}

	@Override
	public Integer pop() {
		int temp = 0;
		if (size != 0){
			temp = arr[size-1];
			size--;
			return temp;

		}
		else System.out.println("Pop on empty stack not null");
		return null;
	}

	@Override
	public Integer top() {
		if (size > 0) {
			return arr[size-1];
		}
		else return null;

	}

	@Override
	public void push(Integer value) {
		if (size >= arr.length) {
			int[] newarr = new int[size*2];

			for (int i = 0 ; i < arr.length ; i++) {
				newarr[i] = arr[i];
			}
			arr = newarr;

		}
			arr[size] = value;
			size++;

	}

	@Override
	public int size() {
		return size;
	}

}

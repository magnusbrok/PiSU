package dk.dtu.compute.se.pisd.stack;

/**
 * A template for implementing a {@see dk.dtu.compute.se.pisd.stack.Stack}
 * as a (singly) linked list. This is supposed to be implemented by
 * the students as the task of assignment 1 of the course. 
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public class LinkedListStack implements Stack {
	int value;
	StackElement start;
	int size;

	class StackElement {
		int value;
		StackElement next;
	}


	@Override
	public void clear() {
		size = 0;
		start = null;
	}

	@Override
	public Integer pop() {
		if (start != null) {
			StackElement temp = start;
			start = temp.next;
			size--;
			return temp.value;

		}
		else {
			System.out.println("Stack is not empty finally");
			return null;
		}
	}

	@Override
	public Integer top() {
		if (start == null) {
			return null;
		}
		else {
			int top = start.value;
			return top;
		}
	}

	@Override
	public void push(Integer value) {
		StackElement element = new StackElement();
		element.value = value;
		element.next = start;
		start = element;
		size++;

	}

	@Override
	public int size() {
		return size;
	}

}

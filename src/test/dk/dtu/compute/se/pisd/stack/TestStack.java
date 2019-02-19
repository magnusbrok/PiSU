package dk.dtu.compute.se.pisd.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dk.dtu.compute.se.pisd.stack.Stack;

/**
 * This is an abstract test class for all kinds of stack implementations.
 * Sub-classes must create a {@see dk.dtu.compute.se.pisd.stack.Stack}
 * of the specific kind in their {@see #setUp()} method;
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public abstract class TestStack {

	protected Stack stack;

	final int TESTLIMIT = 10000;
	
	@Before
	abstract public void setUp() throws Exception;

	@Test
	public void testStackEmptyOnCreation() {
		Assert.assertTrue("Stack is not empty initally", stack.isEmpty());
	}
	
	@Test
	public void testPushPopSequence() {
		for (int i = 0; i <= TESTLIMIT; i++) {
			stack.push(i);
			int value = stack.top();
			Assert.assertEquals(
					"Pushed value is not on top",
					i,
					value);
		}

		for (int i = TESTLIMIT; i >= 0; i--) {
			int value = stack.pop();
			Assert.assertEquals(
					"Popped wrong value from stack", 
					i,
					value);

		}
		
		Assert.assertTrue(
				"Stack is not empty finally",
				stack.isEmpty());
	}
	
	@Test
	public void 	testPopOnEmptyStack() {
		Assert.assertNull("Pop on empty stack not null", stack.pop());	
	}


}

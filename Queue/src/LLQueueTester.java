import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LLQueueTester {

	LLQueue<Integer> queueOne;
	
	
	/**
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		queueOne = new LLQueue<Integer>();
		queueOne.add(101);
		queueOne.add(200);
	}
	
	@Test
	public void testPoll(){
		queueOne.poll();
		assertEquals("Add: check element 0 is correct", (Integer)200, queueOne.element());
	}
	
	@Test
	public void testSize(){
		assertEquals("Size: check size is correct", 2, queueOne.getSize());
	}
	
	@Test
	public void testAdd(){
		LLQueue<Integer> secondQueue = new LLQueue<Integer>();
		secondQueue.add(123);
		assertEquals("Add: check if add worked", (Integer)123, secondQueue.poll());
	}
	
	@Test
	public void testElement(){
		queueOne.element();
		assertEquals("Element: check if element is correct", (Integer)101, queueOne.element());
		assertEquals("Element: check if element is correct", (Integer)101, queueOne.peek());
	}
	
	
}

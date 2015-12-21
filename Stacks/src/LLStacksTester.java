import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LLStacksTester {

	LLStacks<Integer> llStack;
	LLStacks<Integer> otherStack;
	
	@Before
	public void setUp() throws Exception {
		llStack = new LLStacks<Integer>();
		llStack.push(100);
		llStack.push(200);
		llStack.push(300);
		
		otherStack = new LLStacks<Integer>();
	}
	
	@Test
	public void testSize(){
		assertEquals("check size", 3, llStack.size());
	}
	
	@Test
	public void testPush(){
		llStack.push(33);
		assertEquals("check size", 4, llStack.size());
	}
	
	@Test
	public void testEmpty(){
		assertEquals("check if the stack is empty", false, llStack.empty());
		assertEquals("check if the stack is empty", true, otherStack.empty());
	}
	
	@Test
	public void testPeek(){
		otherStack.push(21);
		assertEquals("check peek: check the top of the stack",(Integer)300, llStack.peek());
		assertEquals("check peek: check the top of the stack",(Integer)21, otherStack.peek());
	}
	
	@Test 
	public void testPop(){
		assertEquals("check pop: top of the stack", (Integer)300, llStack.pop());
		assertEquals("check pop: top of the stack", (Integer)200, llStack.peek());
		llStack.pop();
		assertEquals("check pop: top of the stack", (Integer)100, llStack.peek());
	}

}

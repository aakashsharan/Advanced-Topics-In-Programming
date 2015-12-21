import static org.junit.Assert.*;

import java.util.EmptyStackException;

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
		assertEquals("check size", 0, otherStack.size());
	}
	
	@Test
	public void testPush(){
		llStack.push(33);
		assertEquals("check size", 4, llStack.size());
		try{
			llStack.push(null);
			fail("NullPointerException");
		}
		catch(NullPointerException e){
			
		}
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
		otherStack.pop();
		try{
			otherStack.peek();
			fail("EmptyStackException");
		}
		catch(EmptyStackException e){
			
		}
	}
	
	@Test 
	public void testPop(){
		assertEquals("check pop: top of the stack", (Integer)300, llStack.pop());
		assertEquals("check pop: top of the stack", (Integer)200, llStack.peek());
		llStack.pop();
		assertEquals("check pop: top of the stack", (Integer)100, llStack.peek());
		llStack.pop();
		try{
			llStack.pop();
			fail("EmptyStackException");
		}
		catch(EmptyStackException e){
			
		}
	}
	
	@Test
	public void testSearch(){
		assertEquals("check size first", 3, llStack.size());
		assertEquals("find object", 3, llStack.search(100));
		assertEquals("find object", 2, llStack.search(200));
		llStack.pop();
		assertEquals("find object", 1, llStack.search(200));
		assertEquals("find object", -1, llStack.search(123300));
		llStack.pop();
		llStack.pop();
		try{
			llStack.search(22);
			fail("EmptyStackException");
		}
		catch(EmptyStackException e){
			
		}
	}

}

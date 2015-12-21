import java.util.EmptyStackException;

public class LLStacks<E> {

	LLNode<E> head;
	LLNode<E> tail;
	int size;
	
	public LLStacks(){
		head = new LLNode<E>();
		tail = new LLNode<E>();
		head.next = tail;
		tail.prev = head;
		size = 0;
	}
	
	/** Tests if this stack is empty.
	 * @return boolean true if stack is empty else false.
	 */
	public boolean empty(){
		if(size == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	/** Looks at the object at the top of this stack without removing it from the stack.
	 * @return object at the top of the stack
	 * @throws EmptyStackException if the stack is empty.
	 */
	public E peek(){
		if(size == 0){
			throw new EmptyStackException();
		}
		else{
			E data = null;
			LLNode<E> lastNode = tail.prev;
			data = lastNode.data;
			return data;
		}
	}
	
	
	/** Removes the object at the top of the stack and returns that object as the value of this function.
	 * @return object at the top of the stack.
	 * @throws EmptyStackException if the stack is empty.
	 */
	public E pop(){
		if(size == 0){
			throw new EmptyStackException();
		}
		else{
			E data = null;
			LLNode<E> lastNode = tail.prev;
			LLNode<E> finalNode = lastNode.prev;
			finalNode.next = tail;
			tail.prev = finalNode;
			
			data = lastNode.data;
			return data;
		}
	}
	
	
}

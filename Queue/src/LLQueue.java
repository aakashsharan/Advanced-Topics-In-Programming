import java.util.NoSuchElementException;

public class LLQueue<E> {
	
	LLNode<E> head;
	LLNode<E> tail;
	int size;
	
	public LLQueue(){
		head = new LLNode<E>();
		tail = new LLNode<E>();
		head.next = tail;
		tail.prev = head;
		size = 0;
	}
	
	/**
	 * @param element element to add.
	 * @return boolean true if the element was added.
	 */
	public boolean add(E element){
		LLNode<E> newOb = new LLNode<E>(element);
		LLNode<E> prevNode = tail.prev;
		
		newOb.next = tail;
		newOb.prev = prevNode;
		prevNode.next = newOb;
		tail.prev = newOb;
		size++;
		
		return true;
		
	}
	
	/** Removes the head of the queue and return the value.
	 * @return E data of the removed node.
	 * @throws NoSuchElementException if the size is 0.
	 */
	public E remove(){
		
		if(size == 0){
			throw new NoSuchElementException("size of the queue is 0");
		}
		else{
			LLNode<E> node = head.next;
			LLNode<E> nextNode = node.next;
			E data = node.data;
			
			nextNode.prev = head;
			head.next = nextNode;
			node.next = null;
			node.prev = null;
			
			return data;
		}
	}
	
	/** Retrieves and remove the head of the queue.
	 * @return null if the queue is empty else return the data.
	 */
	public E poll(){
		if(size == 0){
			return null;
		}
		else{
			LLNode<E> node = head.next;
			LLNode<E> nextNode = node.next;
			E data = node.data;
			
			nextNode.prev = head;
			head.next = nextNode;
			node.next = null;
			node.prev = null;
			
			return data;
		}
	}
	
	/** Retrieves but does not remove the head of the queue.
	 * @return head of the queue.
	 * @throws NoSuchElementException if the queue is empty.
	 */
	public E element(){
		if(size == 0){
			throw new NoSuchElementException("the queue is empty");
		}
		else {
			LLNode<E> nodeHead = head.next;
			E data  = nodeHead.data;
			return data;
		}
	}
	
	/** Retrieves but does not remove the head of the queue.
	 * @return null if queue is empty else return the head.
	 */
	public E peek(){
		if(size == 0){
			return null;
		}
		else{
			LLNode<E> nodeHead = head.next;
			E data  = nodeHead.data;
			return data;
		}
	}
	
}

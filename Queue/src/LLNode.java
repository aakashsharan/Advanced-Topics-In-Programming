
public class LLNode<E> {

	LLNode<E> next;
	LLNode<E> prev;
	E data;
	
	/**Empty constructor, initializing the nodes to null.
	 * 
	 */
	public LLNode(){
		this.next = null;
		this.prev = null;
	}
	
	/**
	 * @param e the data for the node.
	 */
	public LLNode(E e){
		this.next = null;
		this.prev = null;
		this.data = e;
	}
	
}

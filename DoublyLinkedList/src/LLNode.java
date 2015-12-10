
public class LLNode<E> {

	LLNode<E> next;
	LLNode<E> prev;
	E data;
	
	// constructor to create an empty node.
	public LLNode(){
		this.next = null;
		this.prev = null;
	}
	
	// constructor with a data.
	
	public LLNode(E e){
		this.next = null;
		this.prev = null;
		this.data = e;
	}
}

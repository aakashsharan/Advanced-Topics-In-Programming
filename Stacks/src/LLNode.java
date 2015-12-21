
public class LLNode<E> {

	LLNode<E> next;
	LLNode<E> prev;
	E data;
	
	public LLNode(){
		this.next = null;
		this.prev = null;
	}
	
	public LLNode(E element){
		this.next = null;
		this.prev = null;
		this.data = element;
	}
}

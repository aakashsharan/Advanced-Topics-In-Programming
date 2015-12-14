import java.util.AbstractList;

public class DLinkedList<E> extends AbstractList<E> {

	LLNode<E> head;
	LLNode<E> tail;
	int size;
	
	
	// empty linked list, head and tail pointing to each other.
	public DLinkedList(){
		head = new LLNode<E>();
		tail = new LLNode<E>();
		head.next = tail;
		tail.prev = head;
		size=0;
	}
	
	
	public E get(int index) {
		
		LLNode<E> currentNode = head;
		if(index<0 || index>=size){
			throw new IndexOutOfBoundsException("check index");
		}
		if(index == 0){
			return currentNode.next.data;
		}
		else{
			E data = null;
			currentNode = currentNode.next.next;
			for(int i=1; i<size; i++){
				if(i == index){
					data = currentNode.data;
				}
				currentNode = currentNode.next;
			}
			return data;
		}
		
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public boolean add(E element){
		
		LLNode<E> llNode = new LLNode<E>(element);
		LLNode<E> node1 = tail.prev;
		
		llNode.next = tail;
		llNode.prev = node1;
		
		node1.next = llNode;
		tail.prev = llNode;
		size++;
		
		return true;
		
	}

}

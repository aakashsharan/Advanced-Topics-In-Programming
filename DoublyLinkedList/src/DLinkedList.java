import java.util.AbstractList;

public class DLinkedList<E> extends AbstractList<E> {

	LLNode<E> head;
	LLNode<E> tail;
	int size;
	
	
	/**
	 * 
	 */
	public DLinkedList(){
		head = new LLNode<E>();
		tail = new LLNode<E>();
		head.next = tail;
		tail.prev = head;
		size=0;
	}
	
	/** Get the element at the position index.
	 * @param index the index position from where to retrieve the element.
	 * @throws IndexOutOfBoundsException if the index if outside the bounds of the list.
	 * @return data of the specified index.
	 */
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

	/** Return the size of the list.
	 * @return size of the list.
	 */
	@Override
	public int size() {
		return size;
	}
	
	/**
	 * @param element The element to be added.
	 * @return a boolean, true if added else false.
	 */
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
	
	/** Add an element to the list at the specified index
	 * @param index The index where element needs to be added.
	 * @param element The element to add.
	 * @throws NullPointerException if the element is null.
	 * @throws IndexOutOfBoundsException if the index if outside the bounds of the list.
	 */
	public void add(int index, E element){
		
		LLNode<E> currentNode = head;
		LLNode<E> node1 = null;
		LLNode<E> node2 = null;
		LLNode<E> addNode = new LLNode<E>(element);
		
		if(element == null){
			throw new NullPointerException("element cannot be nul");
		}
		if(index<0 || index<size){
			throw new IndexOutOfBoundsException("check index");
		}
		if(size == 0){
			
			addNode.next = tail;
			addNode.prev = head;
			head.next = addNode;
			tail.prev = addNode;
			size++;
		}
		else{
			currentNode = currentNode.next.next;
			for(int i=0; i<size; i++){
				if(i == index){
					node1 = currentNode;
					node2 = currentNode.prev;
				}
				currentNode = currentNode.next;
			}
			
			addNode.next = node1;
			addNode.prev = node2;
			node2.next = addNode;
			node1.prev = addNode;
			size++;
		}
	}
	
 
	/** Removes a node at the specified index and return its data element
	 * @param index The index of the element to remove.
	 * @return The data element removed
	 * @throws IndexOutOfBoundsException if index is outside the bounds of the list.
	 */
	public E remove(int index){
		
		LLNode<E> currentNode = head;
		LLNode<E> node1 = null;
		LLNode<E> node2 = null;
		E data = null;
		
		if(index<0 || index>=size){
			throw new IndexOutOfBoundsException("check index");
		}
		else{
			currentNode = currentNode.next;
			for(int i=0; i<size; i++){
				if(i == index){
					node1 = currentNode;
					node2 = currentNode.next;
					data = node1.data;
				}
				currentNode = currentNode.next;
			}
			
			LLNode<E> watchNode = node1.prev;
			watchNode.next = node2;
			node2.prev = watchNode;
			size--;
		}
		return data;
	}
	
	/** Set an index position in the list to the new element.
	 * @param index The index of the element to change.
	 * @param element The new element to be added.
	 * @throws IndexOutOfBoundsException if the index os outside the bounds of the list.
	 * @throws NullPointerException if the element is null
	 * @return The element that was replaced.
	 */
	public E set(int index, E element){
		
		LLNode<E> currentNode = head;
		E data = null;
		E tmp = null;
		
		if(index<0 || index>=size){
			throw new IndexOutOfBoundsException("check index");
		}
		if(element == null){
			throw new NullPointerException("element cannot be null");
		}
		else{
			currentNode = currentNode.next;
			for(int i=0; i<size; i++){
				if(i == index){
					data = currentNode.data;
					tmp = data;
					data = element;
				}
				currentNode = currentNode.next;
			}
			return tmp;
		}
	}

}

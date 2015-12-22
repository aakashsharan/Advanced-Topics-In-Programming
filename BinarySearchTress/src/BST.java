import java.util.DuplicateFormatFlagsException;

/**
 * @author Aakash
 *
 */
public class BST {

	private TreeNode root;
	
	public BST(){
		root = null;
	}
	
	/** Inserts the key if empty
	 * @param key - new value to be inserted
	 * @throws DuplicateException
	 */
	public void insert(Comparable key) throws DuplicateException{
		if(root == null){
			root = new TreeNode(key,null,null);
		}
		else{
			insert(root,key);
		}
	}
	
	/** Recursive method to do insertion
	 * @param T - start node of the tree.
	 * @param k - value to be inserted.
	 * @throws DuplicateException - if the key to be inserted already exists.
	 */
	private void insert(TreeNode T, Comparable k) throws DuplicateException{
		if(T.getKey().equals(k)){
			throw new DuplicateException("value already exists");
		}
		if(k.compareTo(T.getKey()) < 0){
			if(T.getLeft() == null){
				T.setLeft(new TreeNode(k,null,null));
			}
			else{
				insert(T.getLeft(),k);
			}
		}
		
		else{
			if(T.getRight() == null){
				T.setRight(new TreeNode(k,null,null));
			}
			else{
				insert(T.getRight(),k);
			}
		}
	}
	
	
	/**
	 * @param key
	 * @return
	 */
	public boolean lookUp(Comparable key){
		return lookUp(root,key);
	}
	
	/** Recursive method to find if the key exists.
	 * @param T - node to start from.
	 * @param k - key to find.
	 * @return true if the key exists else false
	 */
	private boolean lookUp(TreeNode T, Comparable k){
		if(T == null){
			return false;
		}
		if(T.getKey().equals(k)){
			return true;
		}
		if(k.compareTo(T.getKey())< 0){
			return lookUp(T.getLeft(),k);
		}
		else{
			return lookUp(T.getRight(),k);
		}
	}
	
	
}

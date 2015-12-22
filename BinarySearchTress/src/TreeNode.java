
public class TreeNode {

	private Comparable key;
	private Object data;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(Comparable k, Object d, TreeNode l, TreeNode r){
		key = k;
		data = d;
		left = l;
		right = r;
	}
	
	public TreeNode(Comparable k, TreeNode l, TreeNode r){
		key = k;
		left = l;
		right = r;
	}
	
	
	public Comparable getKey() {
		return key;
	}

	public void setKey(Comparable key) {
		this.key = key;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	
	
	
}

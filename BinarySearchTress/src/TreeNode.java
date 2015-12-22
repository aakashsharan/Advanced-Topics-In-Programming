
public class TreeNode {

	private Comparable key;
	private Object data;
	private TreeNode left;
	private TreeNode right;
	
	private TreeNode(Comparable k, Object d, TreeNode l, TreeNode r){
		key = k;
		data = d;
		left = l;
		right = r;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
}

package linkedInLearningJavaAlgorithms;

public class BST {
	public TreeNode root;
	
	public void insert(int data) {
		this.root = insert(root,data);
	}
	
	public TreeNode insert(TreeNode root, int data) {
		if(root==null) {
			root = new TreeNode(data);
		}
		else if(root.data > data) {
			root.left = insert(root.left,data);
		}
		else if(root.data < data ) {
			root.right = insert(root.right,data);
		}
		return root;
	}
	
}

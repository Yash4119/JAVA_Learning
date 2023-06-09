package linkedInLearningJavaAlgorithms;

public class SearchInBST {

	public static Boolean searchInBST(TreeNode root, int data) {
		if(root == null) {
			return false;
		}
		if(root.data == data) {
			return true;
		}
		if(root.data > data) {
			return searchInBST(root.left,data);
		}
		
		return searchInBST(root.right,data);
	}
	
	public static void inorder(TreeNode root) {
		if(root != null) {
			inorder(root.left);
			System.out.println(root.data + " ");
			inorder(root.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst = new BST();
		
		bst.insert(5);
		bst.insert(3);
		bst.insert(6);
		bst.insert(1);
		bst.insert(8);
		
		inorder(bst.root);
		System.out.println(searchInBST(bst.root,5));
		System.out.println(searchInBST(bst.root,8));
		System.out.println(searchInBST(bst.root,10));
	}

}

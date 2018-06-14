package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class findNodeBinaryTree {
	class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;
	    
	    TreeNode() {
	    }

	    TreeNode(int data) {
	        this.data = data;
	    }

	    TreeNode(int data, TreeNode left, TreeNode right) {
	        this.data = data;
	        this.left = left;
	        this.right = right;
	    }
	}

	public static findNodeBinaryTree deleteTail;

	public static void main(String[] args) {
		// Need to fix Null Pointer exception here
		TreeNode inputHead = deleteTail.new TreeNode(1);

		TreeNode resultHead = findTreeNode(inputHead, 2);
		System.out.println("The result after deletion at the Tail = " + resultHead.data);
	}

	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.

	// Working solution copied from Firecode.io
	public static TreeNode findTreeNode(TreeNode root, int val) {
		if (root==null) 
			return null;
		
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		q.add(root);
		TreeNode curr=null;
		while(!q.isEmpty()) {
			curr=q.remove();
			if(curr.data==val)
				break;
			
			if(curr.left!=null)
				q.add(curr.left);
			
			if(curr.right!=null)
				q.add(curr.right);
		}
		if (curr.data==val)
			return curr;
		else 
			return null;
	}
}

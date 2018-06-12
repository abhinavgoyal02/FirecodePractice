package BinaryTree;

public class heightofBinaryTree {
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

	public static heightofBinaryTree heightBinaryTree;

	public static void main(String[] args) {
		// Need to fix Null Pointer exception here
		TreeNode inputHead = heightBinaryTree.new TreeNode(1);

		int height = treeHeight(inputHead);
		System.out.println("The result after deletion at the Tail = " + height);
	}

	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.

	// Solved on my own
	public static int treeHeight(TreeNode root) {
		if (root == null)
			return 1;

		else {
			TreeNode curr = root;
			int height = 0;
			while (curr != null) {
				curr = curr.left;
				height++;
			}
			return height;
		}
	}
	
}

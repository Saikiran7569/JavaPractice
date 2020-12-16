package DS;

class NodeTree {
	int data;
	NodeTree left;
	NodeTree right;
}

class TreeDSTest {

	public NodeTree insert(NodeTree root, int i) {

		if (root == null) {

			return creteNewNode(i);
		}
		if(i < root.data) {
			root.left = insert(root.left,i);
		}if(i > root.data) {
			root.right = insert(root.right,i);
		}

		return root;
	}

	private NodeTree creteNewNode(int i) {
		NodeTree root = new NodeTree();
		root.data = i;
		root.left = null;
		root.right = null;
		return root;
	}

	public void inorder(NodeTree root) {
	
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.err.println(root.data);
		inorder(root.right);
	}

}

public class Tree {

	public static void main(String[] args) {
		NodeTree root = null;
		TreeDSTest tree = new TreeDSTest();
		root = tree.insert(root, 100);
		root = tree.insert(root, 102);
		root = tree.insert(root, 101);
		root = tree.insert(root, 80);
		root = tree.insert(root, 90);
		root = tree.insert(root, 50);
		root = tree.insert(root, 65);
		root = tree.insert(root, 1);
		
		tree.inorder(root);
	}

}

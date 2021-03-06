/**
 * This class represents a binary search tree
 * 
 * @author MWilson164
 * @version 1.0.0
 */
public class BinarySearchTree {
	/** Keeps track of the root of the tree. */
	private BinaryNode root;
	
	/**
	 * Default constructor for the tree.
	 */
	public BinarySearchTree() {}
	
	/**
	 * Adds a node to the tree.
	 * 
	 * @param newData The node to add to the tree
	 */
	public void add(final int newData) {
		if(root == null) {
			root = new BinaryNode(newData);
		} else {
			BinaryNode temp = root;
			while(temp != null) {
				// determine which way to go 
				if(newData > temp.getData()) {
					// go right but check to see if we can
					BinaryNode right = temp.getRight();
					if(right == null) {
						temp.setRight(new BinaryNode(newData));
						break;
					} else {
						temp = right;
					}
				} else {
					BinaryNode left = temp.getLeft();
					
					// We are done at this point
					if(left == null) {
						temp.setLeft(new BinaryNode(newData));
						break;
					} else {
						temp = left;
					}
				}
			}
		}
	}
	
	
	///////////////
	/// GETTERS ///
	///////////////
	/**
	 * Method that grabs the root of the tree.
	 * 
	 * @return The root of the tree.
	 */
	public BinaryNode getRoot() {
		return root;
	}
	
	///////////////
	/// SETTERS ///
	///////////////
	/**
	 * Sets the root of the tree.
	 * 
	 * @param newRoot The new root to be set in the tree.
	 */
	public void setRoot(final BinaryNode newRoot) {
		root = newRoot;
	}

}

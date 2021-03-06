/**
 * This class represents a simple node
 * 
 * @author MWilson164
 * @version 1.0.0
 */
public class BinaryNode {
	/** Keeps track of the current information in this node. */
	private int information;
	
	/** Keeps track of the current left child of this node. */
	private BinaryNode left;
	
	/** Keeps track of the current right child of this node. */
	private BinaryNode right;
	
	/** Keeps track of the right sibling/cousin of this node. */
	private BinaryNode rightRelative;
	
	/**
	 * Default constructor for a binary node.
	 * 
	 * @param data The information to store in this node.
	 */
	public BinaryNode(final int data) {
		this(data, null, null, null);
	}
	
	/**
	 * Overloaded constructor for a binary node.
	 * 
	 * @param data The information to store in this node.
	 * @param leftChild The left child of this node.
	 * @param rightChild The right child of this node.
	 * @param relative The relative with relation to this node.
	 */
	public BinaryNode(final int data, final BinaryNode leftChild, 
					final BinaryNode rightChild, final BinaryNode relative) {
		information = data;
		left = leftChild;
		right = rightChild;
		rightRelative = relative;
	}
	
	///////////////
	/// GETTERS ///
	///////////////
	/**
	 * Gets the current information on the node.
	 * 
	 * @return The stored information of this node.
	 */
	public int getData() {
		return information;
	}
	
	/**
	 * Gets the left child of this node.
	 * 
	 * @return The left child of this node.
	 */
	public BinaryNode getLeft() {
		return left;
	}
	
	/**
	 * Gets the right child of this node.
	 * 
	 * @return The right child of this node.
	 */
	public BinaryNode getRight() {
		return right;
	}
	
	/**
	 * Gets the right relative of this node.
	 * 
	 * @return The right relative of this node.
	 */
	public BinaryNode getRightRelative() {
		return rightRelative;
	}
	
	///////////////
	/// SETTERS ///
	///////////////
	/**
	 * Sets the value of this node.
	 * 
	 * @param data The data to store in the node.
	 */
	public void setData(final int data) {
		information = data;
	}
	
	/**
	 * Sets the left child of this node.
	 * 
	 * @param leftChild The node to add to the left of this node.
	 */
	public void setLeft(final BinaryNode leftChild) {
		left = leftChild;
	}
	
	/**
	 * Sets the right child of this node.
	 * 
	 * @param rightChild The node to add to the right of this node.
	 */
	public void setRight(final BinaryNode rightChild) {
		right = rightChild;
	}
	
	/**
	 * Sets the right relative of the current node.
	 * 
	 * @param relative The node to add to the right level of this node.
	 */
	public void setRightRelative(final BinaryNode relative) {
		rightRelative = relative;
	}
	
	/** 
	 * Returns a string representation of this node.
	 * 
	 * @return String representation of the current node.
	 */
	public String toString() {
		return "| " + information + " |";
	}
}

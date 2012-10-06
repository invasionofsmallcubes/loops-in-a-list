package com.linkcreativi.dierre.loops.model;

/**
 * A singly linked list is made of nodes where each node has a pointer to the
 * next node (or null to end the list)
 * 
 * @author dierre
 * 
 */

public class NodeElement {

	private int value;
	private NodeElement next;
	private boolean visited;

	/**
	 * Gets the value.
	 * 
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 * 
	 * @param value
	 *            the new value
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * Gets the next.
	 * 
	 * @return the next
	 */
	public NodeElement getNext() {
		return next;
	}

	/**
	 * Sets the next.
	 * 
	 * @param next
	 *            the new next
	 */
	public void setNext(NodeElement next) {
		this.next = next;
	}
	
	/**
	 * Checks if is visited.
	 *
	 * @return true, if is visited
	 */
	public boolean isVisited() {
		return visited;
	}
	
	/**
	 * Sets the visited.
	 *
	 * @param visited the new visited
	 */
	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NodeElement other = (NodeElement) obj;
		if (value != other.value)
			return false;
		return true;
	}
	
	

}

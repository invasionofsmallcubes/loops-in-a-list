package com.linkcreativi.dierre.loops.model;

/**
 * this is the element class organized as an head-tail concept
 * @author dierre
 *
 */

public class NodeElement {

	private int value;
	private NodeElement next;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public NodeElement getNext() {
		return next;
	}
	
	public void setNext(NodeElement next) {
		this.next = next;
	}
	
	
}

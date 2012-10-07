package com.linkcreativi.dierre.loops.algo;

import java.util.LinkedList;
import java.util.List;

import com.linkcreativi.dierre.loops.model.NodeElement;

/**
 * The Class BadWay. DO NOT use these methods
 */
public class BadWay {

	public static boolean findLoopKeepingVisitedNode(NodeElement node) {

		if (node == null)
			return false;

		List<NodeElement> visitedNodes = new LinkedList<NodeElement>();

		NodeElement currentNode = node;
		visitedNodes.add(currentNode);

		while ((currentNode = currentNode.getNext()) != null) {
			if (visitedNodes.contains(currentNode))
				return true;
			visitedNodes.add(currentNode);
		}

		return false;
	}

	public static boolean findLoopSettingVisitedNode(NodeElement node) {

		if (node == null)
			return false;

		NodeElement currentNode = node;
		currentNode.setVisited(true);

		while ((currentNode = currentNode.getNext()) != null) {
			if (currentNode.isVisited())
				return true;
			currentNode.setVisited(true);
		}

		return false;
	}

	public static boolean findLoopReverseList(NodeElement node) {

		if (node == null)
			return false;

		if (node.getNext() == null)
			return false;

		NodeElement previousNode = null;
		NodeElement currentNode = null;
		NodeElement nextNode = null;

		currentNode = node;
		
		while(currentNode != null) {
			nextNode = currentNode.getNext();
			currentNode.setNext(previousNode);
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return ( previousNode.equals(node));
	}

}

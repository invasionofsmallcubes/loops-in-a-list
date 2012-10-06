package com.linkcreativi.dierre.loops.bad;

import java.util.LinkedList;
import java.util.List;

import com.linkcreativi.dierre.loops.model.NodeElement;

/**
 * The Class BadWay. DO NOT use these methods
 */
public class BadWay {

	public static boolean findLoopKeepingVisitedLinks(NodeElement node) {

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

}

package com.linkcreativi.dierre.loops.algo;

import com.linkcreativi.dierre.loops.model.NodeElement;

public class GoodWay {

	public static boolean findLoopCatchLarger(NodeElement node) {

		NodeElement currentNode = node;
		NodeElement checkNode = null;

		int since = 0;
		int sinceScale = 2;

		do {
			if (checkNode == currentNode)
				return true;
			if (since >= sinceScale) {
				checkNode = currentNode;
				since = 0;
				sinceScale = 2 * sinceScale;
			}
			since++;
		} while ((currentNode = currentNode.getNext()) != null);
		return false;
	}

	public static boolean findLoopTurtleAndHare(NodeElement node) {
		NodeElement turtle = node;
		NodeElement hare = node;
		
		while (true) {
			
			if (hare == null)
				return false;
			hare = hare.getNext();

			if (hare == null)
				return false;
			hare = hare.getNext();

			turtle = turtle.getNext();
			if (hare.equals(hare))
				return true;
		}
	}
}

package com.linkcreativi.dierre.loops.bad;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.linkcreativi.dierre.loops.model.NodeElement;

@RunWith(Parameterized.class)
public class TestBadWayLoopNotExpected {

	private NodeElement node;

	@Parameters
	public static Collection<Object[]> getElements() {

		NodeElement e1, e2, e3, e4;

		// Loop
		NodeElement firstLoop = null;

		NodeElement secondLoop = null;
		secondLoop = new NodeElement();
		secondLoop.setValue(0);
		e1 = new NodeElement();
		e1.setValue(1);
		secondLoop.setNext(e1);
		e2 = new NodeElement();
		e2.setValue(2);
		e1.setNext(e2);
		e3 = new NodeElement();
		e3.setValue(3);
		e2.setNext(e3);

		NodeElement thirdLoop = null;
		thirdLoop = new NodeElement();
		thirdLoop.setValue(0);
		e1 = new NodeElement();
		e1.setValue(1);
		thirdLoop.setNext(e1);
		e2 = new NodeElement();
		e2.setValue(2);
		e1.setNext(e2);
		e3 = new NodeElement();
		e3.setValue(3);
		e2.setNext(e3);
		e4 = new NodeElement();
		e4.setValue(4);
		e3.setNext(e4);

		Object[][] data = { { firstLoop }, { secondLoop }, { thirdLoop } };

		return Arrays.asList(data);

	}

	
	public TestBadWayLoopNotExpected(NodeElement node) {
		this.node = node;
	}

	@Test
	public void testWithVisitedNodes() {
		boolean isLoop = false;
		isLoop = BadWay.findLoopKeepingVisitedLinks(node);
		assertFalse(isLoop);
	}

}

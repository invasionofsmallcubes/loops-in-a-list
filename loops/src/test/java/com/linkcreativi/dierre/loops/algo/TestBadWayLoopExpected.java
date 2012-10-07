package com.linkcreativi.dierre.loops.algo;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.linkcreativi.dierre.loops.algo.BadWay;
import com.linkcreativi.dierre.loops.model.NodeElement;

@RunWith(Parameterized.class)
public class TestBadWayLoopExpected {

	NodeElement node;

	@Parameters
	public static Collection<Object[]> getElements() {
		return DataProvider.getElementsForExpectedLoop();
	}

	public TestBadWayLoopExpected(NodeElement node) {
		this.node = node;
	}

	@Test
	public void testWithKeepingVisitedNodes() {
		boolean isLoop = false;
		isLoop = BadWay.findLoopKeepingVisitedNode(node);
		assertTrue(isLoop);
	}

	@Test
	public void testWithVisitedNodes() {
		boolean isLoop = false;
		isLoop = BadWay.findLoopSettingVisitedNode(node);
		assertTrue(isLoop);
	}

	@Test
	public void testWithReverseList() {
		boolean isLoop = false;
		isLoop = BadWay.findLoopReverseList(node);
		assertTrue(isLoop);
	}

}

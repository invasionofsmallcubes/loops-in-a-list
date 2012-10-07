package com.linkcreativi.dierre.loops.algo;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.linkcreativi.dierre.loops.model.NodeElement;

@RunWith(Parameterized.class)
public class TestGoodWayLoopNotExpected {

	private NodeElement node;

	public TestGoodWayLoopNotExpected(NodeElement node) {
		this.node = node;
	}

	@Parameters
	public static Collection<Object[]> getElements() {
		return DataProvider.getElementsForNotExpectedLoop();
	}

	@Test
	public void testFindLoopCatchLarger() {
		boolean isLoop = false;
		isLoop = GoodWay.findLoopCatchLarger(node);
		assertFalse(isLoop);
	}

	@Test
	public void testFindLoopTurtleAndHare() {
		boolean isLoop = false;
		isLoop = GoodWay.findLoopTurtleAndHare(node);
		assertFalse(isLoop);
	}

}

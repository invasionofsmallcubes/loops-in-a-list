package com.linkcreativi.dierre.loops.algo;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.linkcreativi.dierre.loops.model.NodeElement;

@RunWith(Parameterized.class)
public class TestGoodWayLoopExpected {

	private NodeElement node;

	@Parameters
	public static Collection<Object[]> getElements() {
		return DataProvider.getElementsForExpectedLoop();
	}
	
	@Test
	public void testFindLoopCatchLarger() {
		boolean isLoop = false;
		isLoop = GoodWay.findLoopCatchLarger(node);
		assertTrue(isLoop);
	}
	
	@Test
	public void testFindLoopTurtleAndHare() {
		boolean isLoop = false;
		isLoop = GoodWay.findLoopTurtleAndHare(node);
		assertTrue(isLoop);
	}

}

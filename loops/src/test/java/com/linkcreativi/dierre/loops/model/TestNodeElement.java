package com.linkcreativi.dierre.loops.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestNodeElement {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreation() {
		NodeElement element = new NodeElement();
		element.setValue(1);
		assertNotNull(element);
	}

	@Test
	public void testReading() {

		int expectedSum = 10;
		int counter = 0;

		NodeElement currentNode = null;

		NodeElement firstElement = new NodeElement();
		NodeElement secondElement = new NodeElement();
		NodeElement thirdElement = new NodeElement();
		NodeElement fourthElement = new NodeElement();

		firstElement.setValue(1);
		secondElement.setValue(2);
		thirdElement.setValue(3);
		fourthElement.setValue(4);
		firstElement.setNext(secondElement);
		secondElement.setNext(thirdElement);
		thirdElement.setNext(fourthElement);

		currentNode = firstElement;
		
		do {
			counter += currentNode.getValue();
		} while ((currentNode = currentNode.getNext()) != null);
		
		assertEquals(expectedSum, counter);

	}

}

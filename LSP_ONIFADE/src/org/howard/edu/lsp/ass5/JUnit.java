package org.howard.edu.lsp.ass5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnit {
	private List<Integer> set1 = new ArrayList<Integer>();
	private List<Integer> set2 = new ArrayList<Integer>();

	@Test
	/**
	 * use AssertEquals to test the clear method.
	 */
	public void testClear() {
		set1.clear();
		assertEquals(set1.length(), 0);
		set2.clear();
		assertEquals(set2.length(), 0);
	}
	/**
	 * use AssertEquals to test the Length method
	 */
	public void testLength() {
		assertEquals(set1.length(), 5);
		set2.clear();
		assertEquals(set1.length(), 0);
		set1.remove(1);
		set1.add(3);
		
	}
	/**
	 * use AssertTrue and AssertFalse to see if 2 ArrayLists have the same elements
	 */
	public void testEquals() {
		assertTrue(set1, set2);
		assertFalse(set1, set2);
		
	}
	
	public void testContains() {
		
	}
	
	public void testLargest() {
		
	}
	
	public void testSmallest() {
		
	}
	
	public void testAdd() {
		
	}
	
	public void testRemove() {
		
	}
	
	public void testUnion() {
		
	}
	
	public void testIntersect() {
		
	}
	
	public void testDiff() {
		
	}
	 

}

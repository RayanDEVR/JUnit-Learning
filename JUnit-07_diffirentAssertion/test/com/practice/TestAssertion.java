package com.practice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestAssertion {
	Assertion test = new Assertion();
	
	@Test
	void test1() {					//pass when expected == actual
		assertEquals(25, test.computeSquareArea(5));
	}

	@Test
	void test2() {					//pass when expected != actual
		assertNotEquals(23, test.computeSquareArea(5));
	}
	
	@Test
	void test3() {					//pass when condition is true
		assertTrue(test.computeSquareArea(5) == 25);
	}
	
	@Test
	void test4() {					//pass when condition is false
		assertFalse(test.computeSquareArea(5) == 23);
	}
	
	@Test
	void test5() {					//pass when both expected and actual arrays' data, size, type, values are same
		int[] expected = {2,3,4,5};
		int[] actual = {4,3,2,5};
	//	assertArrayEquals(expected, actual);	//this test fail
		
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);	//this test pass
	}
	
	@Test
	void test6() {					//pass when exception is created
		int[] unsortingArray = {2,5,4,7};
		
		assertThrows(NullPointerException.class, () -> test.sortingArray(unsortingArray));
	}
	
	
}

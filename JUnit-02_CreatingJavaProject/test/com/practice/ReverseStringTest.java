package com.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		ReverseString rs = new ReverseString();
		String actual = rs.reverseString("Java");
		String expected = "avaJ";
		
		assertEquals(expected, actual);
	}

}

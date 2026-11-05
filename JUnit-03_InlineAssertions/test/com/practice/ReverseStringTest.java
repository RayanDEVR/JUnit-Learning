package com.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {
	
	ReverseString reverse = new ReverseString();

	@Test
	public void test1() {
		String actual = reverse.reverseString("Java");
		String expected = "avaJ";
		
		assertEquals(expected, actual);
		
		}
	
											//both are same
	@Test
	public void test2() {		
		assertEquals("Alien", reverse.reverseString("neilA"));
		
		}

}

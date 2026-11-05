package com.practice;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {
	
	ReverseString reverse = new ReverseString();

	@Test
	public void testReverseString_OneWord() {		
		assertEquals("Alien", reverse.reverseString("neilA"));
		
		}
	
	@Test
	public void testReverseString_MultipleWords() {		
		assertEquals("doog si avaJ", reverse.reverseString("Java is good"));
		
		}

}

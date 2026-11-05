package com.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		Calc c = new Calc();
		assertEquals(2, c.divite(20, 10));
	}

}

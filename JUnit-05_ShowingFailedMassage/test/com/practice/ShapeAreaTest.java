package com.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapeAreaTest {

	ShapeArea shape = new ShapeArea();

	@Test
	void testComputeSquareArea() {		
		assertEquals(25, shape.computeSquareArea(5));
	}
	
	@Test					//actual value is 78.5, so failed massage "Area of circle calculation is wrong." will be showed.
	void testComputeCircleArea() {
		assertEquals(781.5, shape.computeCircleArea(5), "Area of circle calculation is wrong.");
	}
}

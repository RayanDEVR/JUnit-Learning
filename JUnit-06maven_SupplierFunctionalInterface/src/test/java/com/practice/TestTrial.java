package com.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrial {
	
	ShapeArea area = new ShapeArea();
	
	@Test
	void testComputeSquareArea() {
		assertEquals(25, area.computeSquareArea(5));
	}

	@Test							//always generate the failed massage
	void testComputeCircleArea() {
		assertEquals(79.5, area.computeCircleArea(5), "Area of circle calclation is wrong");
	}
	
	@Test							//generate the failed massage only when the test failed
	void testComputeCircleArea_Supplier() {
		assertEquals(76.5, area.computeCircleArea(5), () -> "Area of circle calclation is wrong");
	}
}

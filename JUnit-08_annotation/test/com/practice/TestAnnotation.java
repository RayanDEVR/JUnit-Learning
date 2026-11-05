package com.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestAnnotation {
	Annotation shape = new Annotation();
	
	@BeforeAll				//runs one time before all tests
	static void beforeAll() {
		System.out.println("Before all tests");
	}
	
	@AfterAll				//runs one time after all tests
	static void afterAll() {
		System.out.println("After all tests");
	}
	
	@BeforeEach				//runs before every test
	void init() {
		System.out.println("Before test");
	}
	
	@Test
	void testComputeSquareArea() {
		assertEquals(25, shape.computeSquareArea(5));
		System.out.println("Actual test running");
	}
	
	@Test
	void testComputeCircleArea() {
		assertEquals(78.5, shape.computeCircleArea(5));
		System.out.println("Actual test running");
	}
	
	@AfterEach				//runs after every test
	void distroy() {
		System.out.println("After test");
	}
}

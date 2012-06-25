package codeeval.easy.fibonacci;

import static org.junit.Assert.*;

import org.junit.Test;

public class fibonacciTest {

	@Test
	public void test() {
		assertEquals(5, fibonacci.getNthFibonacciNumber(5));
		assertEquals(144, fibonacci.getNthFibonacciNumber(12));
	}

}

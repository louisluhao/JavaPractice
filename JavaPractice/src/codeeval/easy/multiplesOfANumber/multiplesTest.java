package codeeval.easy.multiplesOfANumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class multiplesTest {

	@Test
	public void test() {
		assertEquals(16,multiples.findSmallestMultiple(13, 8));
		assertEquals(32, multiples.findSmallestMultiple(17, 16));
	}

}

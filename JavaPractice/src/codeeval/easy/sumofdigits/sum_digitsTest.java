package codeeval.easy.sumofdigits;

import static org.junit.Assert.*;

import org.junit.Test;

public class sum_digitsTest {

	@Test
	public void test() {
		assertEquals(5, sum_digits.getSumOfDigits(23));
		assertEquals(19, sum_digits.getSumOfDigits(496));
	}

}

package codeeval.easy.bitPositions;

import static org.junit.Assert.*;
import static codeeval.easy.bitPositions.position.*;

import org.junit.Test;

public class positionTest {

	
	@Test
	public void testGetBitAtPosition(){
		assertEquals(0,getBitAtPosition(2, 1));
		assertEquals(1,getBitAtPosition(2, 2));
	}
	
	@Test
	public void testIsSameBitPosition() {
		assertEquals(true, isSameBitPosition(86, 2, 3));
		assertEquals(false, isSameBitPosition(125, 1, 2));
	}

}

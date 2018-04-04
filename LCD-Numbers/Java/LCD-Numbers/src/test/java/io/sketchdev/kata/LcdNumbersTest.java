package io.sketchdev.kata;

import static org.junit.Assert.*;

import org.junit.*;

public class LcdNumbersTest {
	private LcdNumbers system;

	@Before
	public void setup() {
		system = new LcdNumbers();
	}
	
	@Test
	public void testOne() {
        String translatedOne = system.translate(1);

        String expectedOne = "   \n  |\n  |";

        assertEquals(expectedOne, translatedOne);
	}
}

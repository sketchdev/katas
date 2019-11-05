package io.sketchdev.kata;

import static org.junit.Assert.*;

import org.junit.*;

public class SegmentNumbersTest {
	private SegmentNumbers system;

	@Before
	public void setup() {
		system = new SegmentNumbers();
	}
	
	@Test
	public void testOne() {
        String translatedOne = system.translate(1);

        String[] one = {
                "   ",
                "   |",
                "   |"
            };

        String expected = String.join("\n", one);

        assertEquals(expected, translatedOne);
	}
}

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

        String[] one = {
                "   ",
                "   |",
                "   |"
            };
        testNumber(one,1);


	}
	@Test
	public void testTwo() {

		String[] two = {
				" _ ",
				" _|",
				"|_ "
		};
	testNumber(two,2);

	}
	@Test
	public void testThree() {

		String[] three = {
				" _ ",
				" _|",
				" _|"
		};

		testNumber(three,3);
	}
	@Test
	public void testFour(){
		String[] four = {
				"   ",
				"|_|",
				"  |"
		};

		testNumber(four,4);
	}
	@Test
	public void testFive(){
		String[] five = {
				" _ ",
				"|_ ",
				" _|"
		};

		testNumber(five,5);
	}
	@Test
	public void testSix(){
		String[] six = {
				"   ",
				"|_",
				"|_|"
		};

		testNumber(six,6);
	}
	@Test
	public void testSeven(){
		String[] seven = {
				" _ ",
				"  |",
				"  |"
		};

		testNumber(seven,7);
	}
	@Test
	public void testEight(){
		String[] eight = {
				" _ ",
				"|_|",
				"|_|"
		};

		testNumber(eight,8);
	}
	@Test
	public void testNine(){
		String[] nine = {
				" _ ",
				"|_|",
				" _|"
		};

		testNumber(nine,9);
	}
	@Test
	public void testZero(){
		String[] zero = {
				" _ ",
				"| |",
				"|_|"
		};

		testNumber(zero,0);
	}
	@Test
	public void testTen(){
		String[] ten = {
				"     _ ",
				"   || |",
				"   ||_|"

		};


		testNumber(ten,10);


	}
	private void testNumber(String[] num,int num1) {
		String translated = system.translate(num1);

		String expected = String.join("\n", num);

		assertEquals(expected, translated);

	}
}


package io.sketchdev.kata;

public class SegmentNumbers {

	// Each number translates to a 3x3 grid of either space, | or _, so:
    //
    // 1234567890
    //
    // translates to:
    //
    //     _ _     _    _  _  _  _
    //   | _|_||_||_ |_  ||_||_|| |
    //   ||_ _|  | _||_| ||_| _||_|

	public String translate(int number) {
		// TODO Auto-generated method stub
		switch(number) {
			case 1:
				return "   \n  |\n  |";

			case 2:
				return " _ \n _|\n|_ ";
		}

		return null;
	}

}

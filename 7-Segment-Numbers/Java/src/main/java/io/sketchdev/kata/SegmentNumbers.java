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
        String[] numValues = {
				String.join("\n", new String[]{
						" _ ",
						"| |",
						"|_|"
				}),
				String.join("\n", new String[]{
						"   ",
						"   |",
						"   |"
				}),
				String.join("\n", new String[]{
						" _ ",
						" _|",
						"|_ "
				}),
				String.join("\n", new String[]{
						" _ ",
						" _|",
						" _|"
				}),
				String.join("\n", new String[]{
						"   ",
						"|_|",
						"  |"
				}),
				String.join("\n", new String[]{
						" _ ",
						"|_ ",
						" _|"
				}),
				String.join("\n", new String[]{
						"   ",
						"|_",
						"|_|"
				}),
				String.join("\n", new String[]{
						" _ ",
						"  |",
						"  |"
				}),
				String.join("\n", new String[]{
						" _ ",
						"|_|",
						"|_|"
				}),
				String.join("\n", new String[]{
						" _ ",
						"|_|",
						" _|"
				})
		};

        return numValues[number];

    }
}

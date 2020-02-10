package io.sketchdev.katas;

import static org.assertj.core.api.Assertions.*;

import net.jqwik.api.*;
import net.jqwik.api.constraints.AlphaChars;
import net.jqwik.api.constraints.NumericChars;
import net.jqwik.api.constraints.Whitespace;
import org.assertj.core.data.*;

@Disabled("Here for example purposes only")
class ExampleBasedTests {
	
	@Example
	void squareRootOf16is4() { 
		assertThat(Math.sqrt(16)).isCloseTo(4.0, Offset.offset(0.01));
	}

	@Example
	boolean add1plu3is4() {
		return (1 + 3) == 4;
	}

    @Property(tries = 50)
	void aProperty(@ForAll @AlphaChars @NumericChars @Whitespace String aString) {
		System.out.println("a Property: " + aString);
	}

//    @Property
//    boolean stringShouldBeShrunkToAAA(@ForAll @AlphaChars String aString) {
//        return aString.length() > 15 || aString.length() < 3;
//    }

    // Fails for min integer value
    //@Property
	//boolean absoluteValueOfAllNumbersIsPositive(@ForAll int anInteger) {
	//	return Math.abs(anInteger) >= 0;
	//}

}

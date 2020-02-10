package io.sketchdev.katas;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.IntRange;
import net.jqwik.api.constraints.WithNull;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CollegeApplicationReviewerPropertyTests {
    private CollegeApplicationReviewer collegeApplicationReviewer = new CollegeApplicationReviewer();

    @Property(tries = 500)
    void resultReturnedWithInRangeIntegers(@ForAll @IntRange(min = 0, max = 800) Integer satMathScore,
                                           @ForAll @IntRange(min = 0, max = 800) Integer satReadingScore,
                                           @ForAll Boolean isLegacy) {
        ReviewDecision result = collegeApplicationReviewer.doAutoReview(satMathScore, satReadingScore, isLegacy);
        assertNotNull(result);
    }

    @Property
    void rejectOverallLowScore(@ForAll @IntRange(min = 0, max = 800) Integer satMathScore,
                               @ForAll @IntRange(min = 0, max = 800) Integer satReadingScore,
                               @ForAll @WithNull Boolean isLegacy) {
        ReviewDecision result = collegeApplicationReviewer.doAutoReview(satMathScore, satReadingScore, isLegacy);
        if (satMathScore + satReadingScore < 1000) {
            assertEquals(ReviewDecision.REJECT, result);
        }
    }

    @Property
    void rejectLowMathScore(@ForAll @IntRange(min = 0, max = 800) Integer satMathScore,
                            @ForAll @IntRange(min = 0, max = 800) Integer satReadingScore,
                            @ForAll @WithNull Boolean isLegacy) {
        ReviewDecision result = collegeApplicationReviewer.doAutoReview(satMathScore, satReadingScore, isLegacy);
        if (satMathScore < 400) {
            assertEquals(ReviewDecision.REJECT, result);
        }
    }

    @Property
    void rejectLowReadingScore(@ForAll @IntRange(min = 0, max = 800) Integer satMathScore,
                               @ForAll @IntRange(min = 0, max = 800) Integer satReadingScore,
                               @ForAll @WithNull Boolean isLegacy) {
        ReviewDecision result = collegeApplicationReviewer.doAutoReview(satMathScore, satReadingScore, isLegacy);
        if (satReadingScore < 350) {
            assertEquals(ReviewDecision.REJECT, result);
        }
    }

    @Property
    void approveMath750_Reading600(@ForAll @IntRange(min = 750, max = 800) Integer satMathScore,
                                   @ForAll @IntRange(min = 600, max = 800) Integer satReadingScore,
                                   @ForAll @WithNull Boolean isLegacy) {
        ReviewDecision result = collegeApplicationReviewer.doAutoReview(satMathScore, satReadingScore, isLegacy);
        assertEquals(ReviewDecision.ACCEPT, result);
    }

    @Property
    void approveMath600_Reading780(@ForAll @IntRange(min = 600, max = 800) Integer satMathScore,
                                   @ForAll @IntRange(min = 780, max = 800) Integer satReadingScore,
                                   @ForAll @WithNull Boolean isLegacy) {
        ReviewDecision result = collegeApplicationReviewer.doAutoReview(satMathScore, satReadingScore, isLegacy);
        assertEquals(ReviewDecision.ACCEPT, result);
    }


    @Property
    void approveCombined1250AndLegacy(@ForAll @IntRange(min = 0, max = 800) Integer satMathScore,
                                      @ForAll @IntRange(min = 0, max = 800) Integer satReadingScore) {
        ReviewDecision result = collegeApplicationReviewer.doAutoReview(satMathScore, satReadingScore, true);
        int combined = satMathScore + satReadingScore;
        if (combined >= 1250) {
            assertEquals(ReviewDecision.ACCEPT, result);
        }
    }

    @Property
    void waitList1250to1349(@ForAll @IntRange(min = 0, max = 800) Integer satMathScore,
                            @ForAll @IntRange(min = 0, max = 800) Integer satReadingScore) {
        ReviewDecision result = collegeApplicationReviewer.doAutoReview(satMathScore, satReadingScore, false);
        int combined = satMathScore + satReadingScore;
        if (combined >= 1250 && combined < 1350) {
            assertEquals(ReviewDecision.WAITLIST, result);
        }
    }
}

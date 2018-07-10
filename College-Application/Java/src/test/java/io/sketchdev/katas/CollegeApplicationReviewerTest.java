package io.sketchdev.katas;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CollegeApplicationReviewerTest {

    @Test
    public void testRejectCombinedSatScoreBelow1000() {
        ReviewDecision saved = new CollegeApplicationReviewer().status(499,500);
        assertEquals(ReviewDecision.REJECT, saved);
    }

    @Test
    public void testCombinedSatScoreGTE1000() {
        ReviewDecision saved = new CollegeApplicationReviewer().status(600,400);
        assertEquals(ReviewDecision.UNDECIDED, saved);
    }

    @Test
    public void testRejectMathScoreBelow400() {
        ReviewDecision decision = new CollegeApplicationReviewer().status(399, 601);
        assertEquals(ReviewDecision.REJECT, decision);
    }

    @Test
    public void testMathScoreGTE400() {
        ReviewDecision decision = new CollegeApplicationReviewer().status(400, 600);
        assertEquals(ReviewDecision.UNDECIDED, decision);
    }

}

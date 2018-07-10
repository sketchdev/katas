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

    @Test
    public void testRejectReadingScoreBelow350() {
        ReviewDecision decision = new CollegeApplicationReviewer().status(651, 349);
        assertEquals(ReviewDecision.REJECT, decision);
    }

    @Test
    public void testReadingScoreGTE350() {
        ReviewDecision decision = new CollegeApplicationReviewer().status(650, 350);
        assertEquals(ReviewDecision.UNDECIDED, decision);
    }

    @Test
    public void testApproveMathGTE750ANDReadingGTE600() {
        ReviewDecision decision = new CollegeApplicationReviewer().status(750, 600);
        assertEquals(ReviewDecision.ACCEPT, decision);
    }

    @Test
    public void testMathLT750ANDReadingGTE600() {
        ReviewDecision decision = new CollegeApplicationReviewer().status(749, 600);
        assertEquals(ReviewDecision.UNDECIDED, decision);
    }

    @Test
    public void testMathGTE750ANDReadingLT600() {
        ReviewDecision decision = new CollegeApplicationReviewer().status(750, 599);
        assertEquals(ReviewDecision.UNDECIDED, decision);
    }

}

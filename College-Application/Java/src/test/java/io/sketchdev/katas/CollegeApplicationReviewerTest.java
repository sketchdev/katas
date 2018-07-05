package io.sketchdev.katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class CollegeApplicationReviewerTest {
/*
    @Test
    public void TestEmailMissingTld_IsNotSaved()
    {
        boolean saved = new CollegeApplicationForm().Apply("J", "W", "wheelie33@gmail");
        assertFalse(saved);
    }
*/
    @Test
    public void testUndecidedSATScore() {
        ReviewDecision decision = new CollegeApplicationReviewer().evaluateSATScore(600, 600);
        assertEquals(ReviewDecision.UNDECIDED, decision);
    }

    @Test
    public void testRejectSATScore() {
        ReviewDecision decision = new CollegeApplicationReviewer().evaluateSATScore(500, 499);
        assertEquals(ReviewDecision.REJECT, decision);
    }

    @Test
    public void testFailSATScore() {
        ReviewDecision decision = new CollegeApplicationReviewer().evaluateSATScore(500, 500);
        assertEquals(ReviewDecision.UNDECIDED, decision);
    }



}

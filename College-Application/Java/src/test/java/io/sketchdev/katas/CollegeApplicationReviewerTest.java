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
    @Test
    public void testRejectMathScore() {
        ReviewDecision decision = new CollegeApplicationReviewer().evaluateSATScore(399, 602);
        assertEquals(ReviewDecision.REJECT, decision);
    }
    @Test
    public void testUndecidedMathScore() {
        ReviewDecision decision = new CollegeApplicationReviewer().evaluateSATScore(400, 602);
        assertEquals(ReviewDecision.UNDECIDED, decision);
    }
    @Test
    public void testRejectReadingScore() {
        ReviewDecision decision = new CollegeApplicationReviewer().evaluateSATScore(652, 349);
        assertEquals(ReviewDecision.REJECT, decision);
    }
    @Test
    public void testUndecidedReadingScore() {
        ReviewDecision decision = new CollegeApplicationReviewer().evaluateSATScore(652, 350);
        assertEquals(ReviewDecision.UNDECIDED, decision);
    }
    @Test
    public void testApproveScores() {
        ReviewDecision decision = new CollegeApplicationReviewer().evaluateSATScore(750, 600);
        assertEquals(ReviewDecision.ACCEPT, decision);
    }
    @Test
    public void testUndecidedScores() {
        ReviewDecision decision = new CollegeApplicationReviewer().evaluateSATScore(749, 599);
        assertEquals(ReviewDecision.UNDECIDED, decision);
    }
    @Test
    public void testApproveScores2() {
        ReviewDecision decision = new CollegeApplicationReviewer().evaluateSATScore(600, 780);
        assertEquals(ReviewDecision.ACCEPT, decision);
    }
    @Test
    public void testUndecidedScores2() {
        ReviewDecision decision = new CollegeApplicationReviewer().evaluateSATScore(600, 779);
        assertEquals(ReviewDecision.UNDECIDED, decision);
    }

}

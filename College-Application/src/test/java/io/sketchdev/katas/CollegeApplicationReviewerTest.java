package io.sketchdev.katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class CollegeApplicationReviewerTest {
    @Test
    public void autoReviewUndecidedWithoutMathScore() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(null, 800, null);

        assertEquals(result, ReviewDecision.UNDECIDED);
    }

    @Test
    public void autoReviewUndecidedWithoutReadingScore() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(800, null, null);

        assertEquals(result, ReviewDecision.UNDECIDED);
    }

    @Test
    public void autoReviewRejectsLowCombinedScore() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(500, 499, null);

        assertEquals(result, ReviewDecision.REJECT);
    }

    @Test
    public void autoReviewUndecidedWithCombinedScoreOf1000() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(500, 500, null);

        assertEquals(result, ReviewDecision.UNDECIDED);
    }

    @Test
    public void autoReviewRejectsLowMathScore() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(399, 800, null);

        assertEquals(result, ReviewDecision.REJECT);
    }

    @Test
    public void autoReviewRejectsLowReadingScore() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(800, 349, null);

        assertEquals(result, ReviewDecision.REJECT);
    }

    @Test
    public void autoReviewAcceptsHighMathScoreAndMinReadingScore() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(750, 600, null);

        assertEquals(result, ReviewDecision.ACCEPT);
    }

    @Test
    public void autoReviewUndecidedWithHighMathScoreAndBelowMinReadingScore() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(750, 599, null);

        assertEquals(result, ReviewDecision.UNDECIDED);
    }

    @Test
    public void autoReviewAcceptsHighReadingScoreAndMinMathScore() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(600, 780, null);

        assertEquals(result, ReviewDecision.ACCEPT);
    }

    @Test
    public void autoReviewUndecidedWithHighReadingScoreAndBelowMinMathScore() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(599, 780, null);

        assertEquals(result, ReviewDecision.UNDECIDED);
    }

    @Test
    public void autoReviewAcceptsHighCombinedScoreAndIsLegacy() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(625, 625, true);

        assertEquals(result, ReviewDecision.ACCEPT);
    }

    @Test
    public void autoReviewUndecidedWithHighCombinedScoreAnNotyIsLegacy() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(625, 625, false);

        assertEquals(result, ReviewDecision.UNDECIDED);
    }
}

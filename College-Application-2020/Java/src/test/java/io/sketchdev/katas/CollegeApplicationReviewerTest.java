package io.sketchdev.katas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CollegeApplicationReviewerTest {
    @Test
    public void autoReviewUndecidedWithoutMathScore() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(null, 800, null);

        assertEquals(ReviewDecision.UNDECIDED, result);
    }

    @Test
    public void autoReviewUndecidedWithoutReadingScore() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(800, null, null);

        assertEquals(ReviewDecision.UNDECIDED, result);
    }

    @Test
    public void autoReviewRejectsLowCombinedScore() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(500, 499, null);

        assertEquals(ReviewDecision.REJECT, result);
    }

    @Test
    public void autoReviewUndecidedWithCombinedScoreOf1000() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(500, 500, null);

        assertEquals(ReviewDecision.UNDECIDED, result);
    }

    @Test
    public void autoReviewRejectsLowMathScore() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(399, 800, null);

        assertEquals(ReviewDecision.REJECT, result);
    }

    @Test
    public void autoReviewRejectsLowReadingScore() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(800, 349, null);

        assertEquals(ReviewDecision.REJECT, result);
    }

    @Test
    public void autoReviewAcceptsHighMathScoreAndMinReadingScore() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(750, 600, null);

        assertEquals(ReviewDecision.ACCEPT, result);
    }

    @Test
    public void autoReviewUndecidedWithHighMathScoreAndBelowMinReadingScore() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(750, 599, null);

        assertEquals(ReviewDecision.WAITLIST, result);
    }

    @Test
    public void autoReviewAcceptsHighReadingScoreAndMinMathScore() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(600, 780, null);

        assertEquals(ReviewDecision.ACCEPT, result);
    }

    @Test
    public void autoReviewUndecidedWithHighReadingScoreAndBelowMinMathScore() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(599, 780, null);

        assertEquals(ReviewDecision.UNDECIDED, result);
    }

    @Test
    public void autoReviewAcceptsHighCombinedScoreAndIsLegacy() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(625, 625, true);

        assertEquals(ReviewDecision.ACCEPT, result);
    }

    @Test
    public void autoReviewUndecidedWithHighCombinedScoreAndNotyIsLegacy() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(625, 625, false);

        assertEquals(ReviewDecision.WAITLIST, result);
    }

    @Test
    public void autoReviewWaitlistWithHighCombinedScore() {
        ReviewDecision result = new CollegeApplicationReviewer().doAutoReview(650, 699, false);

        assertEquals(ReviewDecision.WAITLIST, result);
    }
}

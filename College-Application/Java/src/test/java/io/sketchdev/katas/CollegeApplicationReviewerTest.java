package io.sketchdev.katas;

import org.junit.Test;

import static org.junit.Assert.*;
public class CollegeApplicationReviewerTest {
    private int reading, math;
    @Test
    public void autoRejectTest() {
        reading=499;
        math=500;
        CollegeApplicationReviewer tester=new CollegeApplicationReviewer();
        assertEquals(ReviewDecision.REJECT,tester.autoReview(reading, math));

    }
    @Test
    public void autoUndecidedTest() {
        reading=600;
        math=400;
        CollegeApplicationReviewer tester=new CollegeApplicationReviewer();
        assertEquals(ReviewDecision.UNDECIDED,tester.autoReview(reading, math));

    }
    @Test
    public void autoMathRejectTest(){
        math=399;
        reading=601;
        CollegeApplicationReviewer tester=new CollegeApplicationReviewer();
        assertEquals(ReviewDecision.REJECT,tester.autoReview(reading, math));
    }
    @Test
    public void autoApproveTest() {
        reading =600;
        math=750;
        CollegeApplicationReviewer tester=new CollegeApplicationReviewer();
        assertEquals(ReviewDecision.ACCEPT,tester.autoReview(reading, math));

    }

}

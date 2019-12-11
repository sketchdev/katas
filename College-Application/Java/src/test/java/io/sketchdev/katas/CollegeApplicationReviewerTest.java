package io.sketchdev.katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class CollegeApplicationReviewerTest {
    @Test
    public void rejectCombineTest(){
        CollegeApplicationReviewer failStudent = new CollegeApplicationReviewer(400,400);
        assertEquals(ReviewDecision.REJECT, failStudent.decision());
    }
    @Test
    public void rejectMathTest(){
        CollegeApplicationReviewer failStudent = new CollegeApplicationReviewer(399,800);
        assertEquals(ReviewDecision.REJECT, failStudent.decision());
    }
    @Test
    public void rejectReadingTest(){
        CollegeApplicationReviewer failStudent = new CollegeApplicationReviewer(800,349);
        assertEquals(ReviewDecision.REJECT, failStudent.decision());
    }
    @Test
    public void acceptCombineTest(){
        CollegeApplicationReviewer failStudent = new CollegeApplicationReviewer(800,800);
        assertEquals(ReviewDecision.ACCEPT, failStudent.decision());
    }
    @Test
    public void acceptCombineTest2(){
        CollegeApplicationReviewer failStudent = new CollegeApplicationReviewer(750,600);
        assertEquals(ReviewDecision.ACCEPT, failStudent.decision());
    }
}

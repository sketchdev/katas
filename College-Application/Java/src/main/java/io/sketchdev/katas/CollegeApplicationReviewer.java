package io.sketchdev.katas;

public class CollegeApplicationReviewer {

    public ReviewDecision evaluateSATScore(int mathScore, int readingScore) {

        int combinedScore = mathScore + readingScore;


        if (combinedScore < 1000) {
            return ReviewDecision.REJECT;

        }
        else
            return ReviewDecision.UNDECIDED;

    }
}

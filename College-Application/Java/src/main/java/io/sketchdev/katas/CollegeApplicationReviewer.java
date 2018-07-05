package io.sketchdev.katas;

public class CollegeApplicationReviewer {

    public ReviewDecision evaluateSATScore(int mathScore, int readingScore) {

        int combinedScore = mathScore + readingScore;
        if (mathScore <350){
            return ReviewDecision.REJECT;
        }
        if (readingScore <350){
            return ReviewDecision.REJECT;
        }
        if (combinedScore < 1000) {
            return ReviewDecision.REJECT;

        }
        else
            return ReviewDecision.UNDECIDED;

    }
}

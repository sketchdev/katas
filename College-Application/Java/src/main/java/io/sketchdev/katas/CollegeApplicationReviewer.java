package io.sketchdev.katas;

public class CollegeApplicationReviewer {
    // TODO: Implement auto review

    public ReviewDecision status(int mathScore,int readingScore) {

        int combinedScore = mathScore + readingScore;
        if (combinedScore < 1000  || mathScore < 400){
            return ReviewDecision.REJECT;
        }
        else {
            return ReviewDecision.UNDECIDED;
        }
    }


}

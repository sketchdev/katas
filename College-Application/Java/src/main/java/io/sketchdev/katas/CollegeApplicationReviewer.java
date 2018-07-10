package io.sketchdev.katas;

public class CollegeApplicationReviewer {
    // TODO: Implement auto review

    public ReviewDecision status(int mathScore,int readingScore) {

        int combinedScore = mathScore + readingScore;
        if (combinedScore < 1000 || mathScore < 400 || readingScore < 350) {
            return ReviewDecision.REJECT;
        } else if ( mathScore >=750 &&  readingScore >= 600) {

            return ReviewDecision.ACCEPT;
        } else {
            return ReviewDecision.UNDECIDED;
        }
    }
    }




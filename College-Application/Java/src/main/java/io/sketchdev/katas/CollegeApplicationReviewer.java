package io.sketchdev.katas;

public class CollegeApplicationReviewer {


    public ReviewDecision autoReview(int reading, int math) {
        if(math<400){
            return ReviewDecision.REJECT;
        }
        if(reading+math<1000){
            return ReviewDecision.REJECT;}
            if (reading >= 600 && math >= 750) {
            return ReviewDecision.ACCEPT;
            }

        return ReviewDecision.UNDECIDED;

    }
}

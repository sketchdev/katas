package io.sketchdev.katas;

public class CollegeApplicationReviewer {
    int math, reading, total;
    public CollegeApplicationReviewer(int m, int r){
        total = m+r;
        math = m;
        reading = r;
    }
    public ReviewDecision decision() {
        if(total < 1000){
            return ReviewDecision.REJECT;
        }
        if(math<400){
            return ReviewDecision.REJECT;
        }
        if(reading<350){
            return ReviewDecision.REJECT;
        }
        if(math>=750 && reading>=600) {
            return ReviewDecision.ACCEPT;
        }
        return ReviewDecision.UNDECIDED;

    }
}

package io.sketchdev.katas;

public class CollegeApplicationReviewer {
    public ReviewDecision doAutoReview(Integer satMathScore, Integer satReadingScore, Boolean isLegacy) {
        if (satMathScore == null || satReadingScore == null) {
            return ReviewDecision.UNDECIDED;
        } else if (satMathScore + satReadingScore < 1000) {
            return ReviewDecision.REJECT;
        } else if (satMathScore < 400) {
            return ReviewDecision.REJECT;
        } else if (satReadingScore < 350) {
            return ReviewDecision.REJECT;
        } else if (satMathScore >= 750 && satReadingScore >= 600) {
            return ReviewDecision.ACCEPT;
        } else if (satReadingScore >= 780 && satMathScore >= 600) {
            return ReviewDecision.ACCEPT;
        } else if (satMathScore + satReadingScore >= 1250 && (isLegacy != null && isLegacy)) {
            return ReviewDecision.ACCEPT;
        }

        return ReviewDecision.UNDECIDED;
    }
}

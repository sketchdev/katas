package io.sketchdev.katas

import spock.lang.Specification

import static io.sketchdev.katas.ReviewDecision.*

class CollegeApplicationReviewerSpec extends Specification {
    def 'Data driven SAT score - decisions'() {
        CollegeApplicationReviewer collegeApplicationReviewer = new CollegeApplicationReviewer();
        expect:
            collegeApplicationReviewer.doAutoReview(satMathScore, satReadingScore, isLegacy) == decision

        where:
            satMathScore    |   satReadingScore |   isLegacy    |   decision
            399             |   800             |   null        |   REJECT
            800             |   349             |   null        |   REJECT
            800             |   null            |   null        |   UNDECIDED
            null            |   800             |   null        |   UNDECIDED
            500             |   499             |   null        |   REJECT
            750             |   600             |   false       |   ACCEPT
    }
}

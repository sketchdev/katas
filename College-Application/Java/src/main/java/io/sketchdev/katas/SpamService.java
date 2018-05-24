package io.sketchdev.katas;

public class SpamService {

    public boolean IsKnownSpam(String emailAddress) {
        if (emailAddress == "knownspam@spam.com") return true;
        return false;
    }

}

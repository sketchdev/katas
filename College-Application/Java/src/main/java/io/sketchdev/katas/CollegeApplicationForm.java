package io.sketchdev.katas;

public class CollegeApplicationForm {

	public Boolean apply(String firstName, String lastName, String emailAddress,int score) {
        return new DataAccess().saveCollegeApplication(firstName, lastName, emailAddress,score);
	}

}

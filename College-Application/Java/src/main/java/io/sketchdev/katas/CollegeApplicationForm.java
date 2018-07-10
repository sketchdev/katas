package io.sketchdev.katas;

public class CollegeApplicationForm {

	public Boolean apply(String firstName, String lastName, String emailAddress) {
        return new DataAccess().saveCollegeApplication(firstName, lastName, emailAddress);
	}

}

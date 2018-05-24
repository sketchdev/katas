package io.sketchdev.katas;

public class CollegeApplicationForm {

	public Boolean Apply(String firstName, String lastName, String emailAddress) {
        return new DataAccess().SaveCollegeApplication(firstName, lastName, emailAddress);
	}

}

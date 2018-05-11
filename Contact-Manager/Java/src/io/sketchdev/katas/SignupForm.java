package io.sketchdev.katas;

public class SignupForm {

	public Boolean Signup(String firstName, String lastName, String emailAddress) {
        return new DataAccess().SaveRecord(firstName, lastName, emailAddress);
	}

}

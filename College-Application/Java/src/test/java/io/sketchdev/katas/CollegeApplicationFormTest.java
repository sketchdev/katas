package io.sketchdev.katas;


import org.junit.Test;

import static org.junit.Assert.*;

public class CollegeApplicationFormTest {

	@Test
	public void TestValidEmailIsSaved() {
		boolean saved = new CollegeApplicationForm().Apply("J", "W", "wheelie33@gmail.com");
	
		assertTrue(saved);
	}
	
	@Test
    public void TestEmailMissingTld_IsNotSaved()
    {
        boolean saved = new CollegeApplicationForm().Apply("J", "W", "wheelie33@gmail");
        assertFalse(saved);
    }

    @Test
    public void TestEmailMissingAtSign_IsNotSaved()
    {
        boolean saved = new CollegeApplicationForm().Apply("J", "W", "wheelie33gmail.com");
        assertFalse(saved);
    }


    @Test
    public void TestGenericData_IsSaved()
    {
        boolean saved = new CollegeApplicationForm().Apply("Jason", "Whelehon", "wheelie33@gmail.com");
        assertTrue(saved);
    }


    @Test
    public void TestLongFirstName_IsNotSaved()
    {
        boolean saved = new CollegeApplicationForm().Apply("JasonJasonJasonJasonJasonJason", "Whelehon", "wheelie33@gmail.com");
        assertFalse(saved);
    }

    @Test
    public void TestFirstNameContainsNonAlpha_IsNotSaved()
    {
        boolean saved = new CollegeApplicationForm().Apply("12345", "Whelehon", "wheelie33@gmail.com");
        assertFalse(saved);
    }

    @Test
    public void TestLongLastName_IsNotSaved()
    {
        boolean saved = new CollegeApplicationForm().Apply("Jason", "WhelehonWhelehonWhelehonWhelehon", "wheelie33@gmail.com");
        assertFalse(saved);
    }

    @Test
    public void TestHyphenatedLastName_IsSaved()
    {
        boolean saved = new CollegeApplicationForm().Apply("Jason", "Smith-Johnson", "wheelie33@gmail.com");
        assertTrue(saved);
    }

    @Test
    public void TestInvalidEmail_IsNotSaved()
    {
        boolean saved = new CollegeApplicationForm().Apply("Jason", "Whelehon", "wheelie33@gmailcom");
        assertFalse(saved);
    }

    @Test
    public void TestValidEmailKnownSpam_IsNotSaved() {
        boolean saved = new CollegeApplicationForm().Apply("J", "W", "knownspam@spam.com");
        assertFalse(saved);
    }
}

package io.sketchdev.katas;


import org.junit.Test;

import static org.junit.Assert.*;

public class CollegeApplicationFormTest {

	@Test
	public void testValidEmailIsSaved() {
		boolean saved = new CollegeApplicationForm().apply("J", "W", "wheelie33@gmail.com",300);
	
		assertTrue(saved);
	}
	
	@Test
    public void testEmailMissingTld_IsNotSaved()
    {
        boolean saved = new CollegeApplicationForm().apply("J", "W", "wheelie33@gmail",300);
        assertFalse(saved);
    }

    @Test
    public void testEmailMissingAtSign_IsNotSaved()
    {
        boolean saved = new CollegeApplicationForm().apply("J", "W", "wheelie33gmail.com",300);
        assertFalse(saved);
    }


    @Test
    public void testGenericData_IsSaved()
    {
        boolean saved = new CollegeApplicationForm().apply("Jason", "Whelehon", "wheelie33@gmail.com",300);
        assertTrue(saved);
    }


    @Test
    public void testLongFirstName_IsNotSaved()
    {
        boolean saved = new CollegeApplicationForm().apply("JasonJasonJasonJasonJasonJason", "Whelehon", "wheelie33@gmail.com",300);
        assertFalse(saved);
    }

    @Test
    public void testFirstNameContainsNonAlpha_IsNotSaved()
    {
        boolean saved = new CollegeApplicationForm().apply("12345", "Whelehon", "wheelie33@gmail.com",300);
        assertFalse(saved);
    }

    @Test
    public void testLongLastName_IsNotSaved()
    {
        boolean saved = new CollegeApplicationForm().apply("Jason", "WhelehonWhelehonWhelehonWhelehon", "wheelie33@gmail.com",300);
        assertFalse(saved);
    }

    @Test
    public void testHyphenatedLastName_IsSaved()
    {
        boolean saved = new CollegeApplicationForm().apply("Jason", "Smith-Johnson", "wheelie33@gmail.com",300);
        assertTrue(saved);
    }

    @Test
    public void testInvalidEmail_IsNotSaved()
    {
        boolean saved = new CollegeApplicationForm().apply("Jason", "Whelehon", "wheelie33@gmailcom",300);
        assertFalse(saved);
    }

    @Test
    public void testValidEmailKnownSpam_IsNotSaved() {
        boolean saved = new CollegeApplicationForm().apply("J", "W", "knownspam@spam.com",300);
        assertFalse(saved);
    }
}

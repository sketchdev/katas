package io.sketchdev.katas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SignupFormTests {

	@Test
	void validEmailIsSaved() {
		boolean saved = new SignupForm().Signup("J", "W", "wheelie33@gmail.com");
	
		assertTrue(saved);
	}
	
	@Test
    public void TestEmailMissingTld_IsNotSaved()
    {
        boolean saved = new SignupForm().Signup("J", "W", "wheelie33@gmail");
        assertFalse(saved);
    }

    @Test
    public void TestEmailMissingAtSign_IsNotSaved()
    {
        boolean saved = new SignupForm().Signup("J", "W", "wheelie33gmail.com");
        assertFalse(saved);
    }


    @Test
    public void TestGenericData_IsSaved()
    {
        boolean saved = new SignupForm().Signup("Jason", "Whelehon", "wheelie33@gmail.com");
        assertTrue(saved);
    }


    @Test
    public void TestLongFirstName_IsNotSaved()
    {
        boolean saved = new SignupForm().Signup("JasonJasonJasonJasonJasonJason", "Whelehon", "wheelie33@gmail.com");
        assertFalse(saved);
    }

    @Test
    public void TestFirstNameContainsNonAlpha_IsNotSaved()
    {
        boolean saved = new SignupForm().Signup("12345", "Whelehon", "wheelie33@gmail.com");
        assertFalse(saved);
    }

    @Test
    public void TestLongLastName_IsNotSaved()
    {
        boolean saved = new SignupForm().Signup("Jason", "WhelehonWhelehonWhelehonWhelehon", "wheelie33@gmail.com");
        assertFalse(saved);
    }

    @Test
    public void TestHyphenatedLastName_IsSaved()
    {
        boolean saved = new SignupForm().Signup("Jason", "Smith-Johnson", "wheelie33@gmail.com");
        assertTrue(saved);
    }

    @Test
    public void TestInvalidEmail_IsNotSaved()
    {
        boolean saved = new SignupForm().Signup("Jason", "Whelehon", "wheelie33@gmailcom");
        assertFalse(saved);
    }

    @Test
    public void TestValidEmailKnownSpam_IsNotSaved()
    {
        boolean saved = new SignupForm().Signup("J", "W", "knownspam@spam.com");
        assertFalse(saved);
    }
    
//    @Test
//    public void TestReallyLongHyphenatedLastName_IsNotSaved()
//    {
//       boolean saved = new SignupForm().Signup("J", "wwwwwwwwwwwwwwwwwwwwwwwww-wwwwwwwwwwwwwwwwwwwwwwwww", "wheelie33@gmail.com");
//       assertFalse(saved);
//    }
//
//
//    @Test
//    public void TestHypehatedLastName_EachPartLessThanMax_TotalIsGreaterThanMax_IsNotSaved()
//    {
//       boolean saved = new SignupForm().Signup("J", "wwwwwwwwwwwwwwwwww-wwwwwwwwwwwwwwwwww", "wheelie33@gmail.com");
//       assertFalse(saved);
//    }
}

package io.sketchdev.katas;

import java.util.regex.Pattern;

public class DataAccess {
    public Boolean saveCollegeApplication(String firstName, String lastName, String emailAddress)
    {
        DatabaseConnection connection = new DatabaseConnection("(local)", 30, "Contacts");

        if (!connection.isConnected())
        {
            return false;
        }


        if (firstName.length() <= 10)
        {
            if (!Pattern.matches("^[a-zA-Z]+$", firstName))
            {
                return false;
            }
        }
        else
        {
            return false;
        }


        if (lastName.indexOf('-') > 0)
        {
            String[] lastNameParts = lastName.split("-");
            for (int i = 0; i < lastNameParts.length; i++)
            {
                if (!Pattern.matches("^[a-zA-Z]+$", lastNameParts[i]))
                {
                    return false;
                }
            }
        }

        else if (lastName.length() <= 20)
        {
            if (!Pattern.matches("^[a-zA-Z]+$", lastName))
            {
                return false;
            }
        }
        else
        {
            return false;
        }

        boolean matches = Pattern.matches("^(.+)@(.+)\\.(.+)$", emailAddress);
        
        if (!matches) return false;

        // config.featureToggles.RequireSpamPass
        if (new SpamService().isKnownSpam(emailAddress)) return false;

        //finish saving the record here.
        return true;
       
    }
}





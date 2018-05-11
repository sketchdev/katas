package io.sketchdev.katas;

import java.util.regex.Pattern;

public class DataAccess {
    public Boolean SaveRecord(String firstName, String lastName, String emailAddress)
    {
        DatabaseConnection connection = new DatabaseConnection("(local)", 30, "Contacts");

        if (!connection.IsConnected())
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

        // From the RFC822 Spec
        boolean matches = Pattern.matches("^(.+)@(.+)\\.(.+)$", emailAddress);
        
        if (!matches) return false;

        // config.featureToggles.RequireSpamPass
        if (new SpamService().IsKnownSpam(emailAddress)) return false;

        // config.featureToggles.RequireMxContactablePass
        if (!new MxDomainService().DoesMxDomainRespond(emailAddress)) return false;


        //var isUnique = new ContactModel().IsUnique(emailAddress);
        //if (!isUnique) return false;

        //finish saving the record here.
        return true;
       
    }
}





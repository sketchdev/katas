using System;

namespace ATM
{
    public class Atm
    {
        public AuthenticationResult AuthenticateViaCardAndPin(string cardNumber, string pin)
        {
            var cardAuthenticator = new CardAuthenticator();

            var authenticationResult = cardAuthenticator.ValidateCardAndPin(cardNumber, pin);

            return authenticationResult;
        }
    }
}

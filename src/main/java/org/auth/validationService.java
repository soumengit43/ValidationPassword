package org.auth;

public class validationService {

    public static void validatePassword(String password) throws InvalidPassException{
        if(lowerCaseEmptyValidation(password)){
            validateOneCondition(password);
        }
    }
    // This method for validate 2 must condition
    public static boolean lowerCaseEmptyValidation(String password) throws InvalidPassException{

        // 2. Password should not be null and isBlank() is used for whitespace character check introduced in java 11
        if (password == null || password.isBlank()) {
            throw new InvalidPassException("Password should not be empty");
        }
        // 4. Lowercase check using Regex and It must qualify
        if(!password.matches(".*[a-z].*")){
            throw new InvalidPassException("Password should have at least one lowercase letter");
        }
        return true;
    }

    // This method is for validate only one condition among rest of the 3 condition
    public static void validateOneCondition(String password) throws InvalidPassException{
            int trueCount = 0;
            // 1. Password char length check
            if (password.length() < 8)
                trueCount++;
            // 3. Uppercase check using Regex
            if (!password.matches(".*[A-Z].*"))
                trueCount++;
            // 5. Number check using Regex
            if (password.matches(".*[0-9].*"))
                trueCount++;

             if(trueCount < 1){
                throw new InvalidPassException("\nPassword must satisfy at least ONE of the following:\n" +
                        "Minimum length of 8 Char\n"+
                        "At least one uppercase letter \n"+
                        "At least one digit"
                );
            }
    }


}
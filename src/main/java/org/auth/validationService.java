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
            int trueCount = 1;
            int check = 0;
            // 1. Password char length check
            if (password.length() < 8) {
                check = 1;
            }else {
                trueCount++;
            }
            // 3. Uppercase check using Regex
            if (!password.matches(".*[A-Z].*")) {
                check = 2;
            }else {
                trueCount++;
            }
            // 5. Number check using Regex
            if (!password.matches(".*[0-9].*")) {
                check = 3;
            } else{
                trueCount++;
            }
            // Below first 2 nested if conditions are unreachable due to question No 2.
            // Q1.2 Null/Empty/Whitespace character and Q1.4 are must conditions. Only one condition among rest of 3 conditions will satisfy the question No 2.
            if(trueCount<2){
                if(check == 1)
                    throw new InvalidPassException("Password should be larger than 8 chars ");
                if(check == 2)
                    throw new InvalidPassException("Password should have at least one uppercase letter");
                if(check == 3)
                    throw new InvalidPassException("Password should have at least one number \n or one uppercase letter \n or larger than 8 chars");
            }
    }


}
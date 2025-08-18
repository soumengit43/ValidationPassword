package org.auth;

public class validationService {

    public static void validatePassword(String password) throws InvalidPassException{

        // 1. Password char length check
        if(password.length() < 8){
            throw new InvalidPassException("Password should be larger than 8 chars");
        }

        // 2. Password should not be null and isBlank() is used for whitespace character check introduced in java 11
        if(password == null || password.isBlank()){
            throw new InvalidPassException("Password should not be empty");
        }
        // 3. Uppercase check using Regex
        if(!password.matches(".*[A-Z].*")){
            throw new InvalidPassException("Password should have at least one uppercase letter");
        }
        // 4. Lowercase check using Regex
        if(!password.matches(".*[a-z].*")){
            throw new InvalidPassException("Password should have at least one lowercase letter");
        }
        // 5. Number check using Regex
        if(!password.matches(".*[0-9].*")){
            throw new InvalidPassException("Password should have at least one number");
        }

    }
}

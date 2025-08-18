package org.auth;

public class InvalidPassException  extends Exception{
    public InvalidPassException(String message){
        super(message);
    }
}

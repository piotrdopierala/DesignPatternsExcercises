package DP_Flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ErrorMessageFactory {

    public enum ErrorType {GenericSystemError,PageNotFoundError,ServerError}

    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

    public static ErrorMessageFactory getInstance(){return FACTORY;}

    private Map<ErrorType,SystemErrorMessage> errorMessages = new HashMap<>();

    //private constructor - EAGER Singleton.
    private ErrorMessageFactory(){
        errorMessages.put(ErrorType.GenericSystemError,new SystemErrorMessage("A generic error of type $errorCode. Please refer to: \n",
                "http://google.com/q="));
        errorMessages.put(ErrorType.PageNotFoundError,new SystemErrorMessage("Page not found. And error of type $errorCode. Please refer to: \n",
                "http://google.pl/q="));
    };

    public SystemErrorMessage getError(ErrorType type){
        return errorMessages.get(type);
    }

    private UserBannedErrorMessage getUserBannedMessage(String caseID){
        return new UserBannedErrorMessage(caseID);
    }

}

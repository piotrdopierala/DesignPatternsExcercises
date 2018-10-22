package DP_Flyweight;

import java.time.Duration;

public class UserBannedErrorMessage implements ErrorMessage {

    private String caseID;
    private String remarks;
    private Duration banDuration;
    private String msg;

    public UserBannedErrorMessage(String caseID) {
        this.caseID=caseID;
        remarks="You violated terms of use.";
        banDuration=Duration.ofDays(2);
        msg="You are BANNED. SORRY. \n More information:\n";
        msg+=caseID+"\n";
        msg+=remarks+"\n";
        msg+="Banned for:"+banDuration.toHours() + "hours.";
    }

    @Override
    public String getText(String errorCode) {
        return msg;
    }
}

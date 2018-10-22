import java.time.Duration;
import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;


public class LeaveApplication {

    public enum LeaveType{SICK,PTO, LOP};
    public enum Status {Pending,Approved,Rejected};

    private LeaveType type;
    private LocalDate from;
    private LocalDate to;
    private String processedBy;
    private Status status;

    public LeaveApplication(LeaveType type, LocalDate from, LocalDate to) {
        this.type = type;
        this.from = from;
        this.to = to;
        this.status=Status.Pending;
    }

    private LeaveApplication(){

    }

    public void approve(String processedBy){
        this.status=Status.Approved;
        this.setProcessedBy(processedBy);

    }

    public void setProcessedBy(String processedBy) {
        this.processedBy = processedBy;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LeaveType getType() {
        return type;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    public long getNoOfDays(){
        return DAYS.between(from,to);
    }

    public String getProcessedBy() {
        return processedBy;
    }

    public Status getStatus() {
        return status;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private LeaveType type;
        private LocalDate from;
        private LocalDate to;
        private LeaveApplication application;

        public Builder withType(LeaveType type){
            this.type=type;
            return this;
        }

        public Builder starts(LocalDate from){
            this.from=from;
            return this;
        }

        public Builder ends(LocalDate to){
            this.to=to;
            return this;
        }

        public LeaveApplication build(){
            this.application=new LeaveApplication(type,from,to);
            return this.application;

        }

    }
    @Override
    public String toString() {
        return "Leava application type:"+this.type+" from:"+this.from+" to:"+this.to+" ("+this.getNoOfDays()+") day(s) "+" status:"+this.status+" approved by:"+this.processedBy;
    }


}

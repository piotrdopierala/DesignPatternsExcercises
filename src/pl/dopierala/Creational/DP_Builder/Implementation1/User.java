package DP_Builder.Implementation1;

import java.time.LocalDate;

// Obiekt ktory zostanie utworzony przez Builder DP
// To jest obiekt DTO (Data Transfer Object)
public class User {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Address address;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}

package DP_Builder.Implementation1;

import java.time.LocalDate;
import java.time.Period;

//faktyczny obiekt builder;
// pobieramy informacje potrzebne do zbudowania DP_Builder.Implementation1.UserWebDTO, zapisujemy je i na rzadanie (BUILD) tworzymy obiekt.
//implementacja interfejsu buildera
public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String age;
    private String address;

    private UserWebDTO dto;

    //skladamy obiekt podajemy first name
    @Override
    public UserDTOBuilder withFirstName(String fname) {
        firstName=fname;
        return this;
    }

    //skladamy obiekt podajemy last name name
    @Override
    public UserDTOBuilder withLastName(String lname) {
        lastName=lname;
        return this;
    }

    //skladamy obiekt podajemy date urodzin, ale w obiekcie Web potrzebujemy wiek wiec odrazu obliczamy
    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date,LocalDate.now());
        age=Integer.toString(ageInYears.getYears());
        return this;
    }

    //skladamy obiekt podajemy address
    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address=address.getHouseNumber() + ", " + address.getStreet()
                + "\n"+address.getCity() + "\n"+address.getState()+" "+address.getZipcode();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDTO(firstName+" "+lastName,address,age);

        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}

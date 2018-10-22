package DP_Builder.Implementation1;

import java.time.LocalDate;

//Abstract builder
//okreslamy co builder musi implementowac
public interface UserDTOBuilder {
    //Metody do tworzenia czesci, kawalkow produktu
    UserDTOBuilder withFirstName(String fname);
    UserDTOBuilder withLastName(String lname);
    UserDTOBuilder withBirthday(LocalDate date);
    UserDTOBuilder withAddress(Address address);

    //metoda do stworzenia finalnego produktu
    UserDTO build();
    //opcjonalna metoda to pobrania (fetch) aktualnie zbudowanego obiektu
    UserDTO getUserDTO();

}

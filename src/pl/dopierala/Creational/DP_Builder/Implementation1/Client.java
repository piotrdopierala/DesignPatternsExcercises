package DP_Builder.Implementation1;

import java.time.LocalDate;

//tez dziala jako DIRECTOR
public class Client {
    public static void main(String[] args){
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();

        UserDTO dto=directBuild(builder,user);//podajemy builder i dane z ktorych ma utworzyc obiekt
        System.out.println(dto);
    }

    //tworzymy DTO z istniejacego obiektu (user)
    private static UserDTO directBuild(UserDTOBuilder builder, User user){
        //METHOD CHAINING, kazda metoda zwraca obiekt DP_Builder.Implementation1.UserDTOBuilder wiec mozna na koncu wywolania metody napizac "." i wywolac KOLEJNA !!
        return builder.withFirstName(user.getFirstName())
               .withLastName(user.getLastName())
               .withAddress(user.getAddress())
               .withBirthday(user.getBirthday())
               .build();
    }

    //tworzy przykladowego urzytkownika
    public static User createUser(){
        User user = new User();
        user.setBirthday(LocalDate.of(1984,11,05));
        user.setFirstName("Piotr");
        user.setLastName("Dopierala");
        Address address = new Address();
        address.setHouseNumber("9");
        address.setStreet("Hawelanska");
        address.setCity("Poznan");
        address.setState("Wielkopolska");
        address.setZipcode("61-625");
        user.setAddress(address);
        return user;
    }
}

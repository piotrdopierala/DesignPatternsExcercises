package DP_Builder.MyImplementation;

public class Main {
    public static void main(String[] args){

        // this code also works as Builder DP's DIRECTOR

        Car Alfa = directBuild(Car.getBuilder());

    }

    private static Car directBuild(Car.Builder builder){
        return builder.withColor("RED").withEngine("1.9 JTD").withMake("147").build();
    }
}

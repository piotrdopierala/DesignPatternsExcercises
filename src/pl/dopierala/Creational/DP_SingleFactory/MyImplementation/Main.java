package pl.dopierala.Creational.DP_SingleFactory.MyImplementation;

public class Main {
    public static void main(String[] args){
        //Factory bigFactory = new Factory();
        TireProduct laczek_a = (TireProduct) Factory.getProduct("tire");
        TireProduct laczek_b = (TireProduct) Factory.getProduct("tire");
        SpringProduct scania = (SpringProduct) Factory.getProduct("spring");
    }
}

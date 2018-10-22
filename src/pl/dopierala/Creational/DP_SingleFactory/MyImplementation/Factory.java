package pl.dopierala.Creational.DP_SingleFactory.MyImplementation;

public class Factory {
    public  int a;
    public static Product_intf getProduct(String type){
        if(type.equals("tire"))
            return new TireProduct();
        else if(type.equals("spring"))
            return new SpringProduct();
        else
            return null;
    }
}

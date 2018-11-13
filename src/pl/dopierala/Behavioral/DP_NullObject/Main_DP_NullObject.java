package pl.dopierala.Behavioral.DP_NullObject;

public class Main_DP_NullObject {
    public static void main(String[] args) {
        ComplexSevice service = new ComplexSevice("Simple report",new NullStorageService());
        service.generateReport();
    }
}

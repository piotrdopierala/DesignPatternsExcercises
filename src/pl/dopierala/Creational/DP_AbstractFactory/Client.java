package pl.dopierala.Creational.DP_AbstractFactory;

import pl.dopierala.Creational.DP_AbstractFactory.aws.AwsResourceFactory;
import pl.dopierala.Creational.DP_AbstractFactory.gcp.GoogleResourceFactory;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory){
        this.factory=factory;
    }

    public Instance createServer(Instance.Capacity cap, int storageMib){
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.small,45);
        i1.start();
        i1.stop();

        System.out.println("**************************************");

        Client gcloud = new Client(new GoogleResourceFactory());
        Instance i2 = gcloud.createServer(Instance.Capacity.large,1000);
        i2.start();
        i2.stop();

    }

}

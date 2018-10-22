package pl.dopierala.Creational.DP_AbstractFactory.gcp;

import pl.dopierala.Creational.DP_AbstractFactory.Instance;
import pl.dopierala.Creational.DP_AbstractFactory.ResourceFactory;
import pl.dopierala.Creational.DP_AbstractFactory.Storage;

//Represents a concrete product in a family "Google Cloud Platform"
public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        //Map capacity to GCP compute instance types. Use GCP API to provision
        System.out.println("Created Google Compute Engine instance");
    }

    @Override
    public void start() {
        System.out.println("Compute engine instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached "+storage+" to Compute engine instance");
    }

    @Override
    public void stop() {
        System.out.println("Compute engine instance stopped");
    }
}

package pl.dopierala.Creational.DP_AbstractFactory.gcp;

import pl.dopierala.Creational.DP_AbstractFactory.Instance;
import pl.dopierala.Creational.DP_AbstractFactory.ResourceFactory;
import pl.dopierala.Creational.DP_AbstractFactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {


    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}

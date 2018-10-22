package pl.dopierala.Creational.DP_AbstractFactory;



//Abstract factory with methods defined for each object type.
public interface ResourceFactory {
Instance createInstance(Instance.Capacity capacity);
Storage createStorage(int capMib);
}

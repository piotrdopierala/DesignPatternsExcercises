package pl.dopierala.Creational.DP_ObjectPool;

public interface Poolable {

    //state reset to reuse object in case we want to use object againg there will be n state leftovers.
    void reset();
}

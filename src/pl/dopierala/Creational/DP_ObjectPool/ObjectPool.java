package pl.dopierala.Creational.DP_ObjectPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

    private BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, int count){ //obiekty poczatkowe zostana utworzone przez kreatora, ilosc do utworzenia tez jako parametr
        availablePool = new LinkedBlockingQueue<>();
        for (int i = 0; i < count; i++) {
            availablePool.offer(creator.get());
        }
    }

    public T get(){
        try{
            return availablePool.take();
        } catch (InterruptedException e) {
            System.out.println("take() was interrupted");
            e.printStackTrace();
        }
        return null;
    }

    public void release(T obj){
        obj.reset(); //prepare object to reuse
        try {
            availablePool.put(obj);
        } catch (InterruptedException e) {
            System.out.println("put() was interrupted");
            e.printStackTrace();
        }
    }
}

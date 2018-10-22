package pl.dopierala.Creational.DP_Singleton;
/**
 * This class demonstrates singleton pattern using Double Checked Locking or "classic" singleton.
 * This is also a lazy initializing singleton.
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking, the volatile keyword is guaranteed to work only after JVMs starting with
 * version 1.5 and later.
 */
public class LazyRegistryWithDCL {

    private LazyRegistryWithDCL(){

    }

    private static volatile LazyRegistryWithDCL INSTANCE; //volatile by drugi watek nie uzywal cashowanej wersji tej zmiennej

    public static LazyRegistryWithDCL getInstance(){ //double check locking
        if(INSTANCE==null){
            synchronized (LazyRegistryWithDCL.class){//zabezpieczenie przed problemem wielowontkowosci
                if(INSTANCE==null) {
                    INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }
        return INSTANCE;
    }
 
}

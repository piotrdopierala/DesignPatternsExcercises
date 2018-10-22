package pl.dopierala.Creational.DP_Singleton;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */

//lazy initialization holder

public class LazyRegistryIODH {

    private LazyRegistryIODH(){
        System.out.println("In Lazy Registry IODH");
    };

    private static class RegistryHolder{ //To jest nasz holder
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance(){
        return RegistryHolder.INSTANCE;
    }

}

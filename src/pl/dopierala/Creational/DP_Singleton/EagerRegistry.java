package pl.dopierala.Creational.DP_Singleton;
/**
 * This class uses eager initialization of singleton instance.
 */
public class EagerRegistry {

    private EagerRegistry(){
    }

    private static final EagerRegistry INSTANCE = new EagerRegistry(); //jedyna instancja tu tworzona

    public static EagerRegistry getInstance(){
        return INSTANCE;
    }

}
package pl.dopierala.Creational.DP_FactoryMethod;
import pl.dopierala.Creational.DP_FactoryMethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

    public Message getMessage(){
        Message msg = createMessage();

        //after creating do some additional processing
        //not required, but convenient
        msg.addDefaultHeaders();
        msg.encrypt();

        return msg;
    }

    //factory method it creates and returns an object.
    public abstract Message createMessage();

}

package pl.dopierala.Creational.DP_FactoryMethod;

import pl.dopierala.Creational.DP_FactoryMethod.message.JSONMessage;
import pl.dopierala.Creational.DP_FactoryMethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}

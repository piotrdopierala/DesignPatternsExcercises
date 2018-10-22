package pl.dopierala.Creational.DP_FactoryMethod;

import pl.dopierala.Creational.DP_FactoryMethod.message.Message;
import pl.dopierala.Creational.DP_FactoryMethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}

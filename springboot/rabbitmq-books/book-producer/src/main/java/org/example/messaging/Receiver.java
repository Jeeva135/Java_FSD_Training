package org.example.messaging;


import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Component
public class Receiver {
    private Logger logger = (Logger) LoggerFactory.getLogger(Receiver.class);
    public void receiveMessage(String message){
        logger.info("Received message: " + message);
    }

}

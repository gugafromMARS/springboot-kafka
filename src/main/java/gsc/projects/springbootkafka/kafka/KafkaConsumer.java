package gsc.projects.springbootkafka.kafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private final static Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(id = "myGroup", topics = "javaguides")
    public void consume(String message){
        LOGGER.info(String.format("Message receive -> %s", message));
    }
}

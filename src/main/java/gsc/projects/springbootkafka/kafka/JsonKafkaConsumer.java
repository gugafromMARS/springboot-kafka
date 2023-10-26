package gsc.projects.springbootkafka.kafka;

import gsc.projects.springbootkafka.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private final static Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(groupId = "myGroup", topics = "javaguides_json")
    public void consume(User user){
    LOGGER.info(String.format("Json receive -> %s", user.toString()));
    }
}

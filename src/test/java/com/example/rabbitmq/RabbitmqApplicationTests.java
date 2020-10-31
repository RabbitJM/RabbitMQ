package com.example.rabbitmq;

import com.example.rabbitmq.config.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqApplicationTests {

    @Autowired
    Sender sender;

    @Test
    void contextLoads() {
        sender.send();
    }

}

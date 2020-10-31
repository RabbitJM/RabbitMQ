package com.example.rabbitmq.config;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/***
 * 生产者，则产生消息的客户端，将消息推到exchange中(即上文中描述的#5 #6)
 */
@Component
public class Sender {

    @Autowired
    RabbitTemplate rabbitTemplate;


    public void send() {
        String message =  "发送的数据消息";
        System.out.println("Sender  " + message);
        rabbitTemplate.convertAndSend("CaoJunMing——Test", "CaoJunMing——test-key", message);
    }


}

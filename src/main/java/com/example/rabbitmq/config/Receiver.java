package com.example.rabbitmq.config;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {


    /***
     * 消息的消费者    消息生产者生成消息   消费者处理消息队列
     * @param message
     * @throws InterruptedException
     */
    @RabbitHandler
    @RabbitListener(queues = "caoJunMing")
    public void immediateProcess(String message) throws InterruptedException {
        for (int i = 0; i < 6; i++) {
            Thread.sleep(10000);
            System.out.println(i);
        }
    }

}

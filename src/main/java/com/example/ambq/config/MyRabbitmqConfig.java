package com.example.ambq.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRabbitmqConfig {

    /**
     * 配置json格式的序列化
     * @return
     */
    @Bean
    public MessageConverter myMessageConverter(){
        return new Jackson2JsonMessageConverter();
    }
}

package com.example.ambq.service;

import com.example.ambq.bean.Book;
import org.apache.commons.logging.Log;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.logging.Logger;

@Service
public class BookService {

    @RabbitListener(queues = "atguigu.news")
    public void receive(Book book){
        System.out.println(book);
    }


}

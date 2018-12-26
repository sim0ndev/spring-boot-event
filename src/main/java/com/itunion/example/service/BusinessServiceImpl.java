package com.itunion.example.service;/**
 * @Auther: Administrator
 * @Date: 2018/12/25 15:32
 * @Description:
 */

import com.itunion.example.domain.Order;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @ClassName BusinessServiceImpl
 * @Description TODO
 * @Auther: Administrator
 * @Date: 2018/12/25 15:32
 * @Version 1.0
 **/
@Service
public class BusinessServiceImpl {
    @EventListener
    @Async
    public void processEvent(BusinessEvent event) {
        //sendEmail(order);
    }
}

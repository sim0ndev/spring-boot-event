package com.itunion.example.service;
/**
 * @Auther: Administrator
 * @Date: 2018/12/25 16:37
 * @Description:
 */

import org.springframework.context.ApplicationEvent;

/**
 * @ClassName BusinessEvent
 * @Description TODO
 * @Auther: Administrator
 * @Date: 2018/12/25 16:37
 * @Version 1.0
 **/

public class BusinessEvent extends ApplicationEvent {

    public enum EventType {BIZ,NTF};

    private EventType eventType;

    private Object context;

    private Object paramter;

    public  BusinessEvent(Object obj){
        super(obj);
    }
}

package com.github.linshuguang;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by kenya on 2018/2/2.
 */
@Service
public class Application {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo/applicationContext-zookeeper-provider.xml");
        applicationContext.start();
        System.in.read();
    }
}

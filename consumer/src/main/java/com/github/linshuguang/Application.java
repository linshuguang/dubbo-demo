package com.github.linshuguang;

import name.lsg.mailbot.service.MailbotService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kenya on 2018/2/2.
 */
public class Application {
    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"app_dubbo_consumer.xml"});
            context.start();

            //获取远程服务代理
            MailbotService demonService = (MailbotService) context.getBean("demoService");
            // 调用方法
            String sayHello = demonService.sayHello("world");

            //显示结果
            System.out.println(sayHello);

            System.out.println("---------调用成功---------");
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}

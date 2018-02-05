package name.lsg.mailbot.service;

import name.lsg.common.Message;

/**
 * Created by kenya on 2018/2/2.
 */
public interface MailbotService {

    Message handleMessage(Message msg);
    String sayHello(String var1);
}

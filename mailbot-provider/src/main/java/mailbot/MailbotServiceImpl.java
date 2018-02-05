package mailbot;

import name.lsg.ServiceProvider;
import name.lsg.common.Message;
import name.lsg.common.TextMsg;
import name.lsg.mailbot.service.MailbotService;

/**
 * Created by kenya on 2018/2/5.
 */
public class MailbotServiceImpl extends ServiceProvider implements MailbotService {

    @Override
    public String sayHello(String var1){
        return "Hello "+var1;
    }

    @Override
    public Message handleMessage(Message msg){
        return new TextMsg("mailbot");
    }
}

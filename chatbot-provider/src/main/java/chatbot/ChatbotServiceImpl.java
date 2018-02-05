package chatbot;

import name.lsg.ServiceProvider;
import name.lsg.chatbot.service.ChatbotService;
import name.lsg.common.Message;
import name.lsg.common.TextMsg;

/**
 * Created by kenya on 2018/2/5.
 */
public class ChatbotServiceImpl extends ServiceProvider implements ChatbotService{

    @Override
    public Message handleMessage(Message msg){
        return new TextMsg("chatbot");
    }
}

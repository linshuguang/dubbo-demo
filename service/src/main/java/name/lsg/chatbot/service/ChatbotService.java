package name.lsg.chatbot.service;

import name.lsg.common.Message;

/**
 * Created by kenya on 2018/2/5.
 */
public interface ChatbotService {
    Message handleMessage(Message msg);
}

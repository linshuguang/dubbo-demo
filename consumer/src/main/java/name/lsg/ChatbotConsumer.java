package name.lsg;

import name.lsg.chatbot.service.ChatbotService;
import name.lsg.common.Message;
import name.lsg.common.TextMsg;
import name.lsg.mailbot.service.MailbotService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kenya on 2018/2/5.
 */
public class ChatbotConsumer {
    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"app_chatbot_consumer.xml"});
            context.start();

            //获取远程服务代理
            ChatbotService chatbotService = (ChatbotService) context.getBean("chatbotService");
            Message message = new TextMsg("hello ");
            // 调用方法
            Message result = chatbotService.handleMessage(message);

            //显示结果
            if(result instanceof TextMsg) {
                TextMsg textMsg = (TextMsg)result;
                System.out.println(textMsg.getMsg());
            }

            System.out.println("---------调用成功---------");
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}

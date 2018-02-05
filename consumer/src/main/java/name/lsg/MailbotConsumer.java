package name.lsg;

import name.lsg.common.Message;
import name.lsg.common.TextMsg;
import name.lsg.facade.service.FacadeService;
import name.lsg.mailbot.service.MailbotService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kenya on 2018/2/5.
 */
public class MailbotConsumer {
    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"app_mailbot_consumer.xml"});
            context.start();

            //获取远程服务代理
            MailbotService mailbotService = (MailbotService) context.getBean("mailbotService");
            Message message = new TextMsg("hello ");
            // 调用方法
            Message result = mailbotService.handleMessage(message);

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

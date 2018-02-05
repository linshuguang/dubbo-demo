package name.lsg;

import name.lsg.common.Message;
import name.lsg.common.TextMsg;
import name.lsg.mailbot.service.MailbotService;
import name.lsg.rule.service.RuleService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kenya on 2018/2/5.
 */
public class RuleConsumer {
    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"app_rule_consumer.xml"});
            context.start();

            //获取远程服务代理
            RuleService ruleService = (RuleService) context.getBean("ruleService");
            Message message = new TextMsg("hello ");
            // 调用方法
            Message result = ruleService.handleMessage(message);

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

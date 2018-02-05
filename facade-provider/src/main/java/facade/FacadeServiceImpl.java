package facade;


import name.lsg.ServiceProvider;
import name.lsg.chatbot.service.ChatbotService;
import name.lsg.facade.service.FacadeService;
import name.lsg.mailbot.service.MailbotService;
import name.lsg.rule.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import name.lsg.common.Message;
import org.springframework.stereotype.Service;

/**
 * Created by kenya on 2018/2/5.
 */
public class FacadeServiceImpl extends ServiceProvider implements FacadeService{

    @Autowired
    MailbotService mailbotService;

    @Autowired
    RuleService ruleService;

    @Autowired
    ChatbotService chatbotService;

    public MailbotService getMailbotService() {
        return mailbotService;
    }

    public void setMailbotService(MailbotService mailbotService) {
        this.mailbotService = mailbotService;
    }

    public RuleService getRuleService() {
        return ruleService;
    }

    public void setRuleService(RuleService ruleService) {
        this.ruleService = ruleService;
    }

    public ChatbotService getChatbotService() {
        return chatbotService;
    }

    public void setChatbotService(ChatbotService chatbotService) {
        this.chatbotService = chatbotService;
    }


    @Override
    public Message handleMessage(Message msg){

        assert mailbotService!=null;
        return mailbotService.handleMessage(msg);
    }
}

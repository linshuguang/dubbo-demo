package rule;

import name.lsg.common.Message;
import name.lsg.common.TextMsg;
import name.lsg.rule.service.RuleService;

/**
 * Created by kenya on 2018/2/5.
 */
public class RuleServiceImpl implements RuleService {

    @Override
    public Message handleMessage(Message msg){
        return new TextMsg("rule");
    }
}

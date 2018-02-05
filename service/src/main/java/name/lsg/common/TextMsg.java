package name.lsg.common;

import java.io.Serializable;

/**
 * Created by kenya on 2018/2/5.
 */
public class TextMsg extends Message implements Serializable {


    private String msg;

    public TextMsg(String msg){
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}

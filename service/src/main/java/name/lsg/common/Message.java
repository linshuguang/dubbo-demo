package name.lsg.common;

import java.io.Serializable;
import java.util.List;

/**
 * Created by kenya on 2018/2/5.
 */
public class Message implements Serializable{
    public List<String> from;
    public List<String> to;

    private boolean success=false;
    private String errMsg;
}

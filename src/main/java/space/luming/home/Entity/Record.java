package space.luming.home.Entity;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Record {
    //由type从types获取对象的类型，创建相关对象的表单，放入相关对象？
    private int rid;
    private int type;
    private int targetid;
    private String Entity;
    private List<Entity> pre;
    private List<Entity> after;

}

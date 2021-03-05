package util.shareelements;

import com.backstage.operating.Select;
import com.functionalarea.Center;

import javax.servlet.jsp.jstl.sql.Result;
import java.awt.*;

/**
 * 获取其他类的元素
 */
public class GetElements {
    public static void main(String[] args) {
    }

    private GetElements(){}

    public static TextArea CenterTextArea = null;
    public static Panel CenterPanel = null;
    public static Result res = null;

    /**
     * 构造函数 获取各项元素
     */
    public static TextArea GetTopElements(String cmd){
        CenterTextArea = Center.getTextArea();
        System.out.println("被 -- " + cmd + " -- 获取了TextArea对象");
        return CenterTextArea;
    }

    public static Panel GetCenterPanel(){
        CenterPanel = Center.getCenterPanel();
        return CenterPanel;
    }

    public static Result GetResult(){
        res = Select.getRes();
        return res;
    }

}



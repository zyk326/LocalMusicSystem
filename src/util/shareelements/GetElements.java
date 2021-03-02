package util.shareelements;

import com.functionalarea.Center;

import java.awt.*;

/**
 * 获取其他类的元素
 */
public class GetElements {
    public static void main(String[] args) {
    }
    public static TextArea CenterTextArea = new TextArea();

    /**
     * 构造函数 获取各项元素
     */
    public void GetTopElements(String cmd){
        CenterTextArea = Center.getTextArea();
        System.out.println("被 -- " + cmd + " -- 获取了TextArea对象");
    }
}



package util.shareelements;

import com.backstage.operating.Select;
import com.functionalarea.Center;
import com.functionalarea.LeftWindow.AddElements;

import javax.servlet.jsp.jstl.sql.Result;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

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

    public static JTextField jt = null;

    public static JTextField getJt() {
        jt = AddElements.getJt();
        return jt;
    }

    public static JTextField getJt1() {
        jt1 = AddElements.getJt1();
        return jt1;
    }

    public static JTextField jt1 = null;


    public static HashMap getMusicColumnsData() {
        columnsData = Select.getColumnsData();
        return columnsData;
    }

    public static HashMap<String, java.util.List<Object>> columnsData = null;

    public static java.util.List<Object> getMusicdata() {
        musicdata = Select.getMusicdata();
        return musicdata;
    }

    public static java.util.List<Object> musicdata = null;

    public static JFrame getLocalWinodw(JFrame jf) {
        LocalWinodw = jf;
        return LocalWinodw;
    }

    public static JFrame LocalWinodw = null;

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



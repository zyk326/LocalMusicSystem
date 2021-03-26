package util.frame;

import util.GetDefaultData;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;

public class MainFrame extends JFrame {
    public static void main(String[] args) {
    }

    //创建一个窗口

    /**
     * 创建一个窗口
     * @param branchWindowName 窗口的类型
     * @param
     */
    public void createWindow(String branchWindowName, JFrame frame){
        //JFrame frame = new JFrame(name);

        //从配置文件中获取该窗口的属性
        int x = Integer.parseInt(GetDefaultData.getLocationX(branchWindowName));
        int y = Integer.parseInt(GetDefaultData.getLocationY(branchWindowName));
        int width = Integer.parseInt(GetDefaultData.getWindowWight(branchWindowName));
        int height = Integer.parseInt(GetDefaultData.getWindowHeight(branchWindowName));


//        ScriptEngineManager manager = new ScriptEngineManager();
//        ScriptEngine se = manager.getEngineByName("js");
//        String str = "13>12&&'张三1'=='张三'";
//        boolean result;
//        try {
//            result = ( Boolean)se.eval(str);
//            System.out.println(result);
//        } catch (ScriptException e) {
//            e.printStackTrace();
//        }

        //设置窗口基本属性
        frame.setVisible(true);
        frame.setLocation(x, y);
        frame.setSize(width,height);

        frame.setDefaultCloseOperation(Integer.parseInt(GetDefaultData.getWindowCloseWay(branchWindowName)));
        frame.setDefaultCloseOperation(Integer.parseInt(GetDefaultData.getWindowCloseWay(branchWindowName)));
    }
}

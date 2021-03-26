package com.functionalarea;

import javax.swing.*;
import java.awt.*;

/**
 * 创建中部功能区
 */
public class Center {
    public static void main(String[] args) {
    }

    /**
     * 传递窗口 以便功能区初始化各元素
     */
    static JFrame jFrame = null;
    public Center(JFrame jframe){
        jFrame = jframe;
    }

    public static Panel getCenterPanel() {
        return CenterPanel;
    }
    /**
     * 创建中部功能区
     */
    static Panel CenterPanel = null;

    public void createCenterFunctionalArea(){
        //初始化中部面板
        CenterPanel = new Panel();
        CenterPanel.setLayout(new FlowLayout());
        //加入主面板
        jFrame.add(CenterPanel);
        //加入元素
        addCenterElements(CenterPanel);
    }

    /**
     * 传递 TestArea 对象
     * @return TextArea target
     */
    public static TextArea getTextArea() {
        return textArea;
    }

    /**
     * 在中部功能区中加入元素
     * @param CenterPanel 中部功能区面板
     */
    static TextArea textArea = new TextArea();

    public void addCenterElements(Panel CenterPanel){
        //设置只读
        textArea.setEditable(false);

        CenterPanel.add(textArea);

    }
}

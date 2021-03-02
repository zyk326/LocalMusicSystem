package com.functionalarea;

import javax.swing.*;
import java.awt.*;

/**
 * 初始化左部功能区
 */
public class Left {
    public static void main(String[] args) {
    }

    /**
     * 传递窗口 以便功能区初始化各元素
     */
    static JFrame jFrame = null;
    public Left(JFrame jframe){
        jFrame = jframe;
    }

    /**
     * 创建左部功能区
     */
    public void createLeftFunctionalArea(){
        //初始化左部功能面板
        Panel LeftPanel = new Panel();
        //加入窗口
        jFrame.add(LeftPanel, BorderLayout.WEST);
        addLeftElements(LeftPanel);
    }

    /**
     * 在左部功能区中加入元素
     * @param LeftPanel 左部功能区面板
     */
    public void addLeftElements(Panel LeftPanel){
        //初始化左部--
        Button left_button_control = new Button();
        //加入按钮
        LeftPanel.add(left_button_control);
    }
}

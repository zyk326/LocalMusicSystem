package com.functionalarea;

import util.frame.MainButton;

import javax.swing.*;
import java.awt.*;

/**
 * 初始化顶部功能区
 */
public class Top {
    public static void main(String[] args) {
    }

    MainButton mainButton = new MainButton();


    /**
     * 传递窗口 以便功能区初始化各元素
     */
    static JFrame jFrame = null;
    public Top(JFrame jframe){
        jFrame = jframe;
    }

    /**
     * 创建顶部功能区
     */
    public void createTopFunctionalArea(){
        //初始化顶部面板
        Panel TopPanel = new Panel();
        //初始化顶部面板
//        mainPanel.createPannel("TopPanel" ,TopPanel);
        //加入主面板
        jFrame.add(TopPanel, BorderLayout.NORTH);
        //创建元素
        addTopElements(TopPanel);
    }

    /**
     * 在顶部功能区中加入元素
     * @param TopPanel 顶部功能面板
     */
    public void addTopElements(Panel TopPanel){
        //初始化顶部——我的音乐——按钮
        Button top_button_mymusic = new Button();
        //对该按钮赋属性
        mainButton.createButton("TopMyMusic", top_button_mymusic);
        //将按钮加入面板
        TopPanel.add(top_button_mymusic);
    }
}

package com;

import util.frame.MainButton;
import util.frame.MainFrame;
import util.frame.MainPanel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //实例各个元素
        MainFrame window = new MainFrame();
        MainPanel mainPanel = new MainPanel();
        MainButton mainButton = new MainButton();


        //定义or创建窗口主界面
        //实例化创建主窗口
        //创建窗口
        JFrame jFrame = new JFrame("本地音乐管理系统");
        //给窗口各项属性初始化
        window.createWindow("Main", jFrame);


        //初始化顶部面板
        Panel TopPanel = new Panel();
        //初始化顶部面板
//        mainPanel.createPannel("TopPanel" ,TopPanel);
        //加入主面板
        jFrame.add(TopPanel, BorderLayout.NORTH);

        //初始化底部面板
        Panel GroundPanel = new Panel();
        //初始化顶部面板
//        mainPanel.createPannel("GroundPanel" ,GroundPanel);
        //加入主面板
        jFrame.add(GroundPanel, BorderLayout.SOUTH);

        //初始化左部功能面板
        Panel LeftPanel = new Panel();
        //加入窗口
        jFrame.add(LeftPanel, BorderLayout.WEST);

        //初始化顶部面板
        Panel RightPanel = new Panel();
        //加入主面板
        jFrame.add(RightPanel, BorderLayout.EAST);

        //初始化中部面板
        Panel CenterPanel = new Panel();
        //加入主面板
        jFrame.add(CenterPanel);


        //初始化顶部——我的音乐——按钮
        Button top_button_mymusic = new Button();
        //对该按钮赋属性
        mainButton.createButton("TopMyMusic", top_button_mymusic);
        //将按钮加入面板
        TopPanel.add(top_button_mymusic);

        //初始化底部--控制台
        Button ground_button_control = new Button();
        //加入按钮
        GroundPanel.add(ground_button_control);

        //初始化左部--
        Button left_button_control = new Button();
        //加入按钮
        LeftPanel.add(left_button_control);

        //初始化右部--
        Button right_button_control = new Button();
        //加入按钮
        RightPanel.add(right_button_control);



//        Button b1 = new Button("上");
//        Button b2 = new Button("下");
//        Button b3 = new Button("左");
//        Button b4 = new Button("右");
//        Button b5 = new Button("中1");
//        Button b6 = new Button("中2");
//
//        JPanel j1 = new JPanel();
//        JPanel j2 = new JPanel();
//        JPanel j3 = new JPanel();
//        JPanel j4 = new JPanel();
//        JPanel j5 = new JPanel();
//
//        j1.add(b1);
//        j2.add(b2);
//        j3.add(b3);
//        j4.add(b4);
//        j5.add(b5, BorderLayout.WEST);
//        j5.add(b6, BorderLayout.EAST);
//
//        jFrame.add(j1, BorderLayout.NORTH);
//        jFrame.add(j2, BorderLayout.SOUTH);
//        jFrame.add(j3, BorderLayout.WEST);
//        jFrame.add(j4, BorderLayout.EAST);
//        jFrame.add(j5, BorderLayout.CENTER);

    }
}

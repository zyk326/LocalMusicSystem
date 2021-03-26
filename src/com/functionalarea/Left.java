package com.functionalarea;

import com.functionalarea.LeftWindow.AddElements;
import javafx.application.Application;
import javafx.stage.Stage;
import util.frame.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 初始化左部功能区
 */
public class Left implements ActionListener{
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


    static JButton jButton = new JButton("下载音乐");
    /**
     * 在左部功能区中加入元素
     * @param LeftPanel 左部功能区面板
     */
    public void addLeftElements(Panel LeftPanel){
        //初始化左部--
//        Button left_button_control = new Button();
////        //加入按钮
////        LeftPanel.add(left_button_control);


        LeftPanel.add(jButton);
        jButton.addActionListener(this);
    }

    boolean flag = true;

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if(cmd.equals("下载音乐") && flag){
//            flag  =false;
            System.out.println("已经创建过窗口！");
            MainFrame window = new MainFrame();
            //创建窗口
            JFrame jFrame = new JFrame("下载音乐");
            //给窗口各项属性初始化
            window.createWindow("DownloadMusic", jFrame);
            //加入窗口元素
            AddElements addElements = new AddElements();
            addElements.init(jFrame);
        }
    }

}

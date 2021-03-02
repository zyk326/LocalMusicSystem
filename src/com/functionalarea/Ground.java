package com.functionalarea;

import javax.swing.*;
import java.awt.*;

/**
 * 初始化底部功能区
 */
public class Ground {
    public static void main(String[] args) {
    }

    /**
     * 传递窗口 以便功能区初始化各元素
     */
    static JFrame jFrame = null;
    public Ground(JFrame jframe){
        jFrame = jframe;
    }

    /**
     * 创建底部功能区
     */
    public void createGroundFunctionalArea(){
        //初始化底部面板
        Panel GroundPanel = new Panel();
        //初始化底部面板
//        mainPanel.createPannel("GroundPanel" ,GroundPanel);
        //加入主面板
        jFrame.add(GroundPanel, BorderLayout.SOUTH);
        //创建元素
        addGroundElements(GroundPanel);
    }

    /**
     * 在底部功能区加入元素
     * @param GroundPanel 底部功能面板
     */
    public void addGroundElements(Panel GroundPanel){
        //初始化底部--控制台
        Button ground_button_control = new Button();
        //加入按钮
        GroundPanel.add(ground_button_control);
    }
}

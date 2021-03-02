package com.functionalarea;

import javax.swing.*;
import java.awt.*;

public class Right {
    public static void main(String[] args) {
    }

    /**
     * 传递窗口 以便功能区初始化各元素
     */
    static JFrame jFrame = null;
    public Right(JFrame jframe){
        jFrame = jframe;
    }

    /**
     * 创建右部功能区
     */
    public void createRightFunctionalArea(){
        //初始化右部面板
        Panel RightPanel = new Panel();
        //加入主面板
        jFrame.add(RightPanel, BorderLayout.EAST);
        //加入元素
        addRightElements(RightPanel);
    }

    /**
     * 在右部功能区加入元素
     * @param RightPanel 右部功能区面板
     */
    public void addRightElements(Panel RightPanel){
        //初始化右部--
        Button right_button_control = new Button();
        //加入按钮
        RightPanel.add(right_button_control);
    }
}

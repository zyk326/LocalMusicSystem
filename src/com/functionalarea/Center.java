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

    /**
     * 创建中部功能区
     */
    public void createCenterFunctionalArea(){
        //初始化中部面板
        Panel CenterPanel = new Panel();
        //加入主面板
        jFrame.add(CenterPanel);
        //加入元素
        addCenterElements(CenterPanel);
    }

    /**
     * 在中部功能区中加入元素
     * @param CenterPanel 中部功能区面板
     */
    public void addCenterElements(Panel CenterPanel){

    }
}

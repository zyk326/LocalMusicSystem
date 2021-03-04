package com;

import util.frame.MainFrame;
import util.frame.MainPanel;

import javax.swing.*;

import com.functionalarea.*;

public class Main {
    public static void main(String[] args) {
        //实例各个元素初始化类
        MainFrame window = new MainFrame();
        MainPanel mainPanel = new MainPanel();


        //创建窗口
        JFrame jFrame = new JFrame("本地音乐管理系统");
        //给窗口各项属性初始化
        window.createWindow("Main", jFrame);


        //初始化顶部功能区
        Top top = new Top(jFrame);
        top.createTopFunctionalArea();


        //初始化底部功能区
        Ground ground = new Ground(jFrame);
        ground.createGroundFunctionalArea();


        //初始化左部功能区
        Left left = new Left(jFrame);
        left.createLeftFunctionalArea();


        //初始化右部功能区
        Right right = new Right(jFrame);
        right.createRightFunctionalArea();


        //初始化中部功能区
        Center center = new Center(jFrame);
        center.createCenterFunctionalArea();

    }
}

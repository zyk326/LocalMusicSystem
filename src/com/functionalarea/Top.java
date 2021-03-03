package com.functionalarea;

import com.backstage.operating.Select;
import util.frame.MainButton;
import util.shareelements.GetElements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 初始化顶部功能区
 */
public class Top {
    public static void main(String[] args) {
    }

    //实例监听对象
    Listerens topListener = new Listerens();
    //实例按钮元素对象
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
        //给按钮添加监听
        top_button_mymusic.addActionListener(topListener);
    }
}

/**
 * 顶部功能区监听类
 */
class Listerens implements ActionListener{

    /**
     * 监听
     * @param e 按钮label
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        //获取按钮的label
        String cmd = e.getActionCommand();
        //实例化获取元素，启用此对象获取元素
        GetElements g = new GetElements();

        //如果按钮是--我的音乐--
        if(cmd.equals("我的音乐")){
            System.out.println("当前动作： 按下--" + cmd + "--");
            //利用g中方法获取top板块中TextArea元素
            g.GetTopElements(cmd);
            /**
             * 执行对应动作
             * 将音乐信息显示到窗口上
             */
            //GetElements.CenterTextArea.append("监听成功\n");
            //执行查询操作
            Select select = new Select();

            //获取hashmap中歌曲名称信息
            GetElements.CenterTextArea.setText(select.SelectIntoHashMap("select musicName, musicData from t_music").get("musicName").toString() + "\n");
        }
    }
}



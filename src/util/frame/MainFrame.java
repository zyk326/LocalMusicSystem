package util.frame;

import util.GetDefaultData;

import javax.swing.*;

public class MainFrame extends JFrame {
    public static void main(String[] args) {
    }

    //创建一个窗口

    /**
     * 创建一个窗口
     * @param name 窗口的title
     * @param branchWindowName 窗口的类型
     */
    public void createWindow(String name, String branchWindowName){
        JFrame frame = new JFrame(name);

        //从配置文件中获取该窗口的属性
        int x = Integer.parseInt(GetDefaultData.getLocationX(branchWindowName));
        int y = Integer.parseInt(GetDefaultData.getLocationY(branchWindowName));
        int width = Integer.parseInt(GetDefaultData.getWindowWight(branchWindowName));
        int height = Integer.parseInt(GetDefaultData.getWindowHeight(branchWindowName));

        //设置窗口基本属性
        frame.setVisible(true);
        frame.setLocation(x, y);
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

package util.frame;


import util.GetDefaultData;

import java.awt.*;

/**
 * 创建一个按钮
 */
public class MainButton {
    public static void main(String[] args) {
    }

    /**
     * 赋予按钮各项属性
     * @param button 一个按钮
     */
    public void createButton(String TypeOfButton, Button button){
        //给按钮赋予名字
        button.setLabel(GetDefaultData.getMyMusicButtonLabel("TopMyMusic"));
//      System.out.println(GetDefaultData.getMyMusicButtonLabel("TopMyMusic"));
        /**
         * 窗口按钮名字乱码解决方法
         * run - edit - VM options - 加入 -Dfile.encoding=gbk
         */

    }
}

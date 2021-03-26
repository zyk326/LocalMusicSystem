package util;

import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;

/**
 * 获取配置文件中各项信息
 */
public final class GetDefaultData {

    private GetDefaultData(){}

    public static void main(String[] args) {
    }

    public static String getSql() {
        sql = bun.getString("sql");
        return sql;
    }

    //获取基本sql
    static String sql = "";


    /**
     * 获取窗口的宽
     * @param windowName 窗口的类型名
     * @return
     */
    public static String getWindowHeight(String windowName) {
        WINDOWSIZEHEIGHT = bun.getString(windowName + "WINDOWSIZEHEIGHT");
        return WINDOWSIZEHEIGHT;
    }

    /**
     * 获取窗口的高
     * @param windowName 窗口的类型名
     * @return
     */
    public static String getWindowWight(String windowName) {
        WINDOWSIZEWIGHT = bun.getString(windowName + "WINDOWSIZEWIGHT");
        return WINDOWSIZEWIGHT;
    }

    /**
     *获取窗口的位置x轴值
     * @param windowName 窗口的类型名
     * @return
     */
    public static String getLocationX(String windowName) {
        LocationX = bun.getString(windowName + "LocationX");
        return LocationX;
    }

    /**
     *获取窗口的位置y轴值
     * @param windowName 窗口的类型名
     * @return
     */
    public static String getLocationY(String windowName) {
        LocationY  =bun.getString(windowName + "LocationY");
        return LocationY;
    }

    public static String getWindowCloseWay(String windowName){
        WindowCloseWay = bun.getString(windowName + "WindowCloseWay");
        return WindowCloseWay;
    }

    /**
     * 各项静态属性
     */
    //资源绑定器位置
    static ResourceBundle bun = ResourceBundle.getBundle("util/window");

    //窗口属性
    static String WINDOWSIZEHEIGHT = "";
    static String WINDOWSIZEWIGHT = "";
    static String LocationX = "";
    static String LocationY = "";
    static String WindowCloseWay = "";

    /**
     * 获取Url
     * @return
     */
    public static String getUrl() {
        url = bun.getString("url");
        return url;
    }

    /**
     * 获取user名
     * @return
     */
    public static String getUser() {
        user = bun.getString("user");
        return user;
    }

    /**
     * 获取password
     * @return
     */
    public static String getPassword() {
        password =bun.getString("password");
        return password;
    }

    //数据库连接属性
    static String url = "";
    static String user = "";
    static String password  ="";


    //获取panel 左上坐标
    public static String getTop_Left(String type) {
        TopPanelTop_Left = bun.getString(type + "Top_Left");
        return TopPanelTop_Left;
    }

    //获取panel右上坐标
    public static String getTop_Right(String type) {
        TopPanelTop_Right = bun.getString(type + "Top_Right");
        return TopPanelTop_Right;
    }

    //获取panel左下坐标
    public static String getGround_Left(String type) {
        TopPanelGround_Left = bun.getString(type + "Ground_Left");
        return TopPanelGround_Left;
    }

    //获取panel右下坐标
    public static String getGround_Right(String type) {
        TopPanelGround_Right = bun.getString(type + "Ground_Right");
        return TopPanelGround_Right;
    }

    //顶部panel
    static String TopPanelTop_Left = ""    ;
    static String TopPanelTop_Right = ""   ;
    static String TopPanelGround_Left = "" ;
    static String TopPanelGround_Right = "";




    public static String getMyMusicButtonLabel(String type) {
        try {
            //解决ResourceBundle中文乱码的问题
            String buf = new String(bun.getString(type + "ButtonLabel").getBytes("ISO-8859-1"), "UTF-8");
            myMusicButtonLabel = buf;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return myMusicButtonLabel;
    }

    //我的音乐按钮属性
    static String myMusicButtonLabel = "";

}
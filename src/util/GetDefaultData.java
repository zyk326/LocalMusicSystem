package util;

import java.util.ResourceBundle;

/**
 * 获取配置文件中各项信息
 */
public class GetDefaultData {

    public static void main(String[] args) {
    }

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


}
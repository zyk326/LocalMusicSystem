package util;

import java.sql.*;

/**
 * 数据库链接类
 */
public final class Conection {
    /**
     * 工具类必须将无参构造函数声明为私有
     */
    private Conection(){
    }

    /**
     * 静态块
     */
    static{
        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 建立连接
     * @param con 数据库连接对象
     * @throws SQLException 数据库错误抛出
     */
    /*public static Connection getConnection (Connection con) throws SQLException {
        String url = GetDefaultData.getUrl();
        String user = GetDefaultData.getUser();
        String password = GetDefaultData.getPassword();
        con = DriverManager.getConnection(url, user, password);
        return con;
    }*/

    /**
     * 关闭各种数据流
     * @param con 数据库连接对象
     * @param sta 数据库操作对象
     * @param res 结果集
     */
    public static void ReleaseConection(Connection con, Statement sta, ResultSet res){
        if(con!= null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(sta!=null){
            try {
                sta.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(res!=null){
            try {
                res.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

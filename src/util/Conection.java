package util;

import java.sql.*;

/**
 * 数据库链接类
 */
public class Conection {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String url = GetDefaultData.getUrl();
        String user = GetDefaultData.getUser();
        String password = GetDefaultData.getPassword();
        try {
            //建立连接
            con = DriverManager.getConnection(url, user, password);
            //开启通道
            //sql语句
            String sql = "select musicName, musicData from t_music";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()){
                System.out.println(rs.getString("musicName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            ReleaseConection(con, ps, rs);
        }
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

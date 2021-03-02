package com.backstage;

import util.Conection;
import util.GetDefaultData;

import java.sql.*;

import static util.Conection.ReleaseConection;

/**
 * 具体操作 -- 从数据库中查找数据
 */
public class selectfrommysql {
    public static void main(String[] args) {
    }

    /**
     * 查找操作
     * @return 返回的结果集
     */
    public ResultSet select(){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            //建立连接
            String url = GetDefaultData.getUrl();
            String user = GetDefaultData.getUser();
            String password = GetDefaultData.getPassword();
            con = DriverManager.getConnection(url, user, password);
            //开启通道
            //sql语句
            String sql = "select musicName, musicData from t_music";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            ReleaseConection(con, ps, rs);
        }
        return null;
    }
}

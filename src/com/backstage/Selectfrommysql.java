package com.backstage;

import util.GetDefaultData;

import javax.servlet.jsp.jstl.sql.Result;
import javax.servlet.jsp.jstl.sql.ResultSupport;

import java.sql.*;


import static util.Conection.ReleaseConection;

/**
 * 具体操作 -- 从数据库中查找数据
 */
public class Selectfrommysql {
    public static void main(String[] args) {
    }

    /**
     * 查找操作
     * @return 返回的结果集
     */
    public Result selectData(String sql){
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
            //String sql = "select musicName, musicData from t_music";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            /**
             * 连接数据库获取结果之后ResultSet和Connection都是要关闭的,一旦关闭这两者中的其中一个,rs就会变成空
             * 连接数据库的方法中将rs转成Result类型,才可以传递给别的函数使用
             */
            Result res = ResultSupport.toResult(rs);
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            ReleaseConection(con, ps, rs);
        }
        return null;
    }
}

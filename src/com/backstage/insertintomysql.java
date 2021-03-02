package com.backstage;

import util.Conection;
import util.GetDefaultData;

import java.io.*;
import java.sql.*;


/**
 * 具体操作 --插入数据到数据库
 */
public class insertintomysql {
    public static void main(String[] args) {
    }

    /**
     * 执行插入操作
     * @return 插入的数据条数
     */
    public int insert(){
        System.out.println("执行了插入语句");
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        InputStream is = null;
        try {
            //获取连接
            String url = GetDefaultData.getUrl();
            String user = GetDefaultData.getUser();
            String password = GetDefaultData.getPassword();
            con = DriverManager.getConnection(url, user, password);
            //建立通道
            String sql = "insert into t_music (musicName, musicData) values(?, ?)";
            ps = con.prepareStatement(sql);
            //执行sql
            ps.setString(1, "她说");


            File file = new File("E:\\Code\\Java\\documents\\谭晶 - 赤伶.m4a");
            is = new FileInputStream(file);
            ps.setBlob(2, is);

            int insertnum = ps.executeUpdate();
            System.out.println(insertnum);
            return insertnum;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conection.ReleaseConection(con, ps, res);
            try {
                if(is != null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}

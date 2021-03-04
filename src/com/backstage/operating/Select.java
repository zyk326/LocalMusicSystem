package com.backstage.operating;

import com.backstage.Selectfrommysql;
import util.operating.select.ParsingResult;
import util.io.putIOStreamToPath;

import javax.servlet.jsp.jstl.sql.Result;
import java.io.*;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 查找类
 */
public class Select {
    //本地结果集，存放查找结果
    static Result res = null;
    static HashMap<String , List<Object>> columnsData = new HashMap<>();

    public static void main(String[] args) {
//        String sql = "select musicName, musicData from t_music";
//        SelectIntoHashMap(sql);
    }


    /**
     * 构造函数，直接查找
     * @param sql sql语句
     */
    public HashMap<String, List<Object>> SelectIntoHashMap(String sql) {

        System.out.println("--执行查询操作--");
        Selectfrommysql selectfrommysql = new Selectfrommysql();
        /**
         * 实例查找方法，传入sql语句参数，获取结果集，使用工具类解析结果集
         */
        //调用查询方法，得到本地结果集
        res = selectfrommysql.selectData(sql);
        //得到转换成hashmap的字段数据
        HashMap<String, List<String>> resuleFieldData = ParsingResult.getDataFromResult(res, sql);
        /**
         * 遍历hashmap
         */
        for (Map.Entry<String, List<String>> entry : resuleFieldData.entrySet()
        ) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        /**
         * 打印结果
         */
        //使用hashmap字段名数量和本地结果集 遍历
        /**
         * 将结果规范化放入一个新的hashmap  columnsData
         */

        if (res.getRowCount() != 0) {
            /**
             * 进入循环
             */
            for(int j = 0; j < resuleFieldData.get("Columns").size(); j++){
                System.out.println();
                /**
                 * 遍历字段数据
                 * 在columnsData中加入字段名
                 */
                //创建这个字段的链表
                List<Object> buf = new ArrayList<>();
                /**
                 * 遍历该字段数据
                 */
                for (int i = 0; i < res.getRowCount(); i++) {
                    /**
                     * 遍历本地结果集数据
                     */
//                    String columnName = (String) res.getRowsByIndex()[i][j];
                    if (res.getRowsByIndex()[i][j] instanceof String){
                        System.out.print("String  ");
                        /**
                         * 这个元素是String类型
                         */
                        String columnName = (String) res.getRowsByIndex()[i][j];
                        //加入链表
                        buf.add(columnName);
                        System.out.print(columnName + "  --  ");
                    }/*
                    //不会是Blob类型
                    else if (res.getRowsByIndex()[i][j] instanceof Blob){
                        System.out.println("Blob  ");
                        *//**
                         * 此处放上对Blob的处理
                         *//*
                        Blob blob = (Blob)res.getRowsByIndex()[i][j];
                        //加入链表
                        buf.add(blob);
                    }*/else {
                        System.out.println("这是二进制数据流");
                        /**
                         * 对二进制流进行处理
                         */
                        putIOStreamToPath.getIoStream(res.getRowsByIndex()[i][j]);
                    }
                }
                /**
                 * 加入columnsData HashMap
                 */
                columnsData.put(resuleFieldData.get("Columns").get(j),buf);
            }
        }
        /**
         * 打印 查看哈希map中数据
         */
        for (Map.Entry<String, List<Object>> entry : columnsData.entrySet()
        ) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        return columnsData;
        /**
         * 使用ResultSet 出现错误
         */
        /*

         */


        /**
         * 结果集配合hashmap得到数据
         */ /*
        try {
            for (int i = 0; i < resuleSetData.get("columns").size(); i++){
                while(res.next()){
                    System.out.println(res.getString(resuleSetData.get("columns").get(i)));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if(res != null){
                    res.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/

    }
}

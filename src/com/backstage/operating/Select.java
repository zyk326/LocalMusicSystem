package com.backstage.operating;

import com.backstage.Selectfrommysql;
import util.io.putIOStreamToPath;
import util.operating.select.ParsingResult;

import javax.servlet.jsp.jstl.sql.Result;
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

    public static HashMap<String, List<Object>> getColumnsData() {
        return columnsData;
    }

    static HashMap<String , List<Object>> columnsData = new HashMap<>();

    public static List<Object> getMusicdata() {
        return musicdata;
    }

    //歌曲data链表
    static List<Object> musicdata = new ArrayList<>();

    public static void main(String[] args) {}

    public static Result getRes() {
        return res;
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
                    if (res.getRowsByIndex()[i][j] instanceof String){
                        System.out.print("String  ");
                        /**
                         * 这个元素是String类型
                         */
                        String columnName = (String) res.getRowsByIndex()[i][j];
                        //加入链表
                        buf.add(columnName);
                        System.out.println(columnName + "  --  ");

                    }else {
                        System.out.println("这是二进制数据流");
                        /**
                         * 对二进制流进行处理
                         */
                        //直接下载到本地了
                        //putIOStreamToPath.getIoStream(res.getRowsByIndex()[i][j]);
                        //加装成一个链表
                        musicdata.add(res.getRowsByIndex()[i][j]);
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
    }
}

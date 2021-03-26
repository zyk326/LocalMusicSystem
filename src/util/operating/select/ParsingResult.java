package util.operating.select;

import javax.servlet.jsp.jstl.sql.Result;
import java.sql.Blob;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import java.util.ArrayList;
import java.util.List;

/**
 * 工具类，解析结果集
 */
public class ParsingResult {
    public static void main(String[] args) {
        /**
         * 遍历hashmap
         */
        /*HashMap<String, String> hash = new HashMap<>();
        hash .put("name", "她说");
        hash .put("data", "0x0000");
        hash .put("singer", "林俊杰");
        for(Map.Entry<String, String> entry: hash.entrySet()){
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }*/

        /*HashMap<String, List<Object>> jjj = new HashMap<>();
        List<Object> j = new ArrayList<>();
        j.add("df");
        j.add(1);*/
    }

    /**
     * 私有构造函数
     */
    private ParsingResult(){}

    /**
     * 从结果集中获取数据
     * @param res 结果集
     * @param sql Sql语句
     * @return resultFieldData 结果集字段数据
     */
    public static HashMap<String,List<String>> getDataFromResult(Result res, String sql){
        /**
         * 从sql中解析出字段名
         * 按照字段名，返回结果集中对应数据
         * TableName 表名
         * Columns 字段名
         */
        HashMap<String, List<String>> resultFieldData = new HashMap<>();
        //从sql中解析字段名
        /*select musicName, musicData from t_music*/
        //实例化
        SQLUtils sqlUtils = new SQLUtils();
        //获取各字段和表名
        List<String> tableName = new ArrayList<>();
        tableName.add(sqlUtils.getTBname(sql));
        List<String> columns = sqlUtils.getColumns(sql);

        //将信息输入hashmap
        resultFieldData.put("TableName", tableName);
        resultFieldData.put("Columns", columns);
        return resultFieldData;


    }
}

/**
 * 获取sql字段
 */
 class SQLUtils {

    /**
     * 获取字段名
     * @param querysql 查询语句
     * @return 字段名表
     */
    public List<String> getColumns(String querysql){
        List<String> column = new ArrayList<>();
        String tmp = querysql.substring(querysql.indexOf("select") + 6,
                querysql.indexOf("from")).trim();
        if (tmp.indexOf("*") == -1){
            String cols[] = tmp.split(",");
            for (String c:cols){
                column.add(c);
            }
        }
        return column;
    }

    /**
     * 获取表名
     * @param querysql 查询语句
     * @return 表名
     */
    public String getTBname(String querysql){
        String tmp = querysql.substring(querysql.indexOf("from")+4).trim();
        int sx = tmp.indexOf(" ");
        if(sx == -1){
            return tmp;
        }else {
            return tmp.substring(0,sx);
        }
    }

}

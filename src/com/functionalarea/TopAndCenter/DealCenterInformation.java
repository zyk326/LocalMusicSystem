package com.functionalarea.TopAndCenter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 将数据格式化输出到center TextArea
 */
public class DealCenterInformation {
    public static void main(String[] args) {
    }

    private DealCenterInformation(){}



    public static String FormatData(HashMap<String, List<Object> > dataMap){
        List<String> cloumns = new ArrayList<>();
        String [][] data = new String[99999][50];
        System.out.println("进入数据格式化处理");
        System.out.println("**********");
        String formatData = "";

        /**
         * 获得字段名
         */
        for (Map.Entry<String, List<Object>> entry: dataMap.entrySet()
             ) {
            if(!entry.getKey().equals(" musicData")){
                cloumns.add(entry.getKey());
                System.out.print(entry.getKey() + "  ");
            }
        }
        System.out.println();

        for(int i = 0; i < cloumns.size(); i++){
            data[0][i] = cloumns.get(i);
            for(int j = 0; j < dataMap.get(cloumns.get(i)).size(); j++){
                ArrayList<Object> buf = (ArrayList<Object>)dataMap.get(cloumns.get(i));
                String temp = (String)buf.get(j);
                data[j+1][i] = temp;
            }
        }

        for (int i = 0; i <= dataMap.get("musicName").size(); i++){
            for (int j = cloumns.size() - 1; j >= 0 ; j--){
                if(i == 0 || data[i][j].length() <= 5){
                    formatData += data[i][j] + "\t\t\t";
                }else {
                    if (data[i][j].length() > 5 && data[i][j].length() <= 10) {
                        formatData += data[i][j] + "\t\t";
                    }else{
                        formatData += data[i][j] + "\t";
                    }
                }
                System.out.print(data[i][j] + "\t\t");
            }
            System.out.println();
            formatData += "\n";
        }
        System.out.println("**********");
        return formatData;
    }
}

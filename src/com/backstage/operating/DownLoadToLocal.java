package com.backstage.operating;

import util.GetDefaultData;
import util.io.putIOStreamToPath;
import util.shareelements.GetElements;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 将音乐 下载到本地
 * 基于两个内容
 */
public class DownLoadToLocal {
    public static HashMap<String, List<Object>> columnsData = GetElements.getMusicColumnsData();
    public static java.util.List<Object> musicdata = GetElements.getMusicdata();

    public static void main(String[] args) {



//        for(int i = 0; i < columnsData.get("musicName"); i++){
//            putIOStreamToPath.getIoStream();
//        }

    }

    public void load(){
        System.out.println("------------进入下载--------------");
        Select select = new Select();
        String sql = GetDefaultData.getSql() + " where musicName like ";
        String musicname = GetElements.getJt().getText();
        String path = GetElements.getJt1().getText();
        select.SelectIntoHashMap(sql + "'"+ musicname + "'");
        musicdata = GetElements.getMusicdata();
        columnsData = GetElements.getMusicColumnsData();

        System.out.println("-----------查看歌曲元素列表-------------");
        for (Map.Entry<String, List<Object>> entry: columnsData.entrySet()
             ) {
            System.out.println(entry.getKey() + "    " + entry.getValue());
        }
        System.out.println(" ----------------------- ");


        //开始写入本地
        for(int i = 0; i < columnsData.get("musicName").size(); i++){
            String suffix = (String)columnsData.get(" suffix").get(i);
            putIOStreamToPath.getIoStream(musicdata.get(i), path, musicname, suffix);
        }
    }
}
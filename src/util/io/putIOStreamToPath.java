package util.io;

import java.io.*;

/**
 * 工具类 将二进制文件放入路径
 */
public class putIOStreamToPath {
    public static void main(String[] args) {
    }

    private putIOStreamToPath(){}

    //此路径由交互界面用户指定
    static String path = "E:\\DevelopEnvirments\\Java\\test\\elements\\test.mp3";

    /**
     *
     * @param binaryStream 存储歌曲信息的Object形式的二进制数据流流
     */
    public static void getIoStream(Object binaryStream){
        /**
         * 将Object转成二进制数组
         * 再将数组写入文件
         */
        FileOutputStream f = null;
        ByteArrayOutputStream byt = null;
        ObjectOutputStream obj = null;
        try {
            byt = new ByteArrayOutputStream();

            obj = new ObjectOutputStream(byt);

            obj.writeObject(binaryStream);

            byte[] bytes=byt.toByteArray();

            System.out.println(bytes.length);

            File file = new File(path);

            f = new FileOutputStream(file);

            f.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                f.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                obj.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                byt.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

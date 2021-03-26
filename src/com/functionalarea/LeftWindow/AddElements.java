package com.functionalarea.LeftWindow;

import com.backstage.operating.DownLoadToLocal;
import util.frame.MainFrame;
import util.shareelements.GetElements;

import javax.swing.*;
import javax.xml.soap.Text;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 给下载窗口添加必要的元素
 */
public class AddElements implements ActionListener {
    public static void main(String[] args) {
    }


    JPanel jp = new JPanel();

    public static JTextField getJt1() {
        return jt1;
    }

    static JTextField jt1 = new JTextField(40);

    public static JTextField getJt() {
        return jt;
    }

    static JTextField jt = new JTextField(50);
    public void init(JFrame jFrame){

        JButton jb = new JButton("输入你要下载的音乐名称：");
        jb.setEnabled(false);

        JButton jb1 = new JButton("选择你的下载路径：");
        jb1.setEnabled(false);
        JButton jb2 = new JButton("选择路径");
        jt1.setEnabled(false);
        jb2.addActionListener(this);

        JButton jb3 = new JButton("下载");
        jb3.addActionListener(this);

        jFrame.add(jp);
        jp.add(jb, BorderLayout.NORTH);
        jp.add(jt);
        jp.add(jb1, BorderLayout.CENTER);
        jp.add(jt1);
        jp.add(jb2);
        jp.add(jb3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if(cmd.equals("选择路径")){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int intRetVal = fileChooser.showOpenDialog(jp);

            if( intRetVal == JFileChooser.APPROVE_OPTION){
                jt1.setText(fileChooser.getSelectedFile().getPath());
            }
        }else if(cmd.equals("下载")){
            String path = jt1.getText();
            if(path.equals("")){
                MainFrame window = new MainFrame();
                JFrame jf = new JFrame("文件夹路径为空！");
                window.createWindow("matter", jf);
            }else{
                /**
                 * 这里放下载方法
                 */

                DownLoadToLocal dlt = new DownLoadToLocal();
                dlt.load();
                System.out.println("下载按钮被点击!");
            }
        }

    }
}

package util.elements.centerelements;


import util.io.putIOStreamToPath;
import util.shareelements.GetElements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonAndJTextField {
    public static void main(String[] args) {
    }

    private ButtonAndJTextField(){}

    static Button button = null;
    static JTextField jtf = null;

    public static void createButtonAndJTextField(Panel CenterPanel, String musicName){
        button = new Button("转存到本地");
        jtf = new JTextField();
        jtf.setText(musicName);
        jtf.setEnabled(false);
        CenterPanel.add(jtf);
        CenterPanel.add(button);
    }
}

class CopyToLocal implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if(cmd.equals("转存到本地")){
            putIOStreamToPath.getIoStream(GetElements.GetResult().get);
        }
    }
}

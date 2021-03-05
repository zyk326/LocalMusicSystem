package util.elements.centerelements.top;

import util.elements.centerelements.ButtonAndJTextField;
import util.shareelements.GetElements;

import java.awt.*;
import java.util.HashMap;
import java.util.List;

public class createButtonAndField {
    public static void main(String[] args) {
    }

    private createButtonAndField(){}

    public static void addMusicElements(HashMap<String, List<Object>> musicData, Panel p){
        for(int i = 0; i < musicData.get("musicName").size(); i++){
            ButtonAndJTextField.createButtonAndJTextField(p, (String)musicData.get("musicName").get(i));
        }
    }
}

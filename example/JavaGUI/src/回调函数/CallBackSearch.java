package 回调函数;

import javax.swing.*;
import java.awt.*;
import java.awt.desktop.ScreenSleepEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class CallBackSearch implements ActionListener {
    public HashMap<Integer, Integer> hasMap;
    public HashSet<Integer> hashSet;
    public ArrayList<Integer> arrayList;
    public TextField sno;
    public JTextArea txt;
    public CallBackSearch(HashMap<Integer, Integer> hasMap, HashSet<Integer> hashSet,
                          ArrayList<Integer> arrayList,TextField sno,JTextArea txt){
        this.hashSet=hashSet;
        this.hasMap=hasMap;
        this.arrayList=arrayList;
        this.sno=sno;
        this.txt=txt;
    }
    public void actionPerformed(ActionEvent e){

        txt.setText(null);
        String stringsno=sno.getText();
        int intsno=Integer.parseInt(stringsno);

        Iterator<Map.Entry<Integer,Integer>> iterator =hasMap.entrySet().iterator();
        while(iterator.hasNext()){

            Map.Entry<Integer,Integer> entry =iterator.next();
            if(intsno==entry.getKey())
            {
                System.out.println("key="+entry.getKey()+"    val="+entry.getValue());
                String t="学生学号：  "+entry.getKey()+"   学生成绩：  "+entry.getValue()+"\n";
                txt.append(t);
            }
        }
        sno.setText("");
    }
}

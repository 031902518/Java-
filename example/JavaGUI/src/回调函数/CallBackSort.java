package 回调函数;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class CallBackSort implements ActionListener {
    public HashMap<Integer, Integer> hasMap;
    public HashSet<Integer> hashSet;
    public ArrayList<Integer> arrayList;
    public JTextArea txt;
    public CallBackSort(HashMap<Integer, Integer> hasMap, HashSet<Integer> hashSet,
                          ArrayList<Integer> arrayList,JTextArea txt){
        this.hashSet=hashSet;
        this.hasMap=hasMap;
        this.arrayList=arrayList;
        this.txt=txt;
    }
    public void actionPerformed(ActionEvent e){
        txt.setText(null);
        for(int j=0;j<arrayList.size();j++){
            for(int k=j+1;k<arrayList.size();k++){
                int tmpj= arrayList.get(j);
                int tmpk=arrayList.get(k);
                int tempj=hasMap.get(tmpj);
                int tempk=hasMap.get(tmpk);
                if(tempj<tempk){
                    arrayList.set(k, tmpj);
                    arrayList.set(j, tmpk);
                }
            }
        }
        for(int i=0;i<arrayList.size();i++){
            int tempsno=arrayList.get(i);
            int tempgrade=hasMap.get(tempsno);
            String str="学生学号： "+tempsno+"学生成绩： "+tempgrade+"\n";
            txt.append(str);
        }
    }
}

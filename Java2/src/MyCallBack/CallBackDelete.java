package MyCallBack;

import MyThing.myThing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CallBackDelete implements ActionListener {
    public ArrayList<myThing> arrayList;
    public JTable table;
    public CallBackDelete(ArrayList<myThing> arrayList,JTable jTable){
        this.arrayList=arrayList;
        this.table=jTable;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultTableModel defaultModel = (DefaultTableModel) table.getModel();
        int rowCount=defaultModel.getRowCount()-1;
        System.out.println(rowCount+"<——删除的");
        if(rowCount>=0){
            defaultModel.removeRow(rowCount);
            defaultModel.setRowCount(rowCount);
        }
        table.revalidate();//最后这一个方法一定不要忘记，否则可能导致表格内容没有更新。
        arrayList.remove(rowCount);
        for(int i=0;i<arrayList.size();i++){
            arrayList.get(i).no=i+1;
        }
        CallBackInsert.no--;
    }
}

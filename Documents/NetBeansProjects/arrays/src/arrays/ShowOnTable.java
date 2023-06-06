/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Student
 */
public class ShowOnTable {
    public static void showMatrix(int[][] array, JTable jTable){
         DefaultTableModel tm; // модель таблицы по умолчанию
        tm = (DefaultTableModel) jTable.getModel();
        tm.setColumnCount(array[0].length);
        for (int i = tm.getRowCount() - 1; i >= 0; i--) {
            tm.removeRow(i);
        }
        jTable.setModel(tm);
        
        for (int[] a : array) {
            Vector<Integer> v = new Vector<Integer>();
            for (int i = 0; i < a.length; i++) {
                v.addElement(a[i]);
            }
            tm.addRow(v);
        }
    }
    
    public static void showMatrix(String[][] array, JTable jTable){
         DefaultTableModel tm; // модель таблицы по умолчанию
        tm = (DefaultTableModel) jTable.getModel();
        tm.setColumnCount(array[0].length);
        for (int i = tm.getRowCount() - 1; i >= 0; i--) {
            tm.removeRow(i);
        }
        jTable.setModel(tm);
        
        for (String[] a : array) {
            Vector<String> v = new Vector<String>();
            for (int i = 0; i < a.length; i++) {
                v.addElement(a[i]);
            }
            tm.addRow(v);
        }
    }
}

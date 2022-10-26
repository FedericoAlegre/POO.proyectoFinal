/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final.Views;

import javax.swing.table.AbstractTableModel;
import proyecto_final.controllers.RellenoController;

/**
 *
 * @author fedea
 */
public class RellenoTableModel extends AbstractTableModel{

    @Override
    public int getRowCount() {
        RellenoController r = new RellenoController();
        return r.getRellenoList().size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RellenoController r = new RellenoController();
        switch(columnIndex){
            case 0:
                return r.getRellenoList().get(rowIndex).getId();
            case 1: 
                return r.getRellenoList().get(rowIndex).getNombre();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        String[] nombres = {"ID", "Nombre"};
        return nombres[columnIndex];
    }
}

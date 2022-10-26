/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final.Views;

import javax.swing.table.AbstractTableModel;
import proyecto_final.controllers.SalsaController;

/**
 *
 * @author fedea
 */
public class SalsaTableModel extends AbstractTableModel {

    @Override
    public int getRowCount() {
        SalsaController s = new SalsaController();
        return s.getSalsaList().size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SalsaController s = new SalsaController();
        switch (columnIndex) {
            case 0:
                return s.getSalsaList().get(rowIndex).getId();
                //return a.listar().get(rowIndex).getId();
            case 1:
                return s.getSalsaList().get(rowIndex).getNombre();
            default:
                return s.getSalsaList().get(rowIndex).getPicor();
        
        }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        String[] nombres = {"ID", "Nombre", "Picor"};
        return nombres[columnIndex];
    }
    
}

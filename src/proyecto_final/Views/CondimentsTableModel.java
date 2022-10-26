/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final.Views;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import proyecto_final.Models.Tortilla;
import proyecto_final.controllers.TortillaController;

/**
 *
 * @author fedea
 */
public class CondimentsTableModel extends AbstractTableModel {

    @Override
    public int getRowCount() {
        TortillaController t = new TortillaController();
        try {
            return t.getTortillaList().size();
        } catch (Exception ex) {
            Logger.getLogger(CondimentsTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        TortillaController t = new TortillaController();
        List<Tortilla> ts;
        try {
            ts = t.getTortillaList();
            switch (columnIndex) {
            case 0:
                return ts.get(rowIndex).getId();
                //return a.listar().get(rowIndex).getId();
            case 1:
                return ts.get(rowIndex).getNombre();
            default:
                return null;
        }
        } catch (Exception ex) {
            Logger.getLogger(CondimentsTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        String[] nombres = {"ID", "Nombre"};
        return nombres[columnIndex];
    }
}

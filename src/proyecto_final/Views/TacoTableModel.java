package proyecto_final.Views;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import proyecto_final.Models.Taco;
import proyecto_final.Models.TacoState;
import proyecto_final.controllers.TacoController;

public class TacoTableModel extends AbstractTableModel {

    String query;
    TacoState estado;

    public TacoTableModel(String s, TacoState e) {
        this.query = s;
        this.estado = e;
    }

    public TacoTableModel() {
        this.query = "Tacos";
        this.estado = TacoState.Pedido;
    }

    @Override
    public int getRowCount() {
        TacoController t = new TacoController();
        return t.getTacoList(this.query, this.estado).size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TacoController t = new TacoController();
        List<Taco> tl = t.getTacoList(this.query, this.estado);
        switch (columnIndex) {
            case 0:
                return tl.get(rowIndex).getId();
            case 1:
                return tl.get(rowIndex).getTortilla().getNombre();
            case 2:
                return tl.get(rowIndex).getRelleno1().getNombre();
            case 3:
                if (tl.get(rowIndex).getRelleno2() != null) {
                    return tl.get(rowIndex).getRelleno2().getNombre();
                } else {
                    return " - ";
                }
            case 4:
                if (tl.get(rowIndex).getRelleno3() != null) {
                    return tl.get(rowIndex).getRelleno3().getNombre();
                } else {
                    return " - ";
                }
            case 5:
                return tl.get(rowIndex).getSalsa().getNombre();
            case 6:
                return tl.get(rowIndex).getState();
            case 7:
                return tl.get(rowIndex).getDate().toString();
            default:
                return null;

        }

    }

    @Override
    public String getColumnName(int columnIndex) {
        String[] nombres = {"ID", "Tortilla", "Relleno 1", "Relleno 2", "Relleno 3", "Salsa", "Estado", "Fecha"};
        return nombres[columnIndex];
    }

}

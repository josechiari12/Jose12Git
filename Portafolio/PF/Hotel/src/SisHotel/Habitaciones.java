package SisHotel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Habitaciones extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTable table1;

    public Habitaciones() {
        setContentPane(contentPane);
        setSize(300, 400);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
        Object[][] datos = {
{"Juan", new Integer(25), new Boolean(false)},
{"Sonia", new Integer(33), new Boolean(true) },
{"Pedro", new Integer(42), new Boolean(false)},
};
String[] columnNames = {"Nombre","Años","Apto",};


// Agregar nueva columna
      //  table1.addColumn(columnNames);
String[] columnaNueva1= {"vago","diestro","normal",};
//table1.addColumn("Tipo",columnaNueva1);
// Agregar nueva fila
Object[] newRow={"Maria",new Integer(55),new Boolean(false)};
//table1.addRow(newRow);
// Modificar celda especifica
//table1.setValueAt("XXX", 3, 3); // Row/Col


}

    private void onOK() {
        // add your code here
        dispose();
    }

    public static void main(String[] args) {
        Habitaciones dialog = new Habitaciones();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}

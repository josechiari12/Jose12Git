package SisHotel;

import javax.swing.*;
import java.awt.event.*;

public class Preferncia_d extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JPanel Titulo;
    private JTextField textField1;
    private JRadioButton rbtn1;
    private JRadioButton rbtn2;
    private JRadioButton rbtn3;
    private JRadioButton rbtn4;
    private JCheckBox chbox1;
    private JCheckBox chbox2;
    private JCheckBox chbox3;
    private JTextField fecha1;
    private JTextField fecha2;
    private JButton buscar;
    private JEditorPane editorPane1;
    private  String habitacion = " ";
    private  String servicio = " ";
    public static String newlines= System.getProperty("line.separator");
    public Preferncia_d() {

        setTitle("Reserva de Habitaciones");
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        setSize(800, 400);
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(rbtn1);
        grupo1.add(rbtn2);
        grupo1.add(rbtn3);
        grupo1.add(rbtn4);
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        if ( textField1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el nombre");
            textField1.requestFocus();
            return;
        }
        if  (!rbtn1.isSelected() && !rbtn2.isSelected()  &&  !rbtn3.isSelected() &&  !rbtn4.isSelected() ){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de habitación");
            return;
        }

        if ( fecha1.getText().equals("") )  {
            JOptionPane.showMessageDialog(null, "Debe ingresar fecha inicial");
            fecha1.requestFocus();
            return;
        }
        if ( fecha2.getText().equals("") )  {
            JOptionPane.showMessageDialog(null, "Debe ingresar fecha final");
            fecha2.requestFocus();
            return;
        }


        if(rbtn1.isSelected()){
           habitacion = rbtn1.getText();
        }
        if(rbtn2.isSelected()){
            habitacion = rbtn2.getText();
        }
        if(rbtn3.isSelected()){
            habitacion = rbtn3.getText();
        }
        if(rbtn4.isSelected()){
            habitacion = rbtn4.getText();
        }

        if(chbox1.isSelected()){
            servicio = chbox1.getText();
        }
        if(chbox2.isSelected()){
            servicio = chbox2.getText();
        }
        if(chbox3.isSelected()){
            servicio = chbox3.getText();
        }

        Escribir escribe = new Escribir();
        escribe.escribir(textField1.getText() +  ", ");
        escribe.escribir(habitacion+  ", ");
        escribe.escribir(servicio+  ", ");
        escribe.escribir(fecha1.getText()+  ", ");
        escribe.escribir(fecha2.getText());
        escribe.escribir(newlines);
        JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        Preferncia_d dialog = new Preferncia_d();
        dialog.pack();
        dialog.setVisible(true);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

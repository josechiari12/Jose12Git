package SisHotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Makubex on 14/12/2016.
 */
public class Ventana1 extends JFrame{
    private JPanel panel1;
    private JButton Reserva;
    private JButton Listar;
    private JButton ver;
    private JLabel Titulo;
    private JButton Salir;
    private boolean opc = true ;

    public Ventana1() {
        Salir.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

           System.exit(0);
            }
        });
        Reserva.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {
                Preferncia_d Preferenciav = new Preferncia_d();
                   Preferenciav.setLocationRelativeTo(null);
                   Preferenciav.setVisible(true);

            }
        });
        ver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Habitaciones habitav = new Habitaciones();
                habitav.setLocationRelativeTo(null);
                habitav.setVisible(true);
            }
        });
    }

    public static void main(String[] args){

        JFrame frame  = new JFrame("SisHotel") ;
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Ventana1().panel1);
        new Ventana1().Reserva.setSize(100,120);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }




    }

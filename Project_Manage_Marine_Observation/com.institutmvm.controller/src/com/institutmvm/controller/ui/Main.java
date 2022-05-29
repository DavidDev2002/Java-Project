package com.institutmvm.controller.ui;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        /**
         * Defimimos las opciones del menú desplegable
         */
        String[] especies = {"Pajaro","Pez","Tiburón"};

        JComboBox selector = new JComboBox(especies);

        JPanel panel = new JPanel(new GridLayout(1, 1));
        panel.add(selector);

        int x = JOptionPane.showConfirmDialog(null, panel, "Tipo",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (x == JOptionPane.OK_OPTION) {
            System.out.println("OK");
            System.out.println(selector.getSelectedItem());

        } else {
            System.out.println("Cancel");
        }
        /**
         * Selector que nos permite tener diferentes formularios
         */
        if (x == JOptionPane.OK_OPTION) {
            TiposEspecie forms = new TiposEspecie();

            switch (selector.getSelectedItem().toString()) {

                case "Pajaro":
                    TiposEspecie.EspeciePajaro();
                    break;
                case "Pez":
                    TiposEspecie.EspeciePez();
                    break;
                case "Tiburón":
                    TiposEspecie.EspecieTiburon();
                    break;
                default:
                    break;
            }
            JOptionPane.showMessageDialog(null, "Accion Completada :)",
                    "Ending", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("Cancelado");
        }
    }
}

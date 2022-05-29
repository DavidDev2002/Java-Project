package com.institutmvm.controller.ui;

import javax.swing.*;
import cat.institutmvm.applicacio.entities.Pajaro;

import java.awt.*;

public class TiposEspecie {

    private static JRadioButton bool_T, bool_F;
    private static JTextField habitat = new JTextField();
    private static JTextField tiempoNavegacion = new JTextField();
    private static JTextField horaLlegada = new JTextField();
    private static JTextField viento = new JTextField();
    private static JTextField nubosidad = new JTextField();
    private static JTextField tamano = new JTextField();
    private static JTextField embarcacionces = new JTextField();
    private static JTextField especie = new JTextField();

    /**
     * Panel Principal en el que nos basamos para los otros formularios
     */
    public static JPanel EstandartEspecie(int rows, int cols){
        JPanel panelEs = new JPanel(new GridLayout(rows, cols));

        panelEs.add(new JLabel("Especie"));
        panelEs.add(especie);

        panelEs.add(new JLabel("Habitat "));
        panelEs.add(habitat);

        panelEs.add(new JLabel("Tiempo de navegacion "));
        panelEs.add(tiempoNavegacion);

        String[] genero_P = {"Maculino", "Femenino","Undefined"};
        panelEs.add(new JLabel("Genero "));
        JComboBox selector1 = new JComboBox(genero_P);
        panelEs.add(selector1);

        panelEs.add(new JLabel("Hora de llegada "));
        panelEs.add(horaLlegada);

        panelEs.add(new JLabel("Tamaño "));
        panelEs.add(tamano);

        panelEs.add(new JLabel("Viento "));
        panelEs.add(viento);

        panelEs.add(new JLabel("Nubosidad "));
        panelEs.add(nubosidad);

        String[] viento_P = {"Norte", "Sur", "Este", "Oeste"};
        panelEs.add(new JLabel("Direccion del viento "));
        JComboBox selector2 = new JComboBox(viento_P);
        panelEs.add(selector2);;

        panelEs.add(new JLabel("Embarcaciones "));
        panelEs.add(embarcacionces);

        return panelEs;
    }

    /**
     * Funcion que genera un formulario para introducir datos de Pajaros
     */
    public static void EspeciePajaro(){

        JPanel panelP = EstandartEspecie(6,2);

        panelP.add(new JLabel("Parasitos "));
        panelP.add(Box.createRigidArea(new Dimension(30,10)));

        bool_T = new JRadioButton("Sí ");
        bool_F = new JRadioButton("No ");

        bool_T.addChangeListener(l -> {
            if (bool_T.isSelected()) {
                bool_F.setSelected(false);
            }
        });
        panelP.add(bool_T);

        bool_F.addChangeListener(l -> {
            if (bool_F.isSelected()) {
                bool_T.setSelected(false);
            }
        });
        panelP.add(bool_F);

        /**
         * Función con la que comprobamos si hay campos vacíos
         */

        int nextWindow = JOptionPane.showConfirmDialog(null, panelP, "Datos de un Pajaro",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (nextWindow == JOptionPane.OK_OPTION){
            if (especie.getText().equals("") || habitat.getText().equals("") || tamano.getText().equals("") || tiempoNavegacion.getText().equals("")
                    || embarcacionces.getText().equals("") || nubosidad.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Procura llenar todos los campos", "Error",JOptionPane.ERROR_MESSAGE);
                EspeciePajaro();
            }
        }

    }

    /**
     * Funcion que genera un formulario para introducir datos de Pez
     */
    public static void EspeciePez(){

        JTextField n_anzuelos = new JTextField();
        JTextField t_anzuelos = new JTextField();
        JTextField profundidad = new JTextField();

        JPanel panelPz = EstandartEspecie(9,2);

        panelPz.add(new JLabel("Número de anzuelos "));
        panelPz.add(n_anzuelos);

        panelPz.add(new JLabel("Tipo de anzuelos "));
        panelPz.add(t_anzuelos);

        panelPz.add(new JLabel("Profundidad "));
        panelPz.add(profundidad);

        panelPz.add(new JLabel("Anzuelos "));
        panelPz.add(Box.createRigidArea(new Dimension(10,5)));

        bool_T = new JRadioButton("Sí ");
        bool_F = new JRadioButton("No ");
        bool_T.addChangeListener(l -> {
            if (bool_T.isSelected()) {
                bool_F.setSelected(false);
            }
        });
        panelPz.add(bool_T);
        bool_F.addChangeListener(l -> {
            if (bool_F.isSelected()) {
                bool_T.setSelected(false);
            }
        });
        panelPz.add(bool_F);
        /**
         * Función con la que comprobamos si hay campos vacíos
         */
        int nextWindow = JOptionPane.showConfirmDialog(null, panelPz, "Datos de un Pez",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (nextWindow == JOptionPane.OK_OPTION){
            if (especie.getText().equals("") || habitat.getText().equals("") || tamano.getText().equals("") || tiempoNavegacion.getText().equals("")
                    || embarcacionces.getText().equals("") || nubosidad.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Procura llenar todos los campos", "Error",JOptionPane.ERROR_MESSAGE);
                EspeciePez();
            }
        }
    }
    /**
     * Funcion que genera un formulario para introducir datos de Tiburon
     */
    public static void EspecieTiburon(){
        JPanel panelT = EstandartEspecie(6,2);
        JTextField edad = new JTextField();

        panelT.add(new JLabel("Edad "));
        panelT.add(edad);

        panelT.add(new JLabel("Heridas "));
        panelT.add(Box.createRigidArea(new Dimension(30,10)));

        bool_T = new JRadioButton("Sí ");
        bool_F = new JRadioButton("No ");

        bool_T.addChangeListener(l -> {
            if (bool_T.isSelected()) {
                bool_F.setSelected(false);
            }
        });
        panelT.add(bool_T);
        bool_F.addChangeListener(l -> {
            if (bool_F.isSelected()) {
                bool_T.setSelected(false);
            }
        });
        panelT.add(bool_F);


        /**
         * Función con la que comprobamos si hay campos vacíos
         */

        int nextWindow = JOptionPane.showConfirmDialog(null, panelT, "Datos de un Tiburon",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (nextWindow == JOptionPane.OK_OPTION){
            if (especie.getText().equals("") || habitat.getText().equals("") || tamano.getText().equals("") || tiempoNavegacion.getText().equals("")
                    || embarcacionces.getText().equals("") || nubosidad.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Procura llenar todos los campos", "Error",JOptionPane.ERROR_MESSAGE);
                EspecieTiburon();
            }
        }
    }

}

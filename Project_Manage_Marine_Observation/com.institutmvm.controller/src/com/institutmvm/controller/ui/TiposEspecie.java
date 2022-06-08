package com.institutmvm.controller.ui;

import javax.swing.*;
import cat.institutmvm.applicacio.entities.Pajaro;
import cat.institutmvm.applicacio.entities.Pez;
import cat.institutmvm.applicacio.entities.Tiburon;
import com.institutmvm.controller.utils.Database;

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
    private static JComboBox selector1 = new JComboBox();
    private static JComboBox selector2 = new JComboBox();


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
        selector1 = new JComboBox(genero_P);
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
        selector2 = new JComboBox(viento_P);
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


            Float tama = Float.valueOf(0);
            if (!tamano.getText().matches("[a-zA-Z]+")){
                tama = Float.parseFloat(tamano.getText());
            }

            Float embar = Float.valueOf(0);
            if (!embarcacionces.getText().matches("[a-zA-Z]+")){
                embar = Float.parseFloat(embarcacionces.getText());
            }
            String direccion_viento = selector1.getSelectedItem().toString();
            String genero = selector2.getSelectedItem().toString();


            Pajaro DATOS_BD_PAJARO = new Pajaro(especie.getText(),genero,habitat.getText(),tiempoNavegacion.getText(),horaLlegada.getText(),viento.getText(),
                    nubosidad.getText(),direccion_viento,tama,embar);


            if (bool_T.isSelected()){
                DATOS_BD_PAJARO.setParasitos(true);
            }

            Database insert = new Database();

            insert.insertPajaro(DATOS_BD_PAJARO);
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

            Float tama = Float.valueOf(0);
            if (!tamano.getText().matches("[a-zA-Z]+")){
                tama = Float.parseFloat(tamano.getText());
            }

            Float embar = Float.valueOf(0);
            if (!embarcacionces.getText().matches("[a-zA-Z]+")){
                embar = Float.parseFloat(embarcacionces.getText());
            }
            String direccion_viento = selector1.getSelectedItem().toString();
            String genero = selector2.getSelectedItem().toString();


            Pez DATOS_BD_PEZ = new Pez(especie.getText(),genero,habitat.getText(),tiempoNavegacion.getText(),horaLlegada.getText(),viento.getText(),
                    nubosidad.getText(),direccion_viento,tama,embar);


            if (bool_T.isSelected()){
                DATOS_BD_PEZ.setAnzuelos(true);
            }

            int n_anzu = 0;
            if (!n_anzuelos.getText().matches("[a-zA-Z]+")){
                n_anzu = Integer.parseInt(n_anzuelos.getText());
            }
            DATOS_BD_PEZ.setN_anzuelos(n_anzu);

            int profun = 0;
            if (!profundidad.getText().matches("[a-zA-Z]+")){
                profun = Integer.parseInt(profundidad.getText());
            }
            DATOS_BD_PEZ.setProfundidad(profun);

            DATOS_BD_PEZ.setT_anzuelo(t_anzuelos.getText());

            Database insert = new Database();

            insert.insertPez(DATOS_BD_PEZ);

        }


    }
    /**
     * Funcion que genera un formulario para introducir datos de Tiburon
     */
    public static void EspecieTiburon(){
        JPanel panelT = EstandartEspecie(6,2);
        JTextField edad = new JTextField();
        JTextField heridas = new JTextField();

        panelT.add(new JLabel("Edad "));
        panelT.add(edad);

        panelT.add(new JLabel("Heridas "));
        panelT.add(heridas);

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
        Float tama = Float.valueOf(0);
        if (!tamano.getText().matches("[a-zA-Z]+")){
            tama = Float.parseFloat(tamano.getText());
        }

        Float embar = Float.valueOf(0);
        if (!embarcacionces.getText().matches("[a-zA-Z]+")){
            embar = Float.parseFloat(embarcacionces.getText());
        }
        String direccion_viento = selector1.getSelectedItem().toString();
        String genero = selector2.getSelectedItem().toString();


        Tiburon DATOS_BD_TIBURON = new Tiburon(especie.getText(),genero,habitat.getText(),tiempoNavegacion.getText(),horaLlegada.getText(),viento.getText(),
                nubosidad.getText(),direccion_viento,tama,embar);


        DATOS_BD_TIBURON.setEdad(edad.getText());
        DATOS_BD_TIBURON.setHeridas(heridas.getText());

        Database insert = new Database();

        insert.insertTiburon(DATOS_BD_TIBURON);
    }

}

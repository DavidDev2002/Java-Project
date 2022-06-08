package com.institutmvm.controller.utils;
import cat.institutmvm.applicacio.entities.Pajaro;
import cat.institutmvm.applicacio.entities.Pez;
import cat.institutmvm.applicacio.entities.Tiburon;

import java.sql.*;

public class Database {


    PreparedStatement pstatement = null;
    ResultSet rs = null;
    String server = "jdbc:mysql://localhost:3306/";
    String bbdd = "davidvaz02";
    String user = "root";
    String password = "";

    public void insertPajaro(Pajaro a) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(server + bbdd, user, password);
            System.out.println("-> Conexión con MySQL establecida");

            String sql = "INSERT INTO Pajaros(Especie,Genero,Habitat,Tiempo_Navegacion,Hora_Llegada,Viento,Nubosidad,Direccion_Viento,Size,Embarcaciones,Parasitos) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedstat = conexion.prepareStatement(sql);
            try {
                preparedstat.setString(1, a.getEspecie());
                preparedstat.setString(2, a.getGenero());
                preparedstat.setString(3,a.getHabitat());
                preparedstat.setString(4,a.getTiempoNavegacion());
                preparedstat.setString(5,a.getHoraLlegada());
                preparedstat.setString(6,a.getViento());
                preparedstat.setString(7,a.getNubosidad());
                preparedstat.setString(8,a.getDireccionViento());
                preparedstat.setFloat(9,a.getTamano());
                preparedstat.setFloat(10,a.getEmbarcaciones());
                preparedstat.setBoolean(11,a.getParasitos());

                preparedstat.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC No encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectarse a la BD");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error general de Conexión");
            e.printStackTrace();
        }

    }


    public void insertPez(Pez p) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(server + bbdd, user, password);
            System.out.println("--> Conexión con MySQL establecida.");

            String sql = "INSERT INTO peces (Especie,Genero,Habitat,Tiempo_Navegacion,Hora_Llegada,Viento,Nubosidad,Direccion_Viento,Size,Embarcaciones,N_Anzuelos,Profundidad,T_Anzuelo,P_Anzuelos) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedstat = conexion.prepareStatement(sql);
            try {
                preparedstat.setString(1, p.getEspecie());
                preparedstat.setString(2, p.getGenero());
                preparedstat.setString(3,p.getHabitat());
                preparedstat.setString(4,p.getTiempoNavegacion());
                preparedstat.setString(5,p.getHoraLlegada());
                preparedstat.setString(6,p.getViento());
                preparedstat.setString(7,p.getNubosidad());
                preparedstat.setString(8,p.getDireccionViento());
                preparedstat.setFloat(9,p.getTamano());
                preparedstat.setFloat(10,p.getEmbarcaciones());
                preparedstat.setInt(11,p.getN_anzuelos());
                preparedstat.setInt(12,p.getProfundidad());
                preparedstat.setString(13,p.getT_anzuelo());
                preparedstat.setBoolean(14,p.getAnzuelos());


                preparedstat.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC No encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectarse a la BD");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error general de Conexión");
            e.printStackTrace();
        }

    }

    public void insertTiburon(Tiburon t){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(server + bbdd, user, password);
            System.out.println("--> Conexión con MySQL establecida.");

            String sql = "INSERT INTO tiburones (Especie,Genero,Habitat,Tiempo_Navegacion,Hora_Llegada,Viento,Nubosidad,Direccion_Viento,Size,Embarcaciones,Heridas,Edad) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedstat = conexion.prepareStatement(sql);
            try {
                preparedstat.setString(1, t.getEspecie());
                preparedstat.setString(2, t.getGenero());
                preparedstat.setString(3,t.getHabitat());
                preparedstat.setString(4,t.getTiempoNavegacion());
                preparedstat.setString(5,t.getHoraLlegada());
                preparedstat.setString(6,t.getViento());
                preparedstat.setString(7,t.getNubosidad());
                preparedstat.setString(8,t.getDireccionViento());
                preparedstat.setFloat(9,t.getTamano());
                preparedstat.setFloat(10,t.getEmbarcaciones());
                preparedstat.setString(11,t.getHeridas());
                preparedstat.setString(12,t.getEdad());


                preparedstat.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC No encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectarse a la BD");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error general de Conexión");
            e.printStackTrace();
        }

    }

}

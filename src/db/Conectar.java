package db;

import java.sql.*;

/**
 *
 * author Alvaro Cortez
 */
public class Conectar {

    Connection conectar;
    Statement st;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/notasdb", "root", "");
            if (conectar != null) {
                System.out.println("Base de datos conectada con exito");
            } else {
                System.out.println("No se pudo conectar a la base de datos");
            }
        } catch (Exception e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }

        return conectar;
    }
}

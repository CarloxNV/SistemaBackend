package org.acatlan.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnection() {
      Connection conexion = null;
      var baseDatos ="estudiantes_mac";
     var url="jdbc:mysql://localhost:3306/" + baseDatos;
      var usuario = "root";
      var password = "@carlos29";

     try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         conexion = DriverManager.getConnection(url,usuario,password);
     } catch (ClassNotFoundException | SQLException e){
         System.out.println("Ocurrio un error en la conexion "+ e.getMessage());
     }
    return conexion;
    }

    public static void main(String[] args) {
        var conexion = Conexion.getConnection();

        if(conexion != null) {
            System.out.println("Conexion exitosa : " + conexion);
        }
        else {
            System.out.println("Error de conexion ");
        }

    }
}

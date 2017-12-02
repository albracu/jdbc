package jdbc;

import java.sql.*;

public class Jdbc {
    public static void main(String[] args) {

        try{
            System.out.println("Intento conectarme a la BD....");
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/agenda", "root","root");
            System.out.println("La conexion se ha realizado con exito");
        }catch (SQLException ex){
            System.out.println("Error de Mysql");

        }
        catch (ClassNotFoundException e){
        e.printStackTrace();

        }
        catch (Exception e){
            System.out.println("Se ha encontrado un error que es: "+ e.getMessage());

        }

    }
}

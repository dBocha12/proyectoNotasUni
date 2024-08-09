package Modelo;

import Controlador.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    // agregar un nuevo registro\
    
    
    public void agregarNota(String nombreEstudiante, int edadEstudiante, double nota1, double nota2, double nota3) {
        double notaFinal = (nota1 + nota2 + nota3) / 3;
        String estado = "";
        if(notaFinal >= 70) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }

        String query = "INSERT INTO notas (nombreEstudiante, edadEstudiante, nota1, nota2, nota3, notaFinal, estado) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = DBConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, nombreEstudiante);
            statement.setInt(2, edadEstudiante);
            statement.setDouble(3, nota1);
            statement.setDouble(4, nota2);
            statement.setDouble(5, nota3);
            statement.setDouble(6, notaFinal);
            statement.setString(7, estado);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al agregar el registro.");
        }
    }

    // eliminar un registro
    public void eliminarNota(String idNota) {
        String query = "DELETE FROM notas WHERE idNota = ?";

        try (Connection connection = DBConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, idNota);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al eliminar el registro.");
        }
    }

    // actualizar una linea en base a ID
    public void actualizarNotaEstudiante(String nombreEstudiante, int edadEstudiante, String idNota, double nota1, double nota2, double nota3) {
        double notaFinal = (nota1 + nota2 + nota3) / 3;
        String estado = "";
        if(notaFinal >= 70) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }

        String query = "UPDATE notas SET nombreEstudiante = ?, edadEstudiante = ?, nota1 = ?, nota2 = ?, nota3 = ?, notaFinal = ?, estado = ? WHERE idNota = ?";

        try (Connection connection = DBConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

           statement.setString(1, nombreEstudiante);
            statement.setInt(2, edadEstudiante);
            statement.setDouble(3, nota1);
            statement.setDouble(4, nota2);
            statement.setDouble(5, nota3);
            statement.setDouble(6, notaFinal);
            statement.setString(7, estado);
            statement.setString(8, idNota);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al actualizar el registro.");
        }
    }
    
    // leer solo las notas por el filtro de nombre para popular la tabla
    public List<Object[]> leerNotasNombre(String nombreEstudiante) {
    List<Object[]> notas = new ArrayList<>();
    String query = "SELECT * FROM notas WHERE nombreEstudiante = ?";

    try (Connection connection = DBConnector.getConnection();
         PreparedStatement statement = connection.prepareStatement(query)) {

        statement.setString(1, nombreEstudiante);

        try (ResultSet resultado = statement.executeQuery()) {
            while (resultado.next()) {
                int idNota = resultado.getInt("idNota");
                String nombreEstudianteResult = resultado.getString("nombreEstudiante");
                int edadEstudiante = resultado.getInt("edadEstudiante");
                double nota1 = resultado.getDouble("nota1");
                double nota2 = resultado.getDouble("nota2");
                double nota3 = resultado.getDouble("nota3");
                double notaFinal = resultado.getDouble("notaFinal");
                String estado = resultado.getString("estado");
                
                Object[] notaInfo = {idNota, nombreEstudianteResult, edadEstudiante, nota1, nota2, nota3, notaFinal, estado};
                notas.add(notaInfo);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al leer los registros.");
    }

    return notas;
}


     
     // leer TODAS las notas de un ID para popular la tabla, util para seleccionar una en especifico
    public List<Object[]> leerNotasID(String ID) {
    List<Object[]> notas = new ArrayList<>();
    String query = "SELECT * FROM notas WHERE idNota = ?";

        try (Connection connection = DBConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, ID);
            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                int idNota = resultado.getInt("idNota");
                String nombreEstudiante = resultado.getString("nombreEstudiante");
                int edadEstudiante = resultado.getInt("edadEstudiante");
                double nota1 = resultado.getDouble("nota1");
                double nota2 = resultado.getDouble("nota2");
                double nota3 = resultado.getDouble("nota3");
                double notaFinal = resultado.getDouble("notaFinal");
                String estado = resultado.getString("estado");

                Object[] notaInfo = {idNota, nombreEstudiante, edadEstudiante, nota1, nota2, nota3, notaFinal, estado};
                notas.add(notaInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al leer los registros.");
        }

        return notas;
    }


     // leer TODAS las notas para popular la tabla 
    public List<Object[]> leerNotas() {
    List<Object[]> notas = new ArrayList<>();
    String query = "SELECT * FROM notas";

    try (Connection connection = DBConnector.getConnection();
         PreparedStatement statement = connection.prepareStatement(query);
         ResultSet resultado = statement.executeQuery()) {

        while (resultado.next()) {
            int idNota = resultado.getInt("idNota");
            String nombreEstudiante = resultado.getString("nombreEstudiante");
            int edadEstudiante = resultado.getInt("edadEstudiante");
            double nota1 = resultado.getDouble("nota1");
            double nota2 = resultado.getDouble("nota2");
            double nota3 = resultado.getDouble("nota3");
            double notaFinal = resultado.getDouble("notaFinal");
            String estado = resultado.getString("estado");
            
            Object[] notaInfo = {idNota, nombreEstudiante, edadEstudiante, nota1, nota2, nota3, notaFinal, estado};
            notas.add(notaInfo);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Error al leer los registros.");
    }

    return notas;
    }

    

}

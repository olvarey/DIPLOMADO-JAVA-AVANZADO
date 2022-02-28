package udb.net.mod1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstudianteRepository {
	public List<Estudiante> buscarTodos() throws SQLException, ClassNotFoundException {
		String sql = "select * from estudiante";
		List<Estudiante> lista = new ArrayList<>();
		try (Connection connection = getConexion();
				PreparedStatement sentencia = connection.prepareStatement(sql);
				ResultSet rs = sentencia.executeQuery()) {
			while (rs.next()) {
				Estudiante e = new Estudiante();
				e.setCodigo(Integer.parseInt(rs.getString("codigo")));
				e.setNombre(rs.getString("nombre"));
				e.setApellido(rs.getString("apellido"));
				e.setCum(Double.parseDouble(rs.getString("cum")));
				e.setCuotaMensual(Double.parseDouble(rs.getString("cuota")));
				lista.add(e);
			}
		} catch (SQLException e) {
			throw e;
		}
		return lista;
	}

	public void insertar(Estudiante estudiante) throws SQLException, ClassNotFoundException {
		String sql = "insert into Estudiante (codigo, nombre, apellido, cum, cuota) values (?,?,?,?,?)";
		try (Connection connection = getConexion(); PreparedStatement sentencia = connection.prepareStatement(sql)) {
			sentencia.setInt(1, estudiante.getCodigo());
			sentencia.setString(2, estudiante.getNombre());
			sentencia.setString(3, estudiante.getApellido());
			sentencia.setDouble(4, estudiante.getCum());
			sentencia.setDouble(5, estudiante.getCuotaMensual());
			sentencia.execute();
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

	private Connection getConexion() throws SQLException {
		Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/spring?serverTimezone=UTC", "root",
				"Fathima13$");
		return conexion;
	}
}

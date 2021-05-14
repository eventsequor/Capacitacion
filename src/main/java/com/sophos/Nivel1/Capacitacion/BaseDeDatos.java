package com.sophos.Nivel1.Capacitacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BaseDeDatos {

	private Connection con;
	private String url = "jdbc:mysql://localhost:3306/clientes?useUnicode"
			+ "=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	public void conexion() {
		try {
			con = DriverManager.getConnection(url, "root", "Qazxsw1023*");
			PreparedStatement smt = con.prepareStatement("Select * from clientes");
			ResultSet rs = smt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("correo"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

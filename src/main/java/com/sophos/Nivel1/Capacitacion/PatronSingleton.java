package com.sophos.Nivel1.Capacitacion;

public class PatronSingleton {
	
	private String nombre;
	private String clave;
	
	private static PatronSingleton objInstancia;

	private PatronSingleton(String nombre,String clave) {
		this.nombre = nombre;
		this.clave = clave;
	}
	
	public static PatronSingleton getInstancia(String nombre,String clave) {
		if(objInstancia == null) {
			synchronized (PatronSingleton.class) {
				if(objInstancia == null) {
					objInstancia = new PatronSingleton(nombre,clave);
				}
			}
		}
		return objInstancia;
	}

	public String getClave() {
		return clave;
	}

	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return "Nombre: "+ nombre + " Clave: "+ clave;
	}
}

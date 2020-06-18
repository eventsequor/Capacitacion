package com.sophos.Nivel1.Capacitacion;

import java.util.ArrayList;

public class VariableCondicionales {

	ArrayList<String> nombrePersonas;
	public VariableCondicionales() {
		nombrePersonas = new ArrayList<String>();
	}

	public ArrayList<String> getNombrePersonas() {
		return nombrePersonas;
	}

	public void setNombrePersonas(ArrayList<String> nombrePersonas) {
		this.nombrePersonas = nombrePersonas;
	}
	
	public void agregarNuevaPersona(String nombrPersona) {
		nombrePersonas.add(nombrPersona);
	}
	
	public ArrayList<String> personasMayores18() {
		ArrayList<String> listaPersonaMayores = new ArrayList<String>();
		for (String persona: nombrePersonas) {
			int edad = Integer.parseInt(persona.split(":")[1]);
			if(edad>17) {
				listaPersonaMayores.add(persona);
			}
		}
		return listaPersonaMayores;
	}
	

	
	
	
}

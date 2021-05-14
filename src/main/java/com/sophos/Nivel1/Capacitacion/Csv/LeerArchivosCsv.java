package com.sophos.Nivel1.Capacitacion.Csv;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class LeerArchivosCsv {
	private List<CSVRecord> list;
	private Reader lector;
	private CSVParser csvParser;

	public List<CSVRecord> getList() {
		return list;
	}

	public void setList(List<CSVRecord> list) {
		this.list = list;
	}

	public Reader getLector() {
		return lector;
	}

	public void setLector(Reader lector) {
		this.lector = lector;
	}

	public CSVParser getCsvParser() {
		return csvParser;
	}

	public void setCsvParser(CSVParser csvParser) {
		this.csvParser = csvParser;
	}
	
	public List<CSVRecord> todasLista(String path){
		try {
			Reader reader = Files.newBufferedReader(Paths.get(path));
			CSVParser csvParse = new CSVParser(reader,
					CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
			return csvParse.getRecords();
		} catch (Exception e) {
			return null;
		}
		
	}
	public void leerCsv() {
		String marca, cilindraje, modelo, precio;
		String ruta = "./vehiculos.csv";
		try (Reader reader = Files.newBufferedReader(Paths.get(ruta));
				CSVParser csvParse = new CSVParser(reader,
						CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim())) {
			for (CSVRecord linea : csvParse) {
				marca = linea.get("Marca");
				cilindraje = linea.get("cilandraje");
				modelo = linea.get("Modelo");
				precio = linea.get("precio");

				System.out.println("\nVehiculo número " + linea.getRecordNumber());
				System.out.println("Marca: " + marca);
				System.out.println("Cilindraje: " + cilindraje);
				System.out.println("Modelo: " + modelo);
				System.out.println("Precio: " + precio);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void valoresPrueba(String ruta) {
		try {
			lector = Files.newBufferedReader(Paths.get(ruta));
			csvParser = new CSVParser(lector,
					CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());
			list = csvParser.getRecords();
			System.out.println("Número de lineas: " + csvParser.getRecords().size());
		} catch (Exception e) {

		}

	}

}

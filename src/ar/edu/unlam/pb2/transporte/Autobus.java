package ar.edu.unlam.pb2.transporte;

import java.util.ArrayList;
import java.util.List;

public class Autobus extends Vehiculo {
	private List<String> pasajeros = new ArrayList<String>();

	
// constructores
	
	public Autobus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Autobus(String nombreChofer, Double kmRecorridos) {
		super(nombreChofer, kmRecorridos);
		// TODO Auto-generated constructor stub
	}

// metodos
	
	public Boolean agregarPasajero(String nombrePasajero) {
		if(pasajeros.size()<20) {
			this.pasajeros.add(nombrePasajero);
			return true;	
		}
		return false;
	}

	public void bajarPasajeros() {
		this.pasajeros.clear();		
	}

	@Override
	public Boolean cambiarChofer(String chofer) {
		if(this.pasajeros.size()==0) {
			this.nombreChofer = chofer;
			return true;
		}
		return false;
	}
	
// getters y setters
	


	public List<String> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(List<String> pasajeros) {
		this.pasajeros = pasajeros;
	}


}

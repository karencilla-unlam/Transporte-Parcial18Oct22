package ar.edu.unlam.pb2.transporte;

import java.util.ArrayList;
import java.util.List;

public class Automovil extends Vehiculo {
	private List<String> pasajeros = new ArrayList<String>();

	
// constructores
	
	public Automovil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Automovil(String nombreChofer, Double kmRecorridos) {
		super(nombreChofer, kmRecorridos);
		// TODO Auto-generated constructor stub
	}

// metodos
	
	public Boolean agregarPasajero(String nombrePasajero) {
		if(pasajeros.size()<3) {
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

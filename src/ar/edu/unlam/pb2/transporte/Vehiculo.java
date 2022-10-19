package ar.edu.unlam.pb2.transporte;

public abstract class Vehiculo {
	protected String nombreChofer;
	protected Double kmRecorridos;
	
	
	public Vehiculo(String nombreChofer, Double kmRecorridos) {
		this.nombreChofer = nombreChofer;
		this.kmRecorridos = kmRecorridos;
	}

	public Vehiculo() {
		this.nombreChofer = null;
		this.kmRecorridos = (Double) 0.00;
	}

// getters y setters 
	
	public String getNombreChofer() {
		return nombreChofer;
	}

	public void setNombreChofer(String nombreChofer) {
		this.nombreChofer = nombreChofer;
	}

	public Double getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(Double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}
	
// metodos
	
	public void agregarKmRecorridos(Double kms) {
		this.kmRecorridos = this.kmRecorridos + kms;
	}
	
	public Boolean asignarChofer(String chofer) {
		this.nombreChofer = chofer;
		return true;
	}
	
	public Boolean cambiarChofer(String chofer) {
		this.nombreChofer = chofer;
		return true;
	}
	
	public Boolean bajarChofer(String chofer) {
		this.nombreChofer = chofer;
		return true;
	}
	
}



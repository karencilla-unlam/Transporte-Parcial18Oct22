package ar.edu.unlam.pb2.transporte;

public class Motocicleta extends Vehiculo {
	private String acompaniante;

// constructores
	
	public Motocicleta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motocicleta(String nombreChofer, Double kmRecorridos) {
		super(nombreChofer, kmRecorridos);
		this.acompaniante=null;
		// TODO Auto-generated constructor stub
	}
	
// metodos 
	
	public Boolean agregarAcompaniante(String nombreAcompaniante) {
			this.acompaniante=nombreAcompaniante;
			return true;			
	}
	
	public void bajarAcompaniante() {
		this.acompaniante=null;		
	}
	
	@Override
	public Boolean cambiarChofer(String chofer) {
		if(this.acompaniante==null) {
			this.nombreChofer = chofer;
			return true;
		}
		return false;
	}
	
// getters y setters
	
	public String getAcompaniante() {
		return acompaniante;
	}

	public void setAcompaniante(String acompaniante) {
		this.acompaniante = acompaniante;
	}
	

}

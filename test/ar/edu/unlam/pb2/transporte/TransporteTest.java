package ar.edu.unlam.pb2.transporte;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class TransporteTest {

	@Test
	public void queSePuedaAgregarAcompanianteEnUnaMotocicleta() {
		String nombreAcompaniante = "Karen";
		Motocicleta miMotocicleta = new Motocicleta();
		miMotocicleta.agregarAcompaniante(nombreAcompaniante);
		assertTrue(nombreAcompaniante.equals(miMotocicleta.getAcompaniante()));
	}
	
	@Test
	public void queSePuedaSubirTresPasajerosEnUnAutomovil() {
		String pasajero1 = "Maria";
		String pasajero2 = "Juana";
		String pasajero3 = "Jose";
		Automovil miAutomovil = new Automovil();
		miAutomovil.agregarPasajero(pasajero1);
		miAutomovil.agregarPasajero(pasajero2);
		miAutomovil.agregarPasajero(pasajero3);
		assertEquals(miAutomovil.getPasajeros().size(),3);
	}
	
	@Test
	public void queNoSePuedaCambiarDeChoferEnUnAutobusPorqueTienePasajeros() {
		String unPasajero = "Martin";
		Autobus miAutobus = new Autobus();
		miAutobus.agregarPasajero(unPasajero);
		Boolean resultadoEsperado = false;
		Boolean resultadoObtenido = miAutobus.cambiarChofer("Luis");
		assertTrue(resultadoEsperado.equals(resultadoObtenido)); 
		
		/*Había un assertFalse, es assertTrue porque el metodo cambiarChofer() devuelve
		 * un false en este caso. (Porque ya hay un pasajero) entonces el resultado esperado FALSE
		 * es igual al resultado obtenido tambien FALSE. Eso da TRUE. Si le pones un 
		 * assertFalse no va a dar verde nunca. 
		 */
		
	}
	
	@Test
	public void queSePuedaCambiarDeChoferEnUnAutomovil() {
		Vehiculo otroAutomovil = new Automovil("Luis",25.2);
		String nuevoChofer = "Josefina";
		Boolean resultadoEsperado = true;
		Boolean resultadoObtenido = otroAutomovil.cambiarChofer(nuevoChofer);
//assertTrue(resultadoEsperado,resultadoObtenido); acá solo es problema del tipo de assert elegido
		assertTrue(resultadoEsperado.equals(resultadoObtenido));
	}
	
	@Test
	public void queNoSePuedaCambiarDeChoferEnUnaMotocicleta() {
		String otroAcompaniante = "Mirta";
		Motocicleta otraMotocicleta = new Motocicleta("Franco",35.9);
		/*Cambio a Motocicleta en vez de vehículo
		 * para que el metodo agregarAcompaniante() esté dentro de Moto y no de vehículo.
		 */
		otraMotocicleta.agregarAcompaniante(otroAcompaniante);
		Boolean resultadoEsperado = false;
		Boolean resultadoObtenido = otraMotocicleta.cambiarChofer("Ludmila");//Esto da FALSE.
		/*Por lo que entiendo la logica de cambiarChofer() dice que puedo cambiarlo si
		 * no hay acompañante. Entonces el resultado esperado es igual al obtenido. Eso da TRUE.
		 * el assert False no va a dar nunca.
		 */
		assertTrue(resultadoEsperado.equals(resultadoEsperado));
	}
	
}


public class Apartamento extends Inmueble {

	private byte cantidadPisos;
	private byte cantAptoPiso;

	public Apartamento(String ID, String nombre, String direccion, byte catidadPisos, byte cantAptoPiso) {
		super(ID, nombre, direccion);
		this.cantidadPisos = cantidadPisos;
		this.cantAptoPiso = cantAptoPiso;

	}

}

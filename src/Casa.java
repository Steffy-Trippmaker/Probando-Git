
public class Casa extends Inmueble{

	private boolean tienePatio;
	
	public Casa(String ID, String nombre, String direccion, boolean tienePatio) {
		super(ID, nombre, direccion);
		this.tienePatio = tienePatio;
	}

}

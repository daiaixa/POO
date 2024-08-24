package modelo;

public class Cliente extends Persona {
	
	private int codigoCliente;
	private int edad;
	
	private static int id; //para generar el codigo unico y secuencial
	
	public Cliente(int edad) {
		id ++;
		
		this.edad = edad;
		this.codigoCliente = id;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Cliente.id = id;
	}
	
//METODOS
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Persona) {
			Persona pers = (Persona) obj;

			//LO MEJOR SERIA QUE LA CLASE DOCUMENTO TENGA SU PROPIO METODO EQUALS Y UTILIZARLO ACA
			return pers.getDocIdentidad().equals(this.getDocIdentidad()) ? true : false;
		}
		return super.equals(obj);
	}

	
	@Override
	public String toString() {
		return String.format(" %d - %s - %s", this.codigoCliente,
				this.getApellido(),
				this.getDocIdentidad());   //COMO DEVUELVE EL DOCUMENTO DE IDENTIDAD ? 
	}
	

}
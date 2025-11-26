package modelo;

public class Medico {

	//ATRIBUTOS
	private int numColeg;
	private String nomApe;
	private int edad;
	private String espec;
	private int exp;
	private String centro;
	private boolean activo;
	
	
	//CONSTRUCTORES
	public Medico(int numColeg, String nomApe, int edad, String espec, int exp, String centro, boolean activo) {
		this.numColeg = numColeg;
		this.nomApe = nomApe;
		this.edad = edad;
		this.espec = espec;
		this.exp = exp;
		this.centro = centro;
		this.activo = activo;
	}
	public Medico() {
		numColeg = 0;
		nomApe = "Vacio";
		edad = 0;
		espec = "Vacio";
		exp = 0;
		centro = "Vacio";		
	}

	//GETTERS Y SETTERS
	public int getNumColeg() {
		return numColeg;
	}
	public void setNumColeg(int numColeg) {
		this.numColeg = numColeg;
	}
	public String getNomApe() {
		return nomApe;
	}
	public void setNomApe(String nomApe) {
		this.nomApe = nomApe;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEspec() {
		return espec;
	}
	public void setEspec(String espec) {
		this.espec = espec;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getCentro() {
		return centro;
	}
	public void setCentro(String centro) {
		this.centro = centro;
	}
	public boolean isActivo() {
		return activo;
	}
	private void setActivo(boolean activo) {
		this.activo = activo;
	}	
	
	//METODO JUBILACION
	public String activo() {
		if (edad>65 || (edad>60 && exp>33)) {
			return "Jubilado";
		}else
			return "Activo";
	}
	
	
	//SOBRECARGA JUBILACION
	public String activo(int edadJub, int edadEsp, int expMin) {
		if (edad<edadJub || (edad<edadEsp && exp<expMin)) {
			return "Activo";
		}else
			return "Jubilado";
	}
	
	//METODO SUELDO
	public double sueldo() {
		if (espec.equalsIgnoreCase("neurocirujano") || espec.equalsIgnoreCase("investigador")) {
			return 1600 +(50*exp) + 200;
		}else
			return 1600 + (50*exp);
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "EL MÉDICO CON:\nN.Colegiado: " + numColeg + "\nNombre y apellidos: " + nomApe + "\nEdad: " + edad +" años."+"\nEspecialidad: " + espec + "\nExperiencia: "
				+ exp + " años"+"\nCentro: " + centro + "\nActivo: " + activo + "\nSueldo: " + sueldo() + " €";
	}
		
	
	
	
	
	
	
	
}










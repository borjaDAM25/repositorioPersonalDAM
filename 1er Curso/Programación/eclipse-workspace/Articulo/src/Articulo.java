
public class Articulo {

	
	//ATRIBUTOS
	
	private String codigoBarras;
	private String denominacion;
	private int unidades;
	private double precioCompra;
	private int beneficio;
	
	
	//CONSTRUCTORES
	
	public Articulo() {
		codigoBarras="";
		denominacion="";
		unidades=0;
		precioCompra=0;
		beneficio=0;			
	}	
	
	public Articulo(String codigoBarras, String denominacion, int unidades, double precioCompra, int beneficio) {
		this.codigoBarras = codigoBarras;
		this.denominacion = denominacion;
		this.unidades = unidades;
		this.precioCompra = precioCompra;
		this.beneficio = beneficio;
	}


	//GETTERS Y SETTERS
	
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public int getBeneficio() {
		return beneficio;
	}
	public void setBeneficio(int beneficio) {
		this.beneficio = beneficio;
	}
	
	
	//METODOS
	
	public double pvp() {
		return precioCompra+((precioCompra*beneficio)/100);
		
	}
	
	
	
	
	
}

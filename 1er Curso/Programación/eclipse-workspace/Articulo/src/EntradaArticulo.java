import java.util.Scanner;

public class EntradaArticulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Articulo articulo1=new Articulo("a7s8d", "Cable TV",1,2.0,10);
		Articulo articulo2=new Articulo();
		
		articulo1.setCodigoBarras("cod250");
		
		System.out.println(articulo1.pvp());
		System.out.println(articulo1.getDenominacion());
		
		
		
		
		
		
		
	}

}

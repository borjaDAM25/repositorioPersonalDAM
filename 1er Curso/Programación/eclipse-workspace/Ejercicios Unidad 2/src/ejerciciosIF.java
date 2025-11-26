import java.util.Scanner;

public class ejerciciosIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		EJERCICIO1
		
		
//	Scanner teclado=new Scanner(System.in);
//		
//		System.out.println("Introduce un numero");
//		int numero1=teclado.nextInt();
//		System.out.println("Introduce otro numero");
//		int numero2=teclado.nextInt();
//		
//		
//		if (numero1 == numero2) {
//			System.out.println("Los numeros son iguales");
//		
//		}else {
//			System.out.println("Los numeros son diferentes");
//		}
		
//-------------------------------------------------------------------------------------
//		EJERCICIO 2
		
		
//	Scanner teclado=new Scanner(System.in);
//	
//	
//		System.out.println("Escribe un numero");
//		int numero=teclado.nextInt();
//		if (numero>=1) {
//			System.out.println("El numero es positivo");
//		}else {
//			System.out.println("El numero es negativo");
//		}
		
//--------------------------------------------------------------------------------
//		EJERCICIO 3
	
		
//	Scanner teclado=new Scanner(System.in);
//	
//	
//		System.out.println("Escribe un numero");
//		int numero=teclado.nextInt();
//		
//		if (numero>0) {
//			System.out.println("El numero es positivo");			
//		}else if (numero<0) {
//			System.out.println("El numero es negativo");
//		}else {
//			System.out.println("El numero es CERO");
//			
//		}
		
//----------------------------------------------------------------------
//		EJERCICIO 4
		

//		Scanner teclado=new Scanner(System.in);
//		
//		System.out.println("Introduce un numero entero");
//		int numero=teclado.nextInt();
//		
//		if (numero%10==0) {
//			System.out.println("Es numero es multiplo de 10");
//		}else {
//			System.out.print("El numero NO ES multiplo de 10");
//		}
		
//---------------------------------------------------------------		
//		EJERCICIO  5
		
		
//		Scanner teclado=new Scanner(System.in);
//		
//		System.out.println("Introduce un numero");
//		int numero1=teclado.nextInt();
//		System.out.println("Introduce otro numero");
//		int numero2=teclado.nextInt();
//		
//		if (numero1>numero2) {
//			System.out.println(" El primer numero es mayor que el segundo ");
//		}else if (numero1<numero2) {
//			System.out.println(numero1+" Es mayor que "+numero2);
//		}else {
//			System.out.println("Los numeros son iguales");
//		}
		
//------------------------------------------------------------------		
//		EJERCICIO 6
		
		
//	Scanner teclado=new Scanner(System.in);
//	
//	
//		System.out.println("Escribe el dia en fomato DD");
//		int dia=teclado.nextInt();
//		System.out.println("Escribe el mes en fomato MM");
//		int mes=teclado.nextInt();
//		System.out.println("Escribe el año en fomato AAAA");
//		int año=teclado.nextInt();
//		
//		if (dia>=1&&dia<=30 && mes>0 && mes<=12 && año>0) {
//			System.out.println("La fecha "+dia+"/"+mes+"/"+año+" es correcta");
//		}else {
//			System.out.println("La fecha introducida no es correcta");
//		}
		
//-------------------------------------------------------------------------------
//		EJERCICIO 9
		
//		Scanner teclado=new Scanner(System.in);
//		
//		
//		System.out.println("Introduce un numero");
//		int num1=teclado.nextInt();
//		System.out.println("Introduce otro numero");
//		int num2=teclado.nextInt();
//		System.out.println("Introduce otro numero mas");
//		int num3=teclado.nextInt();
//		
//		if (num1>num2&&num1>num3) {
//			System.out.println(num1+" Es el mayor de los tres numeros");
//		}else if (num2>num1&&num2>num3) {
//			System.out.println(num2+" Es el mayor de los tres numeros");
//		}else if (num3>num1&&num3>num2) {
//			System.out.println(num3+" Es el mayor de los tres numeros");
//		}else {
//			System.out.println("Los numeros son iguales");
//		}
//		
		
//--------------------------------------------------------------------------------------
//		EJERCICIO 10
		
//		Scanner teclado=new Scanner(System.in);
//		
//		System.out.println("Introduce la temperatura del agua");
//		int temperatura=teclado.nextInt();
//		
//		if (temperatura<0) {
//			System.out.println("A "+temperatura+" grados el agua esta en estado SOLIDO");
//		}else if (temperatura>0&&temperatura<100) {
//			System.out.println("A "+temperatura+" grados el agua esta en estado LIQUIDO");
//		}else {
//			System.out.println("A "+temperatura+" grados el agua esta en estado GASEOSO");
//		}
		
//-------------------------------------------------------------------------------------------
//		EJERCICIO 11
		
		
//		Scanner teclado=new Scanner(System.in);
//		
//		System.out.println("Cuanto ha durado la llamada en minutos?");
//		double duracion=teclado.nextDouble();
//		double coste=0.15;
//		
//		if (duracion<=5) {			
//			System.out.println("El coste de la llamada es de "+coste);
//		}else if (duracion>5) {
//			coste+=(duracion-5)*1.25;
//			System.out.println("El coste de la llamada es de "+coste);
//		}
		
//----------------------------------------------------------------------------------------------
//		EJERCICIO 13
		
		
//		Scanner  teclado=new Scanner(System.in);
//		
//		System.out.println("Introduzca su clave de acceso");
//		int clave=teclado.nextInt();
//		
//		if (clave%2==0 && clave%3==0 && clave%5==0) {
//			System.out.println("Acceso correcto para DIRECTOR GENERAL");
//		}else if (clave%2>0 && clave%3==0 && clave%5==0) {
//			System.out.println("Acceso correcto para DIRECTIVO");
//		}else if (clave%2==0 && clave%3>0 && clave%5>0) {
//			System.out.println("Acceso correcto para STAFF");
//		}else if (clave%2>0 && clave%3>0 && clave%5>0) {
//			System.out.println("Acceso correcto para SEGURIDAD");
//		}
		
//---------------------------------------------------------------------------------------
//		EJERCICIO 14
		
//		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Cuantas horas has trabajado?");		
		int horas=teclado.nextInt();		
		int salario=horas*12;
		
		if (horas<=40) {
			System.out.println("Tu salario semanal debe ser "+salario);
		}else if (horas>40) {
			System.out.println("Y cuantas horas extra?");
			int horasExtra=teclado.nextInt();
			salario+=horasExtra*20;
			System.out.println("Tu salario semanal debe ser "+salario);
		}
		
//-------------------------------------------------------------------------------------
//		EJERCICIO 15
		
//		Scanner teclado=new Scanner(System.in);
//		
//		
//		System.out.println("Cuantos neumaticos vas a cambiar");
//		int cantNeum=teclado.nextInt();
//		int precio;
//		if (cantNeum<=2) {
//			precio=115;
//			System.out.println("El coste total es "+precio*cantNeum);
//		}else if (cantNeum>2 && cantNeum<=4) {
//			precio=108;
//			System.out.println("El coste total es "+precio*cantNeum);
//		}else if (cantNeum>4) {
//			precio=108;
//			int precioDescuento=(cantNeum-4)*(precio*50/100);
//			System.out.println("El coste total es "+((precio*cantNeum)+precioDescuento));
//		}
		
//-------------------------------------------------------------------------------------------
//		EJERCICIO 16
		
//		Scanner teclado=new Scanner(System.in);
//		
//		
//		System.out.println("Aqui va tu numero aleatorio para el sorteo");		
//		int numero=(int)(Math.random()*145);	
//		
//		System.out.println("El numero aleatorio es "+numero);		
//		
//		double descuento=0.00;
//		
//		System.out.println("Introduce ahora el total de tu compra");
//		double totalCompra=teclado.nextDouble();
//		if (numero<74) {
//			descuento=totalCompra*(15.00/100);
//		}else if (numero>=74) {
//			descuento=totalCompra*(20.00/100);
//		}
//		System.out.println("El total a pagar con descuento es de "+(totalCompra-descuento));
		
//--------------------------------------------------------------------------------------------------

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

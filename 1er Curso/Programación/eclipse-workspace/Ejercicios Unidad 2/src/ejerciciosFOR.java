import java.util.Iterator;
import java.util.Scanner;


public class ejerciciosFOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
//		EJERCICIO 1
//		Programa que genere 10 números aleatorios entre 0 y 20 y calcule la suma de todos ellos
		
		
//		Scanner sc=new Scanner(System.in);
//		
//		int sumaNum=0;
//		
//		for (int i = 0; i<20; i++) {
//			System.out.print("Introduce un numero");
//			int num=sc.nextInt();
//			sumaNum+=num;
//		}
//		System.out.println("La suma de los numeros introducidos es: "+sumaNum);

//		------------------------------------------------------------------------------
//		EJERCICIO 2
//		Realiza un programa que pida un número y calcule su factorial. 
//		Ejemplo: Factorial de 4=4x3x2x1=24
//		Otro algoritmo: 4=1x2x3x4=24
		
		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.print("Introduce un numero para calcular su factorial");
//		int num=sc.nextInt();
//		int factorial=1;
//		for (int i=1; i<=num; i++) {
//			factorial*=i;
//		}
//		System.out.println("El factorial de "+num+" es: "+factorial);
		
//------------------------------------------------------------------------------------------
//		EJERCICIO 3
//		Realizar un programa que pida las edades y alturas de 5 personas, mostrar la edad media y la cantidad
//		de personas que miden más de 1.80.
//		Pista: contadores y acumuladores
		
//		Scanner sc=new Scanner(System.in);
//		
//		int contador=0;
//		double alt=0;
//		int edad=0;
//		int edadTot=0;
//		for (int i=0; i<5; i++) {
//			System.out.print("Introduce una estatura");
//			alt=sc.nextDouble();
//			System.out.print("Introduce la edad");
//			edad=sc.nextInt();
//			edadTot+=edad;			
//				if (alt>1.80) {
//				contador++;
//			} 
//		}
//		System.out.print("La media de edad es: "+(edadTot/5)+" años");
//		System.out.print("\nHay "+contador+" personas de mas de 1,80m de altura");
		
//------------------------------------------------------------------------------------------
//		EJERCICIO 4
//		Realizar un programa que pida un número al usuario.
//		Ese número indicará las veces que tienes que pedir sueldos al usuario. 
//		Se mostrará el mayor sueldo de todos.
//		Pista: guardar el máximo
		
		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.print("Introduce un numero");
//		int num=sc.nextInt();
//		
//		double sueldo=0;//declaro variable sueldo
//		double maximo=0;//declaro variable para guardar el valor maximo
//		
//		for (int i=0; i<num; i++) {
//			System.out.println("Introduce un sueldo");
//			sueldo=sc.nextDouble();
//			if (sueldo>maximo) { //
//				maximo=sueldo;//en el if hago que si el sueldo introducido, es mayor que el maximo, maximo pase a valer eso.
//			}
//		}
//		System.out.println("De los introducidos, el mayor sueldo es "+maximo+" euros");
		
//		Luego me doy cuenta de que podrian introducir un numero negativo...pero no seria un sueldo,
//									SERIA UNA DEUDA
		
//------------------------------------------------------------------------------------------
//		EJERCICIO 5
//		Realizar un programa que pida un número y mostrar la tabla de multiplicar de dicho número. 
//		Sólo se muestra la tabla si el número está entre 0 y 10.
//		Ampliación: Es obligatorio que el número esté entre 0 y 10.
//		Pista: for, validación de datos
		
		
//		Scanner sc=new Scanner(System.in);
//		
//		int num=0;
//		int multiplicador=0;
//		System.out.print("Introduce un numero entre 0 y 10, te dare su tabla de multiplicar");
//		num=sc.nextInt();
//		
//		while (num>10 || num<0) {
//			System.out.print("El numero no esta en el rango, introducelo de nuevo");	
//			num=sc.nextInt();
//		}if (num>=0 || num<=10) {
//			System.out.println("Su tabla de multiplicar es: ");
//			for (int i=1; i<=10; i++) {
//				System.out.print(num*++multiplicador);
//				if (multiplicador<10) {
//					System.out.print(", ");
//				}else if (multiplicador==10) {
//					System.out.print(".");
//				}
//			}
//				
//		}
			
//------------------------------------------------------------------------------------------
//		EJERCICIO 6
			
//		Programa que pida 10 números al usuario y diga si se ha introducido o no 
//		algún número impar.
//		Pista: flags	
		
		
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Vas a introducir 10 numeros, y te dire si hay algun impar");
//		int num=0;
//		boolean impar=false;
//		
//		for (int i=1; i<10; i++) {
//			System.out.print("Introduce un numero");
//			num=sc.nextInt();
//			if (num%2!=0) {
//				impar=true;
//			}
//		}
//		if (impar) {
//			System.out.println("Parece ser que hay impares");
//			
//		}else
//			System.out.println("Esta vez todos son pares");
		
//------------------------------------------------------------------------------------------
//		EJERCICIO 7
		
//		Escribe un programa que imprima un cuadrado de números. El tamaño del cuadrado debe ser 
//		introducido por el usuario.
//		Ejemplo de salida para un cuadrado de tamaño 4:
//		1 2 3 4 
//		1 2 3 4 
//		1 2 3 4 
//		1 2 3 4
//		Pista: for anidados
		
		
//		Scanner sc=new Scanner(System.in);
//		
//		int num=0;
//		
//		System.out.print("Introduce un numero para hacer un cuadrado");
//		num=sc.nextInt();
//		
//		for (int i=1; i<=num; i++) {
//			
//			for (int j=1; j<=num; j++) {
//				System.out.print(j+" ");	
//			}
//			System.out.println("");
//		}
		
//--------------------------------------------------------------------------------		
//		EJERCICIO 8		
	
//		Pide al usuario un número para imprimir un triángulo de asteriscos.
//		Ejemplo de salida para un triángulo de tamaño 3:
//		*
//		**
//		***
//		Pista: for anidados
		
		
//		Scanner sc=new Scanner(System.in);
//		
//		int num=0;
//		
//		System.out.print("Introduce un numero para el tamaño del triangulo");
//		num=sc.nextInt();
//		
//		for (int i=1; i<=num; i++) {
//			
//			for (int j=1; j<=i; j++) {		//como i va aumentando, j aumentara hasta el numero del usuario		
//				System.out.print("* ");
//
//			}
//			System.out.println();
//		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

import java.util.Scanner;

public class ejerciciosWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		EJERCICIO 1
		
//		Realizar un programa que pida al usuario un número e indicar si es positivo o negativo. 
//		El proceso se repetirá hasta que se introduzca un 0.
		
//	Scanner sc=new Scanner(System.in);
//		
//		
//		System.out.println("Introduce un numero");
//		int num=0;
//		num=sc.nextInt();
//		while (num!=0) {			
//			if (num>0) {
//				System.out.println("El numero es positivo, introduce otro numero");				
//			}else
//				System.out.println("El numero ahora es negativo, introduce otro numero");
//			  //System.out.println("Introduce otro numero");
//				num=sc.nextInt();
//		}
//		
//		System.out.println("Se ha cerrado la aplicación por introducir 0");
		
//-----------------------------------------------------------------------------------------		
//		EJERCICIO 2
		
//		Realiza un programa que pida números hasta que se teclee uno negativo, y mostrar
//		cuántos números positivos se han introducido.
		
//		Scanner sc=new Scanner(System.in);
//		
//		int num=0;
//		int numPos=0;	
//		
//		System.out.print("Introduce un numero");
//		num=sc.nextInt();
//		while (num>0) {
//			System.out.println("El numero es positivo, introduce otro numero");
//			numPos+=1;
//			num=sc.nextInt();
//		}
//			System.out.println("El numero no es positivo");
//			System.out.println("En total has introducido "+numPos+" numeros positivos.");
		
		
//-----------------------------------------------------------------------------------------		
//		EJERCICIO 3
		
//		Realizar un juego para adivinar un número. Para ello generar un número aleatorio entre 1 y 100 y
//		luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N. 
//		El proceso termina cuando el usuario acierta. Mostrar un mensaje indicando cuántos intentos se han 
//		necesitado para acertar.
		
		
//		Scanner sc=new Scanner(System.in);
//		
//		int num=(int)(Math.random()*100)+1;
//		int numIntr=0;
//		
//		
//		System.out.println("Prueba suerte a ver si aciertas el numero entre 1 y 100");
//		numIntr=sc.nextInt();
//		
//		int intentos=1;
//		
//		while (numIntr!=num) {			
//			intentos+=1;
//			if (numIntr>num) {
//				System.out.println("Te has pasado, el numero es menor que eso");
//				numIntr=sc.nextInt();
//			} else {
//				System.out.println("No es ese, es mayor");
//				numIntr=sc.nextInt();
//				
//			}
//			
//		}
//		System.out.println("BINGO, has acertado!!! Has necesitado "+intentos+" intentos.");
		
//-----------------------------------------------------------------------------------------		
//		EJERCICIO 4
		
//		Realizar un programa que pida números hasta que se introduzca uno 
//		negativo y calcular la media.
	
//		Scanner sc=new Scanner(System.in);
//		
//		int num=0;
//		double suma=0;
//		int cantNum=0;
//		System.out.print("Introduce un numero");
//		num=sc.nextInt();
//		
//		while (num>=0) {
//			suma+=num;
//			cantNum+=1;
//			System.out.print("Introduce otro numero");
//			num=sc.nextInt();
//		}if (num<0) {
//			System.out.println("Programa cerrado por introducir un negativo.");
//		}
//		System.out.println("Se han intoducido "+cantNum+" numeros positivos, y la media de ellos \n introducidos es "+(suma/cantNum)+".");	
		
		
//-----------------------------------------------------------------------------------------		
//		EJERCICIO 5
		
//		Realizar un programa que solicite N notas de alumnos e informe cuántos aprobados 
//		y suspensos hay además de la media de las calificaciones y la calificación más baja. 
//		El programa termina cuando se ingrese un valor negativo o cuando se hayan introducido 10 notas
		
//		Scanner sc=new Scanner(System.in); 
//		
//		double nota=0;
//		double sumaNota=0;
//		int cantNotas=0;
//		double notMin=10;
//		int aprob=0;
//		int susp=0;
//		
//		System.out.print("Introduce una nota");
//		nota=sc.nextDouble();
//		while (nota>=0 && nota<=10 && cantNotas<9) {
//			
//			cantNotas++;
//			sumaNota+=nota;
//			if (nota<notMin) {
//				notMin=nota;
//			}if(nota>=5) {
//				aprob++;
//			}else {
//				susp++;
//			}
//			System.out.print("Introduce otra nota");
//			nota=sc.nextDouble();
//		}	
//		System.out.println("El programa ha terminado");
//		System.out.println("La media es "+(sumaNota/cantNotas));
//		System.out.println("La nota mas baja es "+notMin);
//		System.out.println("Tenemos en total "+aprob+" aprobados, y "+susp+" suspensos.");

		
//-----------------------------------------------------------------------------------------		
//		EJERCICIO 6
		
//		Crea un menú con las siguientes opciones:
//			Introducir número 1
//			Introducir número 2
//			Suma
//			Resta
//			Multiplicación
//			División
//			Potencia
//			Salir
//			Implementa la funcionalidad de cada una de ellas. Trata las excepciones y/o valida los datos.

		
		
		
//-----------------------------------------------------------------------------------------		
//		EJERCICIO 7
		
//		Crea un programa para calcular el área de diferentes figuras geométricas. Deberá incluir el siguiente  menú:
//			Área del círculo
//			Área del cuadrado
//			Área del rectángulo
//			Área del paralelogramo
//			Área del rombo
//			Área de un trapecio
//			Área de un polígono regular
//			Salir
//			Implementa la funcionalidad de cada una de ellas para calcular el área correspondiente pidiendo los datos necesarios para el cálculo.
//			Valida los datos y vigila el ámbito de las variables.
		
		
		
		
			
			
			
			
			
			
			
		
		
		
	}

}

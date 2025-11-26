package vista;

import java.util.Scanner;

public class PrincipalMedicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		modelo.Medico medico1=new modelo.Medico(1234, "Juan Martinez", 62, "Investigador", 34, "HUCA", true);		
		modelo.Medico medico2=new modelo.Medico();	
		medico2.setNumColeg(5678);
		medico2.setNomApe("Ramon Bilbao");
		medico2.setEdad(64);
		medico2.setEspec("Auxiliar");
		medico2.setExp(16);
		medico2.setCentro("CABUEÑES");
		int select;
	
		
		do {
			System.out.println("SELECCIONA LA ACCION QUE QUIERES EJECUTAR.");
			System.out.println("1.Datos de los médicos");
			System.out.println("2.Ver sueldo de médico");
			System.out.println("3.Consulta posibilidad jubilación médicos");
			System.out.println("4.Cambio de centro de trabajo");
			System.out.println("5.Salir del programa");

			select=sc.nextInt();
			
			switch (select) {
			case 1:
				System.out.println("DATOS MÉDICO:\nN.Colegiado: " + medico1.getNumColeg() + "\nNombre y apellidos: " + medico1.getNomApe() + "\nEdad: " + medico1.getEdad() +" años."+"\nEspecialidad: " + medico1.getEspec() + "\nExperiencia: "
						+ medico1.getExp() + " años"+"\nCentro: " + medico1.getCentro() + "\nActivo: " + medico1.activo()+"\n");
				System.out.println("DATOS MÉDICO: "+medico2.toString());
				sc.nextLine();
				break;
			case 2:

				int select2;
				do {
					System.out.println("De que medico quieres ver el sueldo \n1.Medico 1 \n2.Medico 2 \n3.Salir al menu principal)");
					select2=sc.nextInt();
					switch (select2) {
					case 1:
						System.out.println(medico1.sueldo());
						break;
					case 2:
						System.out.println(medico2.sueldo());
						break;
					case 3:
						System.out.println("Volviendo al INICIO");
						break;
					default:
						System.out.println("Opción no válida");
						break;
					}
				} while (select2==1 || select2==2);
				break;
			case 3:
				int select3;
				do {
					System.out.println("Las leyes han cambiado? \n1.No han cambiado. \n2.Si han cambiado\n3.Salir al menu principal");
					select3=sc.nextInt();
					switch (select3) {
					case 1:
						if (medico1.activo().equalsIgnoreCase("Jubilado")) {
							System.out.println("El médico 1 se ha podido jubilar");
						}else
							System.out.println("El médico 1 no puede jubilarse");
						
						if (medico2.activo().equalsIgnoreCase("Jubilado")) {
							System.out.println("El médico 2 se ha podido jubilar");
						}else
							System.out.println("El médico 2 no puede jubilarse");				
						
						break;
					case 2:
						System.out.println("Introduce las nuevas leyes (edad jubilacion, edad jubilacion especial, años experiencia)");
						int edadJub = sc.nextInt();
						int edadEsp = sc.nextInt();
						int expMin = sc.nextInt();
						if (medico1.activo().equalsIgnoreCase("Jubilado")) {
							System.out.println("El médico 1 se ha podido jubilar");
						}else
							System.out.println("El médico 1 no puede jubilarse");
						
						if (medico2.activo().equalsIgnoreCase("Jubilado")) {
							System.out.println("El médico 2 se ha podido jubilar");
						}else
							System.out.println("El médico 2 no puede jubilarse");
						break;
					case 3:
						System.out.println("Volviendo al INICIO");
						break;
					default:
						System.out.println("Opción no válida");
						break;
					}
				} while (select3==1 || select3==2);
				break;
				
			case 4:
				
				break;
			case 5:
				System.out.println("Fin del programa");
				break;

			default:
				System.out.println("Opción no válida");
				break;
			}
				
		} while (select!=5);
		
	}
		
//			PREGUNTAS PARA RAZONAR
//		Supón que siempre que se crea un médico se va a hacer con su constructor con parámetros 
//		(se eliminaría su constructor por defecto). ¿Qué métodos set eliminarías?
//				setNumColegiado
//				setNombre
//				setApellidos
//				setEdad
//				setEspecialidad
//				setAniosExperiencia
//				setCentroTrabajo
//				setActivo ----- YO ELIMINARÍA EL ACTIVO, YA QUE NOS LO DIRIAN 
//								LOS METODOS SABIENDO EDAD Y AÑOS DE EXPERIENCIA

		
		
		
		
		
		
	

		
		
		
		
		
		
		
	
		
		
		
		
	

}

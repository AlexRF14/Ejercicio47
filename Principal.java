import java.util.Scanner;
public class Principal{
	public static void main(String args []){
		System.out.println("Importe un número de entre el 1 al 7");
		Scanner sc = new Scanner(System.in);
		int dia;
		dia = sc.nextInt();
		switch(dia){
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miercoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sabado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
		        default:
				System.out.println("Importe otro valor entero entre el 1 y el 7");
		}       
	}
}


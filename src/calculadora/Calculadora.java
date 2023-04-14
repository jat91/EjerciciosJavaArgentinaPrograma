package calculadora;

import java.util.Scanner;

public class Calculadora {
	
	double resultado;
	
	double sumar(double unNumero, double otroNumero) {
		return resultado = unNumero + otroNumero;
	}
	
	double restar(double unNumero, double otroNumero) {
		return resultado = unNumero - otroNumero;
	}
	
	double multiplicar(double unNumero, double otroNumero) {
		return resultado = unNumero * otroNumero;
	}
	
	double dividir(double unNumero, double otroNumero) {
		return resultado = unNumero / otroNumero;
	}

	public static void main(String[] args) {
		int opcion;
		double primerNum;
		double segNum;
		do {
			Calculadora calc = new Calculadora();
			Scanner sc = new Scanner(System.in);
			System.out.print("Que operacion desea hacer? \n");
	        System.out.print("1 - Suma\n");
	        System.out.print("2 - Resta\n");
	        System.out.print("3 - Multiplicacion\n");
	        System.out.print("4 - Division\n");
	        System.out.print("5 - Salir\n");
	        opcion = sc.nextInt();
        
        	switch(opcion) {
        	case 1:        		
        		System.out.print("Ingrese el primer numero \n");
        		primerNum = sc.nextDouble();
        		System.out.print("Ingrese el segundo numero \n");
        		segNum = sc.nextDouble();
        		System.out.print("El resultado de la suma es: "+calc.sumar(primerNum, segNum)+"\n");
        		break;
        	case 2:
        		System.out.print("Ingrese el primer numero \n");
        		primerNum = sc.nextDouble();
        		System.out.print("Ingrese el segundo numero \n");
        		segNum = sc.nextDouble();
        		System.out.print("El resultado de la resta es: "+calc.restar(primerNum, segNum)+"\n");
        		break;
        	case 3:
        		System.out.print("Ingrese el primer numero \n");
        		primerNum = sc.nextDouble();
        		System.out.print("Ingrese el segundo numero \n");
        		segNum = sc.nextDouble();
        		System.out.print("El resultado de la multiplicacion es: "+calc.multiplicar(primerNum, segNum)+"\n");
        		break;
        	case 4:
        		System.out.print("Ingrese el primer numero \n");
        		primerNum = sc.nextDouble();
        		System.out.print("Ingrese el segundo numero \n");
        		segNum = sc.nextDouble();
        		if(segNum!=0) {
        			System.out.print("El resultado de la division es: "+calc.dividir(primerNum, segNum)+"\n");
        			break;
        		} else {
        			System.out.print("No se puede dividir por 0\n");
        			break;
        		}         		
        	case 5:
        		System.out.print("Gracias por usar la calculadora");
        		break;
        	default:
        		System.out.println("La opción seleccionada no es válida");
	            break;
            }
        } while(opcion != 5);
        
	}

}

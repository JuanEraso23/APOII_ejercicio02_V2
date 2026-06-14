package context;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese las Calificaciones del Estud.");
		
		//Atributos
        float n1=sc.nextFloat();
        float n2=sc.nextFloat();
        float n3=sc.nextFloat();
            
        //Formula
        float prom=((n1+n2+n3)/3);
		
		//Resultado
        System.out.print("Promedio: "+prom);
        sc.close();  
	}

}

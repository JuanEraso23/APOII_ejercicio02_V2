package context;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
        
		//Atributos
        System.out.print("Ingrese la Velocidad: ");
        int v = sc.nextInt();
        
        System.out.print("Ingrese el Tiempo (Segundos): ");
        int t = sc.nextInt();
        
        //Formula
        int d = (v * t);
        
        //Resultado
        System.out.println("Distancia: " + d);
        sc.close();  
	}

}

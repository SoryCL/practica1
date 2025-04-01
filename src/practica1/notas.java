package practica1;
import java.util.Scanner;

	/**
	 * Clase que permite introducir tres notas, validarlas, calcular la nota final y mostrar el resultado.
	 *
	 * @author profesor
	 * @version 1.0
	 * @since 2025-03-25
	 */

public class notas {
	

	
	/** Notas de la unidad formativa 1, 2 y 3 */
	double unidad1, unidad2, unidad3;
	
	/** Nota acumulada unidad1, unidad2 y unidad3 (35% de cada UF) */
	double acu1, acu2, acu3, def;
	
	
	/** Objeto Scanner para la entrada de datos por teclado */
	Scanner entrada = new Scanner(System.in);
	
	
	/**
     * Solicita al usuario la introducción de las tres notas.
     * * Se guardan en las variables unidad1, unidad2 y unidad3 respectivamente.
     */
	public void IngresaNotas() {
		
		
		System.out.println("ingrese las notas del estudiante");
		
		
		System.out.println("Ingrese la nota correspondiente a la unidad 1:");

		
		unidad1= entrada.nextDouble();

		
		
		System.out.println("Ingrese la nota correspondiente a la unidad 2:");

		
		unidad2= entrada.nextDouble();
		
		
		System.out.println("Ingrese la nota correspondiente a la unidad 3:");

		
		unidad3= entrada.nextDouble();
		
	
	}
	
	/**
     * Método que comprueba que las notas estén dentro del rango válido (0 a 10).
     * * Muestra un mensaje indicando si la nota es válida o incorrecta.
     */
	
	public void comprobarcion(){
		
		// Validación de nota 1
		
		if (unidad1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		// Validación de nota 2
		
		if (unidad2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		
		 // Validación de nota 3
		
		if (unidad3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
		
		
	}
	
	
	 /**
     * Método que calcula la nota definitiva en base a los porcentajes antes definidos.
     * UNIDAD1 y UNIDAD2 tienen un peso del 35% y UNIDAD3 del 30%.
     * El resultado se guarda en la variable "def".
     *
     * @see #unidad1
     * @see #unidad2
     * @see #unidad3
     */
	
	public void Calculonotas() {
		acu1= unidad1*0.35;
		acu2 = unidad2 * 0.35;
		acu3 = unidad3 * 0.30;
		
		// Suma de todos los acumulados para obtener la nota final
		
		def = acu1 + acu2+ acu3;
		
	}
	
	/**
     * Muestra en pantalla las notas introducidas, las notas acumuladas y la nota definitiva.
     * También sirve para verificar que los cálculos se han hecho correctamente.
     */
	
	public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + unidad1);
		System.out.println(" nota2 = " + unidad2);
		System.out.println(" nota3 = " + unidad3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
		
	}
	
	/**
     * Método que indica si el estudiante ha aprobado o suspendido.
     * También valida si la nota definitiva tiene un valor coherente (entre 0 y 10).
     */

	public void aprobado() {
		
			
		// Si la nota es menor de 5 y mayor o igual que 0, suspendido
		
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				
				// Si la nota es igual o mayor a 5 y menor o igual que 10, aprobado
				
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					
					// Si está fuera de rango, error
					System.out.println(" error en la notas");
				}
			}
		}
		
	/**
     * Método main que ejecuta toda la funcionalidad del programa.
     *
     */
		
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		notas fc= new notas();
		
		// Se llama a los métodos en orden
		
		fc.IngresaNotas();
		
		fc.comprobarcion();
		

		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
	}

}



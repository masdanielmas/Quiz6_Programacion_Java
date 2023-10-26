package quiz6;

import quiz6.Circulo;
import quiz6.FiguraGeometrica;
import quiz6.Rectangulo;
import quiz6.Triangulo;

import java.util.Scanner;
/**
 * clase principal
 */
public class principal {

    /**
     * Metodo que ejecuta el programa
     * @param args
     *
     * Complejidad temporal: O(N) Tiempo Lineal.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el color de la figura: ");
        String color = scanner.nextLine();

        System.out.println("Ingrese el tipo de figura (1: Círculo, 2: Rectángulo, 3: Triángulo): ");
        int tipoFigura = scanner.nextInt();

        FiguraGeometrica figura = null;

        switch (tipoFigura) {
            case 1: // Círculo
                System.out.println("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                figura = new Circulo(nombre, color, radio);
                break;
            case 2: // Rectángulo
                System.out.println("Ingrese el valor del lado 1 del rectángulo: ");
                double lado1 = scanner.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo: ");
                double lado2 = scanner.nextDouble();
                figura = new Rectangulo(nombre, color, lado1, lado2);
                break;
            case 3: // Triángulo
                System.out.println("Ingrese el valor de la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo: ");
                double altura = scanner.nextDouble();
                figura = new Triangulo(nombre, color, base, altura);
                break;
            default:
                System.out.println("Tipo de figura no válido.");
                break;
        }

        if (figura != null) {
            System.out.println("Área de la figura: " + figura.obtenerArea());
            System.out.println("Perímetro de la figura: " + figura.obtenerPerimetro());
        }

        scanner.close();
    }
}
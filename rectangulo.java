package quiz6;

/**
 * Clase Rectangulo que hereda de FiguraGeometrica
 *
 */
class Rectangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;
    /**
     * Constructor de la clase Rectangulo
     *
     * @param nombre
     * @param color
     * @param lado1
     * @param lado2
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    /**
     * Metodo get para obtener el lado1
     * @return
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getLado1() {
        return lado1;
    }
    /**
     * Metodo set para establecer el lado1
     * @param lado1
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    /**
     * Metodo get para obtener el lado2
     * @return
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getLado2() {
        return lado2;
    }
    /**
     * metodo set para establecer el lado2
     * @param lado2
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    /**
     * Metodo para obtener el area del rectangulo
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerArea() {
        return lado1 * lado2;
    }
    /**
     * Metodo para obtener el perimetro del rectangulo
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2);
    }
}
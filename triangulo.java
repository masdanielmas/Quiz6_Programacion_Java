package quiz6;

/**
 * Clase Triangulo que hereda de FiguraGeometrica
 */
class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    /**
     * Constructor de la clase Triangulo
     *
     * @param nombre
     * @param color
     * @param base
     * @param altura
     */

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }
    /**
     * Metodo get para obtener base del triangulo
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getBase() {
        return base;
    }
    /**
     * Metodo set para establecer base del triangulo
     * @param base
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setBase(double base) {
        this.base = base;
    }
    /**
     * Metodo get para obtener Altura del triangulo
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getAltura() {
        return altura;
    }
    /**
     * Metodo set para establecer Altura del triangulo
     * @param altura
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     *
     * Metodo para obtener Area del triangulo
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerArea() {
        return 0.5 * base * altura;
    }
    /**
     * Metodo para obtener perimetro
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerPerimetro() {
        // No se puede calcular el perímetro de un triángulo aleatorio
        return 0.0;
    }
}
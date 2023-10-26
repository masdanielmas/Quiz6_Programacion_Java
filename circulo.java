package quiz6;

/**
 * Clase circulo que hereda de FiguraGeometrica.
 */

class Circulo extends FiguraGeometrica {
    private double radio;
    /**
     * Constructor de la clase Circulo
     *
     * @param nombre
     * @param color
     * @param radio
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }
    /**
     * Metodo get para obtener el radio
     * @return
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getRadio() {
        return radio;
    }
    /*
     * Metodo set para establecer el radio
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Metodo para obtener Area del circulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }
    /**
     * Metodo para obtener Perimetro del circulo.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */

    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}

package quiz6;

/**
 * Clase para las FiguraGeometrica
 */

class FiguraGeometrica {
    private String nombre;
    private String color;
    /**
     * Costructor de la clase FiguraGeometrica
     * @param nombre
     * @param color
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    /**
     * Metodo para obtener nombre
     * @return
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para establecer nombre
     * @param nombre
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo para obtener color
     * @return
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public String getColor() {
        return color;
    }
    /**
     * metodo para establecer color
     * @param color
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Metodo para obtener Area de las figuras
     * @return
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerArea() {
        return 0.0;
    }
    /**
     * Metodo para obtener Perimetro de las figuras
     * @return
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerPerimetro() {
        return 0.0;
    }
}
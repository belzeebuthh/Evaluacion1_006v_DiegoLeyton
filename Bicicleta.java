/* Clase base para todas las bicicletas del taller */

public abstract class Bicicleta {

    private String codigo;
    private int anio;
    private double peso;

    public Bicicleta(String codigo, int anio, double peso) {
        setCodigo(codigo);
        setAnio(anio);
        setPeso(peso);
    }

    public String getCodigo() {
        return codigo;
    }


    /* valida que el codigo no venga nulo ni vacio */
    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().equals("")) {
            throw new IllegalArgumentException("el codigo no puede ser nulo ni vacio");
        }
        this.codigo = codigo;
    }

    public int getAnio() {
        return anio;
    }


    /* el anio tiene que estar en el rango que pide el taller, si no da errors */
    public void setAnio(int anio) {
        if (anio < 2000 || anio > 2026) {
            throw new IllegalArgumentException("el anio tiene que estar entre 2000 y 2026");
        }
        this.anio = anio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("el peso tiene que ser mayor que 0");
        }
        this.peso = peso;
    }

    public abstract double calcularCostoMantencion();

    public abstract String detalle();

    public String toString() {
        return "Codigo: " + codigo + " | Anio: " + anio;
    }
}


/* esta tiene herencia de Bicicleta pero no implementa la interfaz porque las
 bicicletas de montana no entran al programa de garantia extendida */

public class BicicletaMontana extends Bicicleta {


    private int suspensiones;

    public BicicletaMontana(String codigo, int anio, double peso, int suspensiones) {
        super(codigo, anio, peso);
        setSuspensiones(suspensiones);
    }

    public int getSuspensiones() {
        return suspensiones;
    }

    public void setSuspensiones(int suspensiones) {
        if (suspensiones < 0) {
            throw new IllegalArgumentException("la cantidad de suspensiones no puede ser negativa");
        }
        this.suspensiones = suspensiones;
    }

    /* aqui esta la formula de costo para bicicleta de montana: base 30000 y si tiene
    mas de 1 suspension se le suma unos 15% extra */

    public double calcularCostoMantencion() {
        double costo = 30000;
        if (suspensiones > 1) {
            costo = costo * 1.15;
        }
        return costo;
    }

    public String detalle() {
        return "Tipo: Bicicleta de Montana | " + toString()
                + " | Peso: " + getPeso() + " kg"
                + " | Suspensiones: " + suspensiones
                + " | Costo mantencion: $" + (int) calcularCostoMantencion();
    }
}

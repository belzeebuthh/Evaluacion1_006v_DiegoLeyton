public class BicicletaElectrica extends Bicicleta implements ConGarantiaExtendida {


    /* atributos propios de este tipo de bicicleta */
    private int autonomia;
    private boolean bateriaCertificada;
    private boolean garantiaActiva;



    public BicicletaElectrica(String codigo, int anio, double peso, int autonomia, boolean bateriaCertificada) {
        super(codigo, anio, peso);
        setAutonomia(autonomia);
        setBateriaCertificada(bateriaCertificada);
        garantiaActiva = false;
    }



    public int getAutonomia() {
        return autonomia;
    }



    public void setAutonomia(int autonomia) {
        if (autonomia <= 0) {
            throw new IllegalArgumentException("la autonomia tiene que ser mayor que 0");
        }
        this.autonomia = autonomia;
    }


    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    public boolean tieneGarantia() {
        return garantiaActiva;
    }

    public void activarGarantia() {
        garantiaActiva = true;
    }



    public double calcularCostoMantencion() {
        double costo = 45000;
        if (bateriaCertificada == false) {
            costo = costo * 1.25;
        }
        return costo;
    }

    public String detalle() {
        String garantia;
        if (garantiaActiva) {
            garantia = "Si";
        } else {
            garantia = "No";
        }

        String bateria;
        if (bateriaCertificada) {
            bateria = "Si";
        } else {
            bateria = "No";
        }

        return "Tipo: Bicicleta Electrica | " + toString()
                + " | Peso: " + getPeso() + " kg"
                + " | Autonomia: " + autonomia + " km"
                + " | Bateria certificada: " + bateria
                + " | Garantia extendida: " + garantia
                + " | Costo mantencion: $" + (int) calcularCostoMantencion();
    }
}

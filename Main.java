import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /* agrega la bicicleta a la lista y avisa por consola */
        GestorTallerBicicletas gestor = new GestorTallerBicicletas();


        /* cada bicicleta se crea dentro de un try porque el constructor
         puede tirar IllegalArgumentException si algun dato no es valido */
        try {
            BicicletaElectrica bicE01 = new BicicletaElectrica("BIC-E01", 2023, 22.5, 60, false);
            bicE01.activarGarantia();
            gestor.registrarBicicleta(bicE01);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear BIC-E01: " + e.getMessage());
        }

        try {
            BicicletaElectrica bicE02 = new BicicletaElectrica("BIC-E02", 2022, 24.0, 45, true);
            gestor.registrarBicicleta(bicE02);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear BIC-E02: " + e.getMessage());
        }

        try {
            BicicletaMontana bicM01 = new BicicletaMontana("BIC-M01", 2021, 13.5, 2);
            gestor.registrarBicicleta(bicM01);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear BIC-M01: " + e.getMessage());
        }

        try {
            BicicletaMontana bicM02 = new BicicletaMontana("BIC-M02", 2020, 12.0, 1);
            gestor.registrarBicicleta(bicM02);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear BIC-M02: " + e.getMessage());
        }


        /* en esta busca la bicicleta electrica que se marco con garantia y
        muestra su detalle entero */
        System.out.println();
        System.out.println("=== BUSQUEDA POR CODIGO: \"BIC-E01\" ===");
        ArrayList<Bicicleta> resultado = gestor.buscarPorCodigo("BIC-E01");
        for (int i = 0; i < resultado.size(); i++) {
            System.out.println(resultado.get(i).detalle());
        }
        System.out.println("---");

        System.out.println();
        System.out.println("=== LISTADO DE BICICLETAS ===");
        ArrayList<Bicicleta> todas = gestor.getBicicletas();
        for (int i = 0; i < todas.size(); i++) {
            System.out.println(todas.get(i).toString());
        }
    }
}
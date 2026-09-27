import java.util.ArrayList;

/* esta clase administra la coleccion de bicicletas registradas y  muestra
 las operaciones para trabajar con ellas */
public class GestorTallerBicicletas {

    private ArrayList<Bicicleta> bicicletas;

    public GestorTallerBicicletas() {
        bicicletas = new ArrayList<Bicicleta>();
    }


    /* aqui agrega la bicicleta a la lista y avisa por consola */
    public void registrarBicicleta(Bicicleta bicicleta) {
        bicicletas.add(bicicleta);
        System.out.println(bicicleta.getCodigo() + " (" + bicicleta.getClass().getSimpleName()
                + ") registrada correctamente.");
    }

    public ArrayList<Bicicleta> buscarPorCodigo(String codigo) {
        ArrayList<Bicicleta> encontradas = new ArrayList<Bicicleta>();
        for (int i = 0; i < bicicletas.size(); i++) {
            Bicicleta b = bicicletas.get(i);
            if (b.getCodigo().equalsIgnoreCase(codigo)) {
                encontradas.add(b);
            }
        }
        return encontradas;
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }
}
package Brandon.Romero.Productos;

public class NoteBook  extends Productos{
    private  int marca;

    public NoteBook (int marca){
        this.marca =marca;
    }


    @Override
    public double calacularPrecio() {
        double [] precios = {0,5000,4500};

        if (marca >= 1 && marca <= 2) {
            return precios[marca];
        } else {
            // Marca no válida
            return 0;
        }

    }
}

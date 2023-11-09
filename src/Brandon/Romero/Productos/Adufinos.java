package Brandon.Romero.Productos;

public class Adufinos extends Productos {

    private  int marca;

    public Adufinos(int marca){
        this.marca =marca;
    }


    @Override
    public double calacularPrecio() {
        double [] precios = {0,1000,1500,2500,3000,2500,1200};

        if (marca >= 1 && marca <= 5) {
            return precios[marca];
        }

        return 0;
    }
}

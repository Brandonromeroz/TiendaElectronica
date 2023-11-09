package Brandon.Romero.Productos;

public class Memoria extends Productos{
    private  int marca;

    public Memoria(int marca){
        this.marca =marca;
    }


    @Override
    public double calacularPrecio() {
        double [] precios = {0,500,400,600,300};

        if (marca >= 1 && marca <= 5) {
            return precios[marca];
        }

        return 0;
    }
}

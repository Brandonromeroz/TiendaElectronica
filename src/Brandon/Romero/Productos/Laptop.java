package Brandon.Romero.Productos;

public class Laptop extends Productos{
    private  int marca;

    public Laptop (int marca){
        this.marca = marca;
    }
    @Override
    public double calacularPrecio() {
        double[] precios = {0, 12000, 15000, 18000, 19000, 16000, 17000};

        if (marca >= 1 && marca <= 6) {
            return precios[marca];
        }
return 0;
    }
}

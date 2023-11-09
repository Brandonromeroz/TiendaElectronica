package Brandon.Romero.Productos;

public class PC extends Productos{
    private  int marca;

    public PC (int marca){
        this.marca = marca;
    }

    @Override
    public double calacularPrecio() {
        double[] precios = {0, 9000, 15000, 18000, 19000, 16000, 17000};

        if (marca >= 1 && marca <= 6) {
            return precios[marca];
        } else {
            // Marca no válida
            return 0;
        }
    }
}

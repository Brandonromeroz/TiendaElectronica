package Brandon.Romero.Productos;

public class Telefono extends Productos{
    private int  marca;
    public Telefono (int marca){
        this.marca = marca;
    }
    @Override
    public double calacularPrecio() {
        double[] precios = {0, 3000, 5000,5000,4500,19000,8000};

        if (marca >= 1 && marca <= 6) {
            return precios[marca];
        } else {
            // Marca no válida
            return 0;
        }
    }
}

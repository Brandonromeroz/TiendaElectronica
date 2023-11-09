package Brandon.Romero.Productos;

public class Tableta extends Productos {
    private int  marca;
    public Tableta (int marca){
        this.marca = marca;
    }
    @Override
    public double calacularPrecio() {
        double[] precios = {0, 3000, 5000,5000,4500};

        if (marca >= 1 && marca <= 4) {
            return precios[marca];
        } else {
            // Marca no válida
            return 0;
        }
    }
}

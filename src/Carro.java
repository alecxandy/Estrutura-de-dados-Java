public class Carro {

    private String modelo, cor;

    public Carro(String modelo, String cor) {

        this.modelo = modelo;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return modelo + " " + cor;
    }
}

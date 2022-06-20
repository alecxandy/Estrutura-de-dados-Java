public class Carro implements Comparable<Carro> {

    private String modelo, cor;

    public Carro(String modelo, String cor) {

        this.modelo = modelo;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return modelo + " " + cor;
    }

    @Override
    public int compareTo(Carro o) {//

        if (this.modelo.length() < o.modelo.length()) {
            return -1;
        } else if (this.modelo.length() > o.modelo.length()) {
            return 1;
        }
        return 0;
    }
}

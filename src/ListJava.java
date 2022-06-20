import java.util.ArrayList;
import java.util.List;

public class ListJava {
    public static void main(String[] args) {
        List<Carro> list = new ArrayList<>();

        list.add(new Carro("Fusca", "Vermelha"));
        list.add(new Carro("Uno", "Rosa"));
        list.add(new Carro("Chevet", "Azul"));

        //retorna o elemento do indice
        System.out.println(list.get(2));

        //retorna em qual indice se encontra esse objeto
        System.out.println(list.indexOf(new Carro("Ferrari", "Amarela")));

        //se contem o elemento passado no parametro
        System.out.println(list.contains(new Carro("Ferrari","Amarelo")));

    }
}

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetJava {

    public static void main(String[] args) {

        //hasSet não tem ordem
        Set<Carro> carroSet = new HashSet<>();
        carroSet.add(new Carro("Fusca", "azul"));
        carroSet.add(new Carro("Chevet", "vermelho"));
        carroSet.add(new Carro("Brasilia", "rosa"));
        System.out.println(carroSet);


        //TreeSet: estrutura de arvore
        //necessario implementar o method comparaTo
        Set<Carro> carroSet2 = new TreeSet<Carro>();
        carroSet2.add(new Carro("Fusca", "azul"));
        carroSet2.add(new Carro("Chevet", "vermelho"));
        carroSet2.add(new Carro("Brasilia", "rosa"));
        System.out.println(carroSet2);

    }
}

import java.util.LinkedList;
import java.util.Queue;

public class QueueJava {
    public static void main(String[] args) {

        //FILA
        Queue<Carro> carroQueue = new LinkedList<Carro>();

        //add = retorna true caso consiga adicionar
        System.out.println(carroQueue.add(new Carro("Fusca", "Azul")));

        //offer: difere do add pq ele não causa erro de retorno quando for inserido
        System.out.println(carroQueue.offer(new Carro("Brasilia", "Rosa")));

        //retorna o primeiro elemento da fila caso vazio retorna null
        System.out.println(carroQueue.peek());

        //retorna o primeiro elemento da lista e remove
        System.out.println(carroQueue.poll());


    }
}

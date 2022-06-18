import java.util.Stack;

public class StackJava {
    public static void main(String[] args) {

        Stack<Carro> stack = new Stack<>();

        stack.push(new Carro("fusca", "preto"));
        stack.push(new Carro("Uno", "prata"));
        stack.push(new Carro("Chevet", "vermelho"));
        stack.push(new Carro("Brasilia", "amarela"));

        System.out.println(stack);// push: add no final da lista
        System.out.println(stack.pop());// pop: retira o ultimo da lista
        System.out.println(stack.peek()); // exibir
        System.out.println(stack);// empty: retorna true se estiver vazio


    }
}

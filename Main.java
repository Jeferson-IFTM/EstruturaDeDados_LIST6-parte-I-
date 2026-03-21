public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(2);

        System.out.println("Inserção");
        list.addLast(10);
        list.addLast(20);
        list.addFirst(5);
        list.insertAt(2, 15);
        list.display();

        System.out.println("\n Busca e Update");
        System.out.println("Índice do elemento 20: " + list.find(20));
        list.set(1, 12);
        list.display();

        System.out.println("\n Remoção");
        list.removeFirst();
        list.removeAt(1);
        list.display();
    }
}
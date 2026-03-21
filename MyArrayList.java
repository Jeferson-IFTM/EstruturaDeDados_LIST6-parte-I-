public class MyArrayList {
    private int[] data;
    private int size;
    private int capacity;

    public MyArrayList(int initialCapacity) {
        this.capacity = initialCapacity;
        this.data = new int[capacity];
        this.size = 0;
    }

    private void reallocate() {
        capacity *= 2;
        int[] newData = new int[capacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }


    public void addLast(int element) {
        if (size == capacity) reallocate();
        data[size++] = element;
    }

    public void addFirst(int element) {
        insertAt(0, element);
    }

    public void insertAt(int index, int element) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Índice inválido");
        if (size == capacity) reallocate();

        // Lógica de Shift para a Direita
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element;
        size++;
    }


    public int removeAt(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Índice inválido");
        int removed = data[index];

        // Lógica de Shift para a Esquerda
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return removed;
    }

    public int removeFirst() { return removeAt(0); }
    public int removeLast() { return removeAt(size - 1); }


    public int get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return data[index];
    }

    public void set(int index, int element) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        data[index] = element;
    }

    public int find(int element) {
        for (int i = 0; i < size; i++) {
            if (data[i] == element) return i;
        }
        return -1;
    }

    public void display() {
        System.out.print("Lista: [");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + (i == size - 1 ? "" : ", "));
        }
        System.out.println("] | Tamanho: " + size + " | Capacidade: " + capacity);
    }
}
package Fun.oct10;

public class FixedCapacityStack<Item> {
    private int N = 0;
    private final Item[] array;

    public FixedCapacityStack(int size) {
        array = (Item[]) new Object[size];
    }

    public void push(Item s){
        array[N++] = s;
    }

    public Item pop(){
        return array[--N];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }


}

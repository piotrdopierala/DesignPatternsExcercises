import java.util.LinkedList;
import java.util.List;

public class SinglyLinkedList<T> implements ImplementorLinkedList<T> {

    private List<T> list = new LinkedList<>();

    @Override
    public void addFirst(T obj) {
        list.add(0,obj);
    }

    @Override
    public T removeFirst() {
        T removedObj = list.get(0);
        list.remove(0);
        return removedObj;
    }

    @Override
    public void addLast(T obj) {
        list.add(list.size()-1,obj);

    }

    @Override
    public T removeLast() {
        T removedObj = list.get(list.size()-1);
        list.remove(list.size()-1);
        return removedObj;
    }
}

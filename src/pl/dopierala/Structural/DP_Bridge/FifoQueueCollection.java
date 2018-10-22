public class FifoQueueCollection<T> implements FifoQueue<T>{

    SinglyLinkedList<T> list = new SinglyLinkedList<T>();

    @Override
    public void offer(T obj) {
        list.addLast(obj);
    }

    @Override
    public T pool() {
        return list.removeFirst();
    }
}

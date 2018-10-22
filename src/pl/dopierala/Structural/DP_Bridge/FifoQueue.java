public interface FifoQueue<T> {
    public abstract void offer(T obj);

    public abstract T pool();
}

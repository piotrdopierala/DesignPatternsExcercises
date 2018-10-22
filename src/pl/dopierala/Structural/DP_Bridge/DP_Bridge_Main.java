public class DP_Bridge_Main {
    public static void main(String[] args) {
        FifoQueue<Integer> fq = new FifoQueueCollection<>();
        fq.offer(1);
        fq.offer(2);
        fq.offer(3);
        int pooledObject = fq.pool();
        System.out.println("Odebralem: "+pooledObject);
    }
}

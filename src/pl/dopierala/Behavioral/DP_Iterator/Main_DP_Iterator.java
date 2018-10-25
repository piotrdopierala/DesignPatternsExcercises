package pl.dopierala.Behavioral.DP_Iterator;

public class Main_DP_Iterator {
    public static void main(String[] args) {
        Iterator<ThemeColor> iter = ThemeColor.getIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}

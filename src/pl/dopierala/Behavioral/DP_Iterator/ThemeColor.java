package pl.dopierala.Behavioral.DP_Iterator;

import java.util.ArrayList;
import java.util.List;

public enum ThemeColor {
    RED, GREEN, ORANGE,BLACK,WHITE;

    public static Iterator<ThemeColor> getIterator(){
        return new ThemeColorIterator();
    }

    private static class ThemeColorIterator implements Iterator<ThemeColor>{

        private int position;

        public ThemeColor next() {
            return ThemeColor.values()[position++];
        }

        public boolean hasNext(){
            return position < ThemeColor.values().length;
        }
    }
}

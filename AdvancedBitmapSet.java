public class AdvancedBitmapSet extends BitmapSet {

    public AdvancedBitmapSet(int size, int wert) {
        super(size);
        for (int i = 0; i <= wert && i < size; i++) {
            add(i);
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int add(int unten, int oben) {
        if (unten < 0 || oben > super.bitmap.length || unten >= oben) {
            return -1;
        }
        for (int i = unten + 1; i < oben; i++) {
            super.add(i);
        }
        return 0;
    }
}